package Solutions

object ArrayOfNElements extends App {
  def f(num:Int) : List[Int] = {
    val list = Range(0,num,1).toList
//    print(list + "\n")
    list
  }

  println(f(readInt()))
}

