import org.apache.spark.{SparkConf, SparkContext}
import org.apache.spark.sql
import org.apache.spark.sql.SparkSession


object ClaimData {
  def main(args: Array[String]): Unit = {
    val appname = "ClaimData"
    val masterurl =  "local"
    val spark = SparkSession.builder()
      .appName(appname)
      .master(masterurl)
      .getOrCreate()
    import spark.implicits._
    import spark.sql
/*
    val TableQuery = "CREATE  TABLE IF NOT EXISTS ClaimProfiling" +
      "(MONTH_KEY INT" +
      ",CLAIM_ID STRING" +
      ",CLAIM_LINE_NO STRING" +
      ",ENTITY_NO STRING"+
      ",MEM_NO STRING" +
      ",EPISODE_KEY STRING" +
      ",SERVICE_DATE TIMESTAMP" +
      ",DEG_CODE STRING" +
      ",CLAIM_LINE_EVENT_ID STRING" +
      ",ACG STRING" +
      ",RUB_DESC STRING" +
      ",BILLING_PRACTICE_NO STRING" +
      ",PRIMARY_ICD STRING" +
      ",POLICY_REVELATION_ID int" +
      ",POLICY_REVELATION_DESCR STRING" +
      ",PROC_CD STRING" +
      ",CD_SCHEMA STRING" +
      ",AMT_CLAIMED DOUBLE" +
      ",AMT_PAID DOUBLE" +
      ",QUANTITY DOUBLE" +
      ",QUANTITY_UNIT_DESCR STRING" +
      ",NAPPI_CD STRING" +
      ",AUDIT_FLAG STRING) "+
      "STORED AS PARQUET"



    //sql(TableQuery)
    //var df0 = spark.sql("show databases")
    //df0.show()

    val df = spark.read.format("csv").option("header", "true").option("inferSchema", "true").load("C:\\DataFile\\Claims\\ClaimLineDelta2018M11.csv")
    df.createOrReplaceTempView("ClaimProfilingtmp")

    val TableQuery  = "CREATE TABLE IF NOT EXISTS ClaimProfiling " +
      "STORED AS PARQUET AS SELECT * FROM ClaimProfilingtmp WHERE 1=2"

    //spark.sql(TableQuery)


    var ds = spark.sql("SELECT COUNT(1), CLAIM_ID FROM ClaimProfiling where CLAIM_ID = 0 OR CLAIM_ID IS NULL group by CLAIM_ID")
    //val ds = spark.sql("DESCRIBE ClaimProfiling")
    ds.show()


   val df2 = spark.read.format("csv").option("header", "true").option("inferSchema", "true").load("C:\\DataFile\\Claims\\ClaimLineDelta2018M02.csv")

    df2.toDF("MONTH_KEY","CLAIM_ID","CLAIM_LINE_NO","ENTITY_NO","MEM_NO","EPISODE_KEY","SERVICE_DATE"
            ,"DEG_CODE","CLAIM_LINE_EVENT_ID","ACG","RUB_DESC","BILLING_PRACTICE_NO","PRIMARY_ICD","POLICY_REVELATION_ID"
            ,"POLICY_REVELATION_DESCR","PROC_CD","CD_SCHEMA","AMT_CLAIMED","AMT_PAID","QUANTITY","QUANTITY_UNIT_DESCR"
            ,"NAPPI_CD","AUDIT_FLAG")
    ds = spark.sql("SELECT COUNT(1), CLAIM_ID FROM ClaimProfiling where CLAIM_ID = 0 OR CLAIM_ID IS NULL group by CLAIM_ID")
    //val ds = spark.sql("DESCRIBE ClaimProfiling")
    ds.show()*/
  /*
    val df = spark.sql("SELECT * FROM ClaimProfiling LIMIT 100")
    df.show()*/
  }
}
