package Lecture41

class Succ(n : Nat) extends Nat{
  def isZero = false
  def predecessor = n
  def +(that:Nat): Nat = new Succ(n + that)
  def -(that:Nat): Nat = if (that.isZero) this else n - that.predecessor
}
