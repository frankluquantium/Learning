//import org.apache.hadoop.hive.ql.exec.spark.session.SparkSession
import org.apache.spark.SparkContext
import org.apache.spark.SparkConf
import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.Dataset
import org.apache.spark.rdd.RDD

object WordCount {
  def main(args: Array[String]) {
    val appName = "WordCount"
    val master = "local"
    val conf = new SparkConf().setAppName(appName).setMaster(master)
    val sc = new SparkContext(conf)
    val outputfile = "c:\\DataFile\\Output22"
  /*
    val data = Array(1, 2, 3, 4, 5)
    val distData = sc.parallelize(data)

    val lines = sc.textFile("c:\\DataFile\\data.txt")

    val pairs = lines.mapPartitions(iter => {iter.map(s => (s,1))})

    val counts = pairs.reduceByKey((a,b) => a + b)

    val rdd1 = sc.parallelize(Seq(("k1",1),("k2",2),("k1",3),("k2",3),("k3",4)))

    val output = rdd1.groupBy{ x =>
        if ((x._2 % 2) == 0) {
          "evennumbers"
        }
      else{
          "oddnumbers"
        }
    }
  */
    /*
    val keysWithValuesList = Array("foo=A", "foo=A", "foo=A", "foo=A", "foo=B", "bar=C", "bar=D", "bar=D")
    val data = sc.parallelize(keysWithValuesList)
    */
    //Create key value pairs
    /*val kv = data.map(_.split("=")).map(v => (v(0), v(1))).cache()

    val initialSet = mutable.HashSet.empty[String]
    val addToSet = (s: mutable.HashSet[String], v: String) => s += v
    val mergePartitionSets = (p1: mutable.HashSet[String], p2: mutable.HashSet[String]) => p1 ++= p2

    val uniqueByKey = kv.aggregateByKey(initialSet)(addToSet, mergePartitionSets)

    uniqueByKey.saveAsTextFile(outputfile)*/
    /*
    print(lines.first())

    val words = lines.flatMap(line => line.split(" "))



    /*val lineLengths = lines.map(s => s.length)*/

    val sample = words.map(word=>(word,1)).reduceByKey{case(x,y)=>x+y}

    sample.saveAsTextFile(outputfile)
  */


    val spark = SparkSession.builder()
      .appName("appName")
      .config("spark.some.config.option", "some-value")
      .config("setMaster", "local")
      .getOrCreate()




    val df = spark.read.json("C:\\Users\\Flu\\Documents\\spark\\examples\\src\\main\\resources\\people.json")


    case class Person(name: String, age: Long)
    val caseClassDS =  spark.sparkContext.parallelize(Seq(Person("Andy", 32)))

    caseClassDS.

    //df.rdd.filter(a => true).toDS()

    //caseClassDS.toDS()
  }
}
