package Lecture31

object intsets extends App{
 // println("Welcome to Scala Worksheet")
  val t1 = new NonEmpty(3, new Empty, new Empty)
  var t2 = t1 incl 4
  t2 = t2 incl 5
  t2 = t2 incl 2
  t2 = t2 incl -1
 // print(t2.toString)

  val t3 = new NonEmpty(10, new Empty, new Empty)
  var t4 = t3 incl 15
  t4 = t4 incl 13
  t4 = t4 incl -6
  t4 = t4 incl -7
  t4 = t4 incl 0

 println(t2.toString)
  println(t2.incl(0).toString)




}
