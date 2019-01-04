package recfun

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      print(" "* (10-row))
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }

    /*Exercise 2*/
    val mychar = "(just an) example"
    val list : List[Char] = mychar.toList
    //list.foreach(println)
    println(balance(list))

    /*Exercise 3*/
    val ways = countChange(6,List(1,2,3))
    println("There are totally " + ways.toString + " ways")
  }

  /**
   * Exercise 1
   */

    def pascal(c: Int, r: Int): Int =
      if (r == 0 || c == 0 || r==c) 1
      else pascal(c-1,r-1) + pascal(c,r-1)
  /**
   * Exercise 2
   */

    def balance(chars: List[Char]): Boolean =
    {
      val open = "(".toCharArray.head
      val close = ")".toCharArray.head
      var opencount = 0
      var closecount = 0
      var breakflag = true
      var i = 0
      while (i < chars.length)
      {
        if (chars(i) == open) opencount = opencount + 1
        else if (chars(i) == close) closecount = closecount + 1

        if (closecount > opencount)
          {
            breakflag = false
          }
        i = i + 1
      }

      if (breakflag && opencount == closecount)
        return true
      else
          return false
    }

  /**
   * Exercise 3
   */

    def countChange(money: Int, coins: List[Int]): Int =
    {
      var coinsdis = coins.distinct
      var ways :Int = 0
      countways(money,coinsdis,"")

      def countways(money: Int, coins: List[Int],output: String): Unit =
      {
        var i : Int = 0
        while (i <= money / coins.head)
        {
          // countChange(money - (i *coinsdis.head), coinsdis.splitAt(1)._2)
          if (money - (i *coins.head) == 0)
          {
            ways = ways + 1
            println("Solution " + ways.toString + ":" + output + coins.head.toString + ("+" + coins.head.toString  )* (i-1))
          }
          else if (coins.splitAt(1)._2.length > 0)
            countways(money - (i *coins.head), coins.splitAt(1)._2, output+(coins.head.toString + "+")*i)
          i = i + 1
        }
      }
        //print(ways)
       // print(ways)
        return ways
    }

  }
