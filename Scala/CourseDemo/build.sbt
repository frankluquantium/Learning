
name := "CourseDemo"

version := "1.0"

scalaVersion := "2.11.8"

val sparkVersion        = "2.3.0"

libraryDependencies ++= Seq(
  "org.apache.spark"  %% "spark-core"      % sparkVersion,
  "org.apache.spark"  %% "spark-streaming" % sparkVersion,
  "org.apache.spark"  %% "spark-sql"       % sparkVersion,
  "org.apache.spark"  %% "spark-hive"      % sparkVersion,
  "org.apache.spark"  %% "spark-repl"      % sparkVersion)

libraryDependencies += "org.scala-lang.modules" %% "scala-parser-combinators" % "1.0.2"

