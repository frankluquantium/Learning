package Lecture45

object Test extends App {
  /*def eval(e: Expr) : Int = {
    if (e.isNumber) e.numValue
    else if (e.isSum) eval(e.leftOp) + eval(e.rightOp)
    else throw new Error("Unkown expression " + e)
  }
  */
  def eval(e: Expr): Int = e match {
    case Number(n) => n
    case Sum(e1, e2) => eval(e1) + eval(e2)
  }

  def show(e: Expr): String = e match {
    case Number(n) => n.toString
    case Sum(e1, e2) => show(e1) + " + " + show(e2)
  }

  val s1 = new Number(7)
  val s2 = new Number(2)
  val ss = new Sum(s1, s2)
  println(eval(ss))
  println(show(ss))

  val fruits = List("apple", "oranges", "pears")
  val fruits2 = "apple" :: ("oranges" :: ("pears" :: Nil))

  println(fruits.equals(fruits2))
}