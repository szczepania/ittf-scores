package utils

import org.scalatest.funsuite.AnyFunSuite
import org.schema.schema.playerInfoSchema
import org.utils.FileUtils.readFiles
import org.utils.SparkUtils.spark

class FileUtilsTest extends AnyFunSuite {

  test("Dataframe should be created from CSV file") {
    readFiles(spark, playerInfoSchema, "src/test/data/ittf_player_info.csv")
  }
}
