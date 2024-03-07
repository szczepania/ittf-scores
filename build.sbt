ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.13"

lazy val root = (project in file("."))
  .settings(
    name := "ittf-scores"
  )

val SparkVersion = "3.5.0"
val ScalaTestVersion = "3.2.11"
val MockitoVersion = "1.16.23"

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % SparkVersion % Provided,
  "org.apache.spark" %% "spark-sql" % SparkVersion % Provided,
  "org.scalatest" %% "scalatest" % ScalaTestVersion % Test,
  "org.mockito" %% "mockito-scala" % MockitoVersion % Test
)
