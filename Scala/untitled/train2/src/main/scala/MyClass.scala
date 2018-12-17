import org.apache.spark.SparkContext
import  org.apache.spark.SparkConf
import org.apache.spark.rdd.RDD

class MyClass {
  val field = "Hello"


  def doStuff(rdd:RDD[String]):RDD[String] = {
      val field_ = RDD.toString
      rdd.map(x => field_ + x)
  }
}
