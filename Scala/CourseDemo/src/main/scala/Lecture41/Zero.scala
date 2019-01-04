package Lecture41

object Zero extends Nat{
  def isZero = true
  def predecessor = throw new Error ("0.predecessor")
  def +(that:Nat): Nat = that
  def -(that:Nat): Nat = if(that.isZero) this else throw new Error("Negative Number")
}
