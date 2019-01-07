package Lecture45

case class Sum(e1: Expr, e2: Expr) extends  Expr{
  def isNumber: Boolean = false
  def isSum:Boolean = true
  def numValue : Int = throw new Error("Sumn.numValue")
  def leftOp: Expr = e1
  def rightOp: Expr = e2
}
/*
object Sum{
  def apply(e1:Expr, e2:Expr) = new Sum(e1,e2)
}*/