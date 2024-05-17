ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.12.18"

lazy val root = (project in file("."))
  .settings(
    name := "ittf-scores"
  )

val SparkVersion = "3.3.1"
val ScalaTestVersion = "3.2.11"
val MockitoVersion = "1.16.23"
val Log4jVersion = "13.1.0"
val Log4jCoreVersion = "2.19.0"
val DropwizardVersion = "4.1.21"

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % SparkVersion % Compile,
  "org.apache.spark" %% "spark-sql" % SparkVersion % Compile,
  "org.scalatest" %% "scalatest" % ScalaTestVersion % Test,
  "org.apache.logging.log4j" %% "log4j-api-scala" % Log4jVersion,
  "org.apache.logging.log4j" % "log4j-core" % Log4jCoreVersion % Runtime,
  "io.dropwizard.metrics" % "metrics-core" % DropwizardVersion
)

ThisBuild / assemblyMergeStrategy := {
  case PathList("META-INF", _*) => MergeStrategy.discard
  case _ => MergeStrategy.first
}
