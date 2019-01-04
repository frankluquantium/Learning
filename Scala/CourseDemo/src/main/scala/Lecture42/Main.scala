package Lecture42

object Main extends App{
  val f = new Function1[Int,Int] {
    def apply(x:Int) = x * x
    def anotherapply(x:Int) = x * 2
  }

  println(f.anotherapply(7))
  println(f.apply(7))

  println(List.apply(5,2))
}
