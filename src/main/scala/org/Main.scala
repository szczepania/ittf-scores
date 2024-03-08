package org

import org.analysis.DataMetrics.{menPercentageCount, womenPercentageCount}

object Main extends App {

  println(s"Percentage of female is $womenPercentageCount")
  println(s"Percentage of male is $menPercentageCount")
}
