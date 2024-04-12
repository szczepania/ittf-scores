package org.utils

import org.apache.spark.sql.SparkSession

object SparkUtils {

  val spark = SparkSession
    .builder()
    .appName("Table tennis players ranking application")
    .getOrCreate()
}
