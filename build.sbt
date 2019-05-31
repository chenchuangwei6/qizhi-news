name := """qizhi-news"""

version := "1.0.0"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

resolvers += Resolver.sonatypeRepo("snapshots")

scalaVersion := "2.12.2"

libraryDependencies ++= Seq(
  guice, ws,
  "org.scalatestplus.play" %% "scalatestplus-play" % "3.0.0" % Test,
  "org.reactivemongo" % "play2-reactivemongo_2.12" % "0.12.5-play26",
  "org.reactivemongo" %% "reactivemongo-akkastream" % "0.12.5"
)