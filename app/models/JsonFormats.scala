package models

import play.api.libs.json.Json

/**
  * Created by Le'novo on 2017/7/2.
  */
object JsonFormats {

  // Common
  implicit val newsFormat = Json.format[News]



}
