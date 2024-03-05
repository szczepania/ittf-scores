package utils

import org.apache.spark.sql.DataFrame
import utils.SparkUtils.spark

object FileUtils {

  def readFiles(file: String): DataFrame = {
    spark
      .read
      .option("inferSchema", "true")
      .option("header", "true")
      .csv(file)
  }

}
