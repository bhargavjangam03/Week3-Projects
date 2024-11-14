ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.15"

lazy val root = (project in file("."))
  .settings(
    name := "VisitorService",
    libraryDependencies ++= Seq(
      "com.typesafe.play" %% "play-json" % "2.9.2",
      "org.apache.kafka" % "kafka-clients" % "3.4.0", // Kafka client
      "org.playframework" %% "play-slick" % "6.1.0",    // Enables working with the database
      "org.playframework" %% "play-slick-evolutions" % "6.1.0",    // Database migrations support, similar to Flyway
      "mysql" % "mysql-connector-java" % "8.0.26",
      "org.scalatestplus.play" %% "scalatestplus-play" % "7.0.0" % Test,
      "com.google.inject" % "guice" % "5.1.0" // Guice dependency
    )
  )
