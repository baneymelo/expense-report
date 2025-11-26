val scala3Version = "3.7.4"

lazy val root = project
  .in(file("."))
  .settings(
    name := "expense-report",
    version := "0.1.0-SNAPSHOT",

    scalaVersion := scala3Version,

    libraryDependencies ++= Seq(
      "org.scalatest" %% "scalatest" % "3.2.19",
      "org.slf4j" % "slf4j-api" % "2.0.9",
      "org.projectlombok" % "lombok" % "1.16.16"
  ))
