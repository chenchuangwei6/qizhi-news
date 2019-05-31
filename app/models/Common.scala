package models

import java.time.OffsetDateTime

case class News(_id: String, title: String, image: Option[String], intro: String, content: Option[String], category: Option[String], isRecommended: Option[Boolean], createTime: OffsetDateTime, updateTime: OffsetDateTime, generateDateTime: Option[OffsetDateTime])
