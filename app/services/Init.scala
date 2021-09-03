package services

import models.News
import play.api.libs.json.Json
import play.cache.CacheApi
import play.modules.reactivemongo.ReactiveMongoApi
import reactivemongo.play.json.collection.JSONCollection
import javax.inject.{Inject, Singleton}
import scala.concurrent.ExecutionContext
import reactivemongo.play.json._
import models.JsonFormats._


@Singleton
class Init @Inject()(cache: CacheApi, reactiveMongoApi: ReactiveMongoApi) (implicit ec: ExecutionContext) {
  def newsColFuture = reactiveMongoApi.database.map(_.collection[JSONCollection]("common-news"))
  for {
    newsCol <- newsColFuture
    news <- newsCol.find(Json.obj())
      .sort(Json.obj("updateTime" -> -1)).cursor[News]().collect[List]()
  } yield {
    println(s"=========================: ${news.size}")
    news.foreach(newItem => {
      cache.set(newItem._id, newItem)
    })
    println(s"=========================: end")
  }

}
