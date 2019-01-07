package Lecture45

trait Expr {
  def isNumber: Boolean
  def isSum:Boolean
  def numValue: Int
  def leftOp: Expr
  def rightOp: Expr

  def eval : Int = this match{
    case Number(n) => n
  }
}
