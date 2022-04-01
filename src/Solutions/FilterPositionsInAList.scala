package Solutions

object FilterPositionsInAList {
  def f(arr:List[Int]):List[Int] = arr.zipWithIndex.filter(_._2 % 2 == 1).map(_._1).toList

  def main(args: Array[String]): Unit = {
    val inputArray: List[Int] =
      Iterator
        .continually(scala.io.StdIn.readLine())
        .takeWhile(_.nonEmpty)
        .map(_.toInt)
        .toList


    val result = f(inputArray)
    result.foreach(println)
  }
}
