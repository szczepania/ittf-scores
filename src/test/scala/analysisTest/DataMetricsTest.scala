package analysisTest

import org.analysis.DataMetrics
import utils.SparkSessionWrapperTest

class DataMetricsTest extends SparkSessionWrapperTest {
  val genderCalculator = DataMetrics

  "calculateGenderPercentage" should "return 50 for a balanced gender distribution" in {
    val result = genderCalculator.calculatePercentageOccurrence(testDF, "gender", "Female")

    result shouldEqual 50
  }

  it should "return 0 if total players count is equal to 0" in {
    val result = genderCalculator.calculatePercentageOccurrence(emptyDF, "gender", "Female")

    result shouldEqual 0
  }

  it should "return 0 if specified gender is not presented in DataFrame" in {
    val result = genderCalculator.calculatePercentageOccurrence(testDF, "gender", "Non-binary")

    result shouldEqual 0
  }

}
