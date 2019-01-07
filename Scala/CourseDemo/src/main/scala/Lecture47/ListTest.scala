package Lecture47

object ListTest extends App{
  def isort(xs: List[Int]):List[Int] = xs match {
    case List() => List()
    case y::ys => {insert(y,isort(ys)) }
  }

  def insert(x:Int,xs:List[Int]):List[Int] = xs match{
    case List() => List(x)
    case y::ys => if (x <= y) x::xs else y::insert(x,ys)
  }

  val l1 = List(3,5,8,4)
  //println(isort(l1))

  val list2 = List("a".charAt(0),"a".charAt(0),"b".charAt(0),"b".charAt(0),"b".charAt(0))

  def times(chars: List[Char]): List[(Char, Int)] = {
    def incr(acc:Map[Char, Int], c:Char) = {
    //  println("test:" + acc.toString())
      val count = (acc get c).getOrElse(0) + 1
      acc + ((c, count))
    }
    (Map[Char,Int]() /: chars)(incr).iterator.toList

  }
  //println(times(list2))
    list2.iterator foreach println
}
