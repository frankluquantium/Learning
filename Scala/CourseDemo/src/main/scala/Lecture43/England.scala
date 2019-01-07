package Lecture43

class England(title :Int,name:String) extends Football(name,country = "England"){
  //def desc (title:Int => Boolean) = type > 10
  type MyType = Int => Boolean
  def superclub = this.title > 10
  //val fun : MyType = superclub

}
