
// @GENERATOR:play-routes-compiler
// @SOURCE:E:/qizhi/qizhi-news/conf/routes
// @DATE:Fri May 31 16:23:57 CST 2019

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:5
  NewsController_1: controllers.NewsController,
  // @LINE:18
  Assets_0: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:5
    NewsController_1: controllers.NewsController,
    // @LINE:18
    Assets_0: controllers.Assets
  ) = this(errorHandler, NewsController_1, Assets_0, "/")

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, NewsController_1, Assets_0, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.NewsController.login"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """doLogin""", """controllers.NewsController.doLogin(password:String)"""),
    ("""GET""", this.prefix, """controllers.NewsController.index(page:Int ?= 1, isRecommended:Boolean ?= false)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """add""", """controllers.NewsController.add"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """edit""", """controllers.NewsController.edit(_id:String, isRecommended:Boolean, category:String ?= "default", page:Int, isRecommendedEdit:Boolean ?= false)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """add""", """controllers.NewsController.doAdd"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """generateToFile""", """controllers.NewsController.generateToFile"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """remove""", """controllers.NewsController.remove(_id:String, isRecommended:Boolean ?= false)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """recommended""", """controllers.NewsController.recommended(_id:String, isRecommendedc:Boolean, page:Int ?= 1, isRecommended:Boolean ?= false)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """msg""", """controllers.NewsController.msg(msg:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """newsList""", """controllers.NewsController.newList"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:5
  private[this] lazy val controllers_NewsController_login0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_NewsController_login0_invoker = createInvoker(
    NewsController_1.login,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.NewsController",
      "login",
      Nil,
      "GET",
      this.prefix + """login""",
      """""",
      Seq()
    )
  )

  // @LINE:6
  private[this] lazy val controllers_NewsController_doLogin1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("doLogin")))
  )
  private[this] lazy val controllers_NewsController_doLogin1_invoker = createInvoker(
    NewsController_1.doLogin(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.NewsController",
      "doLogin",
      Seq(classOf[String]),
      "GET",
      this.prefix + """doLogin""",
      """""",
      Seq()
    )
  )

  // @LINE:7
  private[this] lazy val controllers_NewsController_index2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_NewsController_index2_invoker = createInvoker(
    NewsController_1.index(fakeValue[Int], fakeValue[Boolean]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.NewsController",
      "index",
      Seq(classOf[Int], classOf[Boolean]),
      "GET",
      this.prefix + """""",
      """""",
      Seq()
    )
  )

  // @LINE:8
  private[this] lazy val controllers_NewsController_add3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("add")))
  )
  private[this] lazy val controllers_NewsController_add3_invoker = createInvoker(
    NewsController_1.add,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.NewsController",
      "add",
      Nil,
      "GET",
      this.prefix + """add""",
      """""",
      Seq()
    )
  )

  // @LINE:9
  private[this] lazy val controllers_NewsController_edit4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("edit")))
  )
  private[this] lazy val controllers_NewsController_edit4_invoker = createInvoker(
    NewsController_1.edit(fakeValue[String], fakeValue[Boolean], fakeValue[String], fakeValue[Int], fakeValue[Boolean]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.NewsController",
      "edit",
      Seq(classOf[String], classOf[Boolean], classOf[String], classOf[Int], classOf[Boolean]),
      "GET",
      this.prefix + """edit""",
      """""",
      Seq()
    )
  )

  // @LINE:10
  private[this] lazy val controllers_NewsController_doAdd5_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("add")))
  )
  private[this] lazy val controllers_NewsController_doAdd5_invoker = createInvoker(
    NewsController_1.doAdd,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.NewsController",
      "doAdd",
      Nil,
      "POST",
      this.prefix + """add""",
      """""",
      Seq()
    )
  )

  // @LINE:11
  private[this] lazy val controllers_NewsController_generateToFile6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("generateToFile")))
  )
  private[this] lazy val controllers_NewsController_generateToFile6_invoker = createInvoker(
    NewsController_1.generateToFile,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.NewsController",
      "generateToFile",
      Nil,
      "GET",
      this.prefix + """generateToFile""",
      """""",
      Seq()
    )
  )

  // @LINE:12
  private[this] lazy val controllers_NewsController_remove7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("remove")))
  )
  private[this] lazy val controllers_NewsController_remove7_invoker = createInvoker(
    NewsController_1.remove(fakeValue[String], fakeValue[Boolean]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.NewsController",
      "remove",
      Seq(classOf[String], classOf[Boolean]),
      "GET",
      this.prefix + """remove""",
      """""",
      Seq()
    )
  )

  // @LINE:13
  private[this] lazy val controllers_NewsController_recommended8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("recommended")))
  )
  private[this] lazy val controllers_NewsController_recommended8_invoker = createInvoker(
    NewsController_1.recommended(fakeValue[String], fakeValue[Boolean], fakeValue[Int], fakeValue[Boolean]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.NewsController",
      "recommended",
      Seq(classOf[String], classOf[Boolean], classOf[Int], classOf[Boolean]),
      "GET",
      this.prefix + """recommended""",
      """""",
      Seq()
    )
  )

  // @LINE:14
  private[this] lazy val controllers_NewsController_msg9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("msg")))
  )
  private[this] lazy val controllers_NewsController_msg9_invoker = createInvoker(
    NewsController_1.msg(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.NewsController",
      "msg",
      Seq(classOf[String]),
      "GET",
      this.prefix + """msg""",
      """""",
      Seq()
    )
  )

  // @LINE:15
  private[this] lazy val controllers_NewsController_newList10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("newsList")))
  )
  private[this] lazy val controllers_NewsController_newList10_invoker = createInvoker(
    NewsController_1.newList,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.NewsController",
      "newList",
      Nil,
      "GET",
      this.prefix + """newsList""",
      """""",
      Seq()
    )
  )

  // @LINE:18
  private[this] lazy val controllers_Assets_versioned11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned11_invoker = createInvoker(
    Assets_0.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:5
    case controllers_NewsController_login0_route(params) =>
      call { 
        controllers_NewsController_login0_invoker.call(NewsController_1.login)
      }
  
    // @LINE:6
    case controllers_NewsController_doLogin1_route(params) =>
      call(params.fromQuery[String]("password", None)) { (password) =>
        controllers_NewsController_doLogin1_invoker.call(NewsController_1.doLogin(password))
      }
  
    // @LINE:7
    case controllers_NewsController_index2_route(params) =>
      call(params.fromQuery[Int]("page", Some(1)), params.fromQuery[Boolean]("isRecommended", Some(false))) { (page, isRecommended) =>
        controllers_NewsController_index2_invoker.call(NewsController_1.index(page, isRecommended))
      }
  
    // @LINE:8
    case controllers_NewsController_add3_route(params) =>
      call { 
        controllers_NewsController_add3_invoker.call(NewsController_1.add)
      }
  
    // @LINE:9
    case controllers_NewsController_edit4_route(params) =>
      call(params.fromQuery[String]("_id", None), params.fromQuery[Boolean]("isRecommended", None), params.fromQuery[String]("category", Some("default")), params.fromQuery[Int]("page", None), params.fromQuery[Boolean]("isRecommendedEdit", Some(false))) { (_id, isRecommended, category, page, isRecommendedEdit) =>
        controllers_NewsController_edit4_invoker.call(NewsController_1.edit(_id, isRecommended, category, page, isRecommendedEdit))
      }
  
    // @LINE:10
    case controllers_NewsController_doAdd5_route(params) =>
      call { 
        controllers_NewsController_doAdd5_invoker.call(NewsController_1.doAdd)
      }
  
    // @LINE:11
    case controllers_NewsController_generateToFile6_route(params) =>
      call { 
        controllers_NewsController_generateToFile6_invoker.call(NewsController_1.generateToFile)
      }
  
    // @LINE:12
    case controllers_NewsController_remove7_route(params) =>
      call(params.fromQuery[String]("_id", None), params.fromQuery[Boolean]("isRecommended", Some(false))) { (_id, isRecommended) =>
        controllers_NewsController_remove7_invoker.call(NewsController_1.remove(_id, isRecommended))
      }
  
    // @LINE:13
    case controllers_NewsController_recommended8_route(params) =>
      call(params.fromQuery[String]("_id", None), params.fromQuery[Boolean]("isRecommendedc", None), params.fromQuery[Int]("page", Some(1)), params.fromQuery[Boolean]("isRecommended", Some(false))) { (_id, isRecommendedc, page, isRecommended) =>
        controllers_NewsController_recommended8_invoker.call(NewsController_1.recommended(_id, isRecommendedc, page, isRecommended))
      }
  
    // @LINE:14
    case controllers_NewsController_msg9_route(params) =>
      call(params.fromQuery[String]("msg", None)) { (msg) =>
        controllers_NewsController_msg9_invoker.call(NewsController_1.msg(msg))
      }
  
    // @LINE:15
    case controllers_NewsController_newList10_route(params) =>
      call { 
        controllers_NewsController_newList10_invoker.call(NewsController_1.newList)
      }
  
    // @LINE:18
    case controllers_Assets_versioned11_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned11_invoker.call(Assets_0.versioned(path, file))
      }
  }
}
