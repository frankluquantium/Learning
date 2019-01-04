package Lecture32

object rationals {
    def main(args: Array[String]):Unit = {
      /*val x = new Rational(1,3)
      val y = new Rational(5,7)
      val z = new Rational(3,2)
      println(x.add(y).toString)
      println(z.max(y).toString)
    */

      type Set = Int => Boolean

      def contains(s: Set, elem: Int): Boolean = s(elem)

      var s = Set (6)
      s = s + 9
      s = s + 12
      s = s + 15
      s = s + 18
      println(contains(s,12))

      def singletonSet(elem: Int): Set = (x:Int) => x == elem

      val singleset = singletonSet(6)

      def union(s: Set, t: Set): Set = (x:Int) => s(x) | t(x)

      def intersect(s: Set, t: Set): Set = (x:Int) => s(x) & t(x)

      //println(contains(union(singleset,s),12))

      //println(contains(intersect(singleset,s),12))

      val bound = 50

      /**
        * Returns whether all bounded integers within `s` satisfy `p`.
        */
      /*
      def forall(s: Set, p: Int => Boolean): Boolean = {
        def iter(a: Int): Boolean = {
          if (a > bound & p(a)) true
          else if (s(a) & ! p(a)) false
          else iter(a + 1)
        }
        iter(-bound)
      }

      println(forall(s,s))
    */
      val st = for (i <- 1 to 5) yield i * 2
      println(st)
    }
}
