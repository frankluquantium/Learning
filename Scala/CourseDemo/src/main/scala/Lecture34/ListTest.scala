package Lecture34

object ListTest extends App{
  def nth[T](n: Int, xs:List[T]) : T =
    if (n == 0) xs.head
    else nth(n-1,xs.tail)

  var mylist = new Cons(1,new Cons(2, new Cons(3,new Nil)))

  /*def singleton[T] (elem:T) =  new Cons[T](elem, new Nil[T])
  singleton[Int](1) foreach println*/
  mylist foreach println

  var testlist = ListCons.apply(1,"asdad")
  testlist = ListCons.apply(2,testlist )

  testlist foreach println
}
