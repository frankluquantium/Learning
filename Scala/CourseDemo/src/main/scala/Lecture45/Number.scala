package Lecture45

case class Number(n : Int) extends  Expr{
  def isNumber:Boolean = true
  def isSum: Boolean = false
  def numValue: Int = n
  def leftOp: Expr = throw new Error("Numnber.leftOp")
  def rightOp: Expr = throw new Error("Numnber.rightOp")
}
/*
object Number {
  def apply(n:Int) = new Number(n)
}*/
