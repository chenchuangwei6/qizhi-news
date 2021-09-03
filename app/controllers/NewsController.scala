package controllers

import java.nio.charset.Charset
import java.nio.file.{Files, Paths}
import javax.inject._
import play.api.data.Form
import play.api.data.Forms.{optional, text, tuple}
import play.api.libs.json.Json
import play.api.mvc.{Action, _}
import play.modules.reactivemongo.ReactiveMongoApi
import reactivemongo.play.json.collection.JSONCollection
import utils.{DateTimeUtil, SftpUtil}
import play.api.data.Forms._
import services.CounterService

import scala.concurrent.{ExecutionContext, Future}
import reactivemongo.play.json._
import models.JsonFormats._
import models.News
import play.api.Configuration
import play.cache.CacheApi
import reactivemongo.api.QueryOpts

import scala.collection.JavaConverters._

@Singleton
class NewsController @Inject()(cc: ControllerComponents, reactiveMongoApi: ReactiveMongoApi, counter: CounterService, config: Configuration, val cache: CacheApi)(implicit ec: ExecutionContext) extends AbstractController(cc) with BaseController{
  def newsColFuture = reactiveMongoApi.database.map(_.collection[JSONCollection]("common-news"))
  val indexPath = config.get[String]("news.index")
  val listPath = config.get[String]("news.list")

  val sftpHost = config.get[String]("sftp.host")
  val sftpPort = config.get[Int]("sftp.port")
  val sftpUser = config.get[String]("sftp.user")
  val sftpPassword = config.get[String]("sftp.password")
  val sftpPath = config.get[String]("sftp.path")

  def index(page: Int, isRecommended: Boolean) = Action.async { implicit request: Request[AnyContent] =>
    val cPage = if(page < 1){1}else{page}
    val query = if(isRecommended){Json.obj("isRecommended" -> true)}else{Json.obj()}
    for {
      newsCol <- newsColFuture
      news <- newsCol.find(query, Json.obj("content" -> 0, "image" -> 0)).sort(Json.obj("updateTime" -> -1)).options(QueryOpts(skipN = (cPage-1) * 15, batchSizeN = 15)).cursor[News]().collect[List](15)
      total <- newsCol.count(Some(query))
    } yield {
      Ok(views.html.index(news, total, cPage, isRecommended))
    }
  }

  def login = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.login())
  }

  def doLogin(password: String) = Action { implicit request: Request[AnyContent] =>
    if(password == "qizhi123"){
      Redirect(routes.NewsController.index(1)).withSession("login" -> "user")
    } else {
      Redirect(routes.NewsController.msg("密码错误！"))
    }
  }

  def add = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.add(None,false, "default", 1, false))
  }

  def generateToFile = Action.async { implicit request: Request[AnyContent] =>
    for {
      newsCol <- newsColFuture
      res <- newsCol.find(
        Json.obj(), Json.obj("_id" -> 1, "image" -> 1, "createTime" -> 1, "updateTime" -> 1, "title" -> 1, "intro" -> 1, "category" -> 1))
        .cursor[News]().collect[List]()//.sort(Json.obj("createTime" -> -1))
    } yield {
      val news = res.sortBy(n => n.createTime).reverse

      Files.write(Paths.get(indexPath + "dongtai.html"), List(views.html.site.newsIndex(news).body).asJava, Charset.forName("utf-8"))
      //Files.write(Paths.get(indexPath + "index.html"), List(views.html.site.newsList(news.filter(_.isRecommended.getOrElse(false) == true)).body).asJava, Charset.forName("utf-8"))
      news.foreach{ n =>
        Files.write(Paths.get(s"${listPath}news-${n._id}.html"), List(views.html.site.news(cache.get[News](n._id)).body).asJava, Charset.forName("utf-8"))
      }

      val sftpUtil = new SftpUtil(sftpHost, sftpPort, sftpUser, sftpPassword, sftpPath);
      sftpUtil.upload(indexPath, listPath)

      Redirect(routes.NewsController.msg("发布成功！"))
    }
  }

  def edit(_id: String, isRecommended: Boolean, category: String, page: Int, isRecommendedEdit :Boolean) = Action.async { implicit request: Request[AnyContent] =>
    Future(Ok(views.html.add(Some(cache.get[News](_id)), isRecommended, category, page, isRecommendedEdit)))
    /*for {
      newsCol <- newsColFuture
      Some(news) <- newsCol.find(Json.obj("_id" -> _id)).one[News]
    } yield {
      Ok(views.html.add(Some(news), isRecommended, category, page, isRecommendedEdit))
    }*/
  }

  def doAdd = Action.async { implicit request: Request[AnyContent] =>
    Form(tuple("_id" -> optional(text), "title" -> nonEmptyText, "image" -> nonEmptyText, "intro" -> nonEmptyText,"content" -> nonEmptyText, "category" -> nonEmptyText, "isRecommended" -> boolean, "page" -> number, "isRecommendedEdit" -> boolean)).bindFromRequest().fold(
      errForm => Future.successful(Ok("您的输入有误！")),
      tuple => {
        val (_idOpt, title, image, intro, content, category, isRecommended, page, isRecommendedEdit) = tuple
        for {
          newsCol <- newsColFuture
          index <- counter.getNextSequence("news-index")
          wr <-  _idOpt match {
            case Some(_id) =>
              val oldNew = cache.get[News](_id)
              cache.set(_id, News(_id, title, Some(image), intro, Some(content), Some(category), Some(false), oldNew.createTime, DateTimeUtil.now(), oldNew.generateDateTime))
              newsCol.update(Json.obj("_id" -> _id), Json.obj("$set" -> Json.obj(
                "title" -> title,
                "image" -> image,
                "intro" -> intro,
                "content" -> content,
                "category" -> category,
                "isRecommended" -> isRecommendedEdit,
                "updateTime" -> DateTimeUtil.now()
              )))
            case None =>
              val newNew = News(index.toString, title, Some(image), intro, Some(content), Some(category), Some(false), DateTimeUtil.now(), DateTimeUtil.now(), None)
              cache.set(newNew._id, newNew)
              newsCol.insert(newNew)
          }
        } yield {
          Redirect(routes.NewsController.index(page, isRecommended))
        }
      }
    )
  }

  def remove(_id: String, isRecommended: Boolean) = Action.async { implicit request: Request[AnyContent] =>
    for {
      newsCol <- newsColFuture
      wr <- newsCol.remove(Json.obj("_id" -> _id))
    } yield {
      cache.remove(_id)
      Redirect(routes.NewsController.index(1, isRecommended))
    }
  }

  def recommended(_id: String, isRecommendedc: Boolean, page: Int, isRecommended: Boolean) = Action.async { implicit request: Request[AnyContent] =>

    for {
      newsCol <- newsColFuture
      wr <- newsCol.update(Json.obj("_id" -> _id), Json.obj("$set" -> Json.obj("isRecommended" -> isRecommendedc)))
    } yield {
      val oldNew = cache.get[News](_id)
      cache.set(_id, News(_id, oldNew.title, oldNew.image, oldNew.intro, oldNew.content, oldNew.category, oldNew.isRecommended, oldNew.createTime, oldNew.updateTime, oldNew.generateDateTime))
      Redirect(routes.NewsController.index(page, isRecommended))
    }
  }

  def msg(msg: String) = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.msg(msg))
  }

  def newList = Action.async { implicit request =>
    for {
      newsCol <- newsColFuture
      news <- newsCol.find(Json.obj()).sort(Json.obj("updateTime" -> -1)).cursor[News]().collect[List]()
    }yield{
      Ok("aaa")
    }
  }

}
