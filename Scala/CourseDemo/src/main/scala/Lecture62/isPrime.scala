package Lecture62

object isPrime {
  def isPrime(n:Int):Boolean = (2 until n) forall (d => n % d != 0)
}
