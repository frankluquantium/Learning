package Lecture31

class Empty extends IntSet {
  def contains(x:Int):Boolean = false
  def incl(x: Int):IntSet = new NonEmpty(x, new Empty, new Empty)
  def union(other:IntSet):IntSet = other
  override def toString = "."
}
