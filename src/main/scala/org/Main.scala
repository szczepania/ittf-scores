package org

import org.jobs.{CountPlayersByContinentJob, CountPlayersJob}
import org.utils.SparkUtils._

object Main {

  def main(args: Array[String]): Unit = {
    CountPlayersJob.runCountPlayersJob(spark)
    CountPlayersByContinentJob.runCountPlayersByContinentJob(spark)

    spark.stop()
  }
}