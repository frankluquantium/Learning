object rationals{
  val x = 4
}

class Rational(x:Int, y:Int){
  def numer = x
  def denom = y

  def add(that: Rational) =
    new Rational(numer * that.denom + denom * that.numer, that.denom*denom)

  override def toString = numer + "/" + denom
}