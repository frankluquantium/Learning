package Lecture25

class Rational (x: Int, y:Int){
  require(y != 0, "Denominator must be nonzero")
  private def gcd (a:Int, b: Int) :Int = if (b==0) a else gcd(b,a%b)
  private val g = gcd(x,y)
  def numer = x / g
  def denom = y / g

  def less(that:Rational) = this.numer * that.denom < that.numer * this.denom

  def max(that:Rational):Rational = if (this.less(that)) that else this
  def add(that: Rational) =
    new Rational(numer * that.denom + denom * that.numer, that.denom*denom)

  override def toString = numer + "/" + denom

  def neg : Rational = new Rational(-numer,denom)

}
