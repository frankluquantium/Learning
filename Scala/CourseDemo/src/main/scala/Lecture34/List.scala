package Lecture34

trait List [T]{
  def isEmpty : Boolean
  def head : T
  def tail : List[T]

  def foreach(f: T => Unit): Unit =
    if (!isEmpty) {
      f(head)

      tail.foreach(f)
    }
}
