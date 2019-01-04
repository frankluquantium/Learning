package funsets

object Main extends App {
  import FunSets._
  val s1 = singletonSet(1)
  println(contains(s1,1))

  var s2 = Set(3)
  s2 += 7
  printSet(s2)
}
