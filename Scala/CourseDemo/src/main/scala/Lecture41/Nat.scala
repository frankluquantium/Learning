package Lecture41

abstract class Nat {
  def isZero: Boolean
  def predecessor: Nat
  def +(that:Nat): Nat
  def -(that:Nat):Nat
  def successor = new Succ(this)
}
