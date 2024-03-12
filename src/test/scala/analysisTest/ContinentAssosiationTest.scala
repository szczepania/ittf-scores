package analysisTest

import org.analysis.ContinentAssosiation
import org.analysis.ContinentAssosiation._
import utils.SparkSessionWrapperTest

class ContinentAssosiationTest extends SparkSessionWrapperTest {
  val countryAssociation = ContinentAssosiation

  "countPlayersByCountry" should "count number of players from specified continent" in {
    val result = countryAssociation.countPlayersByContinent(testDF, europeanISOcodes)

    result shouldEqual 3
  }

  it should "return 0 if total players count is equal to 0" in {
    val result = countryAssociation.countPlayersByContinent(emptyDF, europeanISOcodes)

    result shouldEqual 0
  }

}
