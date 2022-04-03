package Solutions

object SumOfOddElements extends App{
  def f(arr: List[Int]) : Int = arr.filter( _ % 2 != 0).sum

  val inputArray = Iterator
    .continually(scala.io.StdIn.readLine())
    .takeWhile(_.nonEmpty)
    .map(_.toInt)
    .toList

  val result = f(inputArray)
  println("Sum of Odd Elements is :" + result)
}
