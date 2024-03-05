import analysis.GenderPercentageCalculator._
import utils.FileUtils.readFiles
import org.apache.spark.sql.{DataFrame, SparkSession}

object Main extends App {

  val playerInfoDF = readFiles("data/csv/ittf_player_info.csv")

  val genderColumn = "gender"
  val man = "Male"
  val woman = "Female"

  val womenPercentage = calculateGenderPercentage(playerInfoDF, genderColumn, woman)
  val menPercentage = calculateGenderPercentage(playerInfoDF, genderColumn, man)

  println(s"Percentage of female is $womenPercentage")
  println(s"Percentage of male is $menPercentage")
}
