package Solutions

object ReverseAList extends App {
  def f(arr:List[Int]):List[Int] = {
    arr.reverse
  }

  val inputList: List[Int] =
    Iterator
    .continually(scala.io.StdIn.readLine())
    .takeWhile(_.nonEmpty)
    .map(_.toInt)
    .toList

  val result = f(inputList)
  result.foreach(println)

}
