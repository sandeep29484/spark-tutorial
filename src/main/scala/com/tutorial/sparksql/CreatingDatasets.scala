package com.tutorial.sparksql

import com.tutorial.utils.SparkCommon

/**
  * Created by ved on 20/1/16.
  */
object CreatingDatasets {

  val sc = SparkCommon.sparkContext
  val ssc = SparkCommon.sparkSQLContext
  val sqlContext = new org.apache.spark.sql.SQLContext(sc)

  def main(args: Array[String]) {

    import sqlContext.implicits._

    val ds1 = Seq(1, 2, 3).toDS()
    println(ds1.map(_ + 1).collect().mkString(","))


  }
}
