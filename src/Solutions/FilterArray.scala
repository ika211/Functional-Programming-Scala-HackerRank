package Solutions

import scala.io.StdIn.readLine

object FilterArray {
  def f(delim: Int, arr: Array[Int]): Array[Int]={
    for( i <- arr if i < delim) yield i
  }

  def main(args: Array[String]): Unit = {
    val X: Int = readLine().toInt // threshold
    val B: Int = readLine().toInt // size of array

    val inputArray: Array[Int] = io.Source.stdin.getLines().take(B).map(_.toInt).toArray

    val result = f(X, inputArray)
    result.foreach(println)
  }
}
