package Lecture44

trait List[+T] {
  def isEmpty: Boolean
  def head: T
  def tail: List[T]
 // def prepend(elem:T) : List[T] = new Cons(elem, this)
}
