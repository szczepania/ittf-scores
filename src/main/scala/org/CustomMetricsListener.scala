package org

import com.codahale.metrics.{Counter, MetricRegistry}
import org.apache.spark.SparkContext
import org.apache.spark.scheduler.{JobSucceeded, SparkListener, SparkListenerJobEnd}

class CustomMetricsListener extends SparkListener {
  private val metricRegistry: MetricRegistry = new MetricRegistry()
  val jobSucceeded: Counter = metricRegistry.counter(MetricRegistry.name("jobSucceeded"))
  val jobFailed: Counter = metricRegistry.counter(MetricRegistry.name("jobFailed"))

  override def onJobEnd(jobEnd: SparkListenerJobEnd): Unit = {
    jobEnd.jobResult match {
      case JobSucceeded => jobSucceeded.inc()
      case _ => jobFailed.inc()
    }
  }

}

object CustomMetricsListener {
  def register(sc: SparkContext): CustomMetricsListener = {
    val listener = new CustomMetricsListener
    sc.addSparkListener(listener)
    listener
  }
}
