package utils

import org.apache.spark.sql.SparkSession

object SparkUtils {

  val spark = SparkSession
    .builder()
    .master("local[*]")
    .getOrCreate()
}
