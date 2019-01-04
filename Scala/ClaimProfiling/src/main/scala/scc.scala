object scc {
  def main(args: Array[String]): Unit = {
    def acc(f : Int => Int, a :Int, b: Int): Int =
    {

      def loop(a:Int, result:Int): Int =
      {
        if (a > b)   result
        else  loop(a+1,f(a)+result)
      }
       loop(a,0)
    }

   
    print(acc(x => x+x,3,5))
  }
}
