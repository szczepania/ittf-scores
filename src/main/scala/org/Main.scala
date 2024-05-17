package org

import org.jobs.{CountPlayersByContinentJob, CountPlayersJob}
import org.utils.SparkUtils._

object Main {

  def main(args: Array[String]): Unit = {

    val customListener = CustomMetricsListener.register(spark.sparkContext)

    CountPlayersJob.runCountPlayersJob(spark)
    CountPlayersByContinentJob.runCountMalePlayersByContinentJob(spark)
    CountPlayersByContinentJob.runCountFemalePlayersByContinentJob(spark)

    spark.stop()

    println(s"Number of succeeded jobs: ${customListener.jobSucceeded.getCount}")
    println(s"Number of failed jobs: ${customListener.jobFailed.getCount}")

  }
}
