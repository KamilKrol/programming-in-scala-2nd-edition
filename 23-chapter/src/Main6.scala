/**
  * Created by Kamil on 02.02.2016.
  */
object Main6 {

  def main(args: Array[String]) {

    val stream = getStream(5)
    println(stream)

    for (value <- stream) println("value = " + value)

  }

  def getStream(n: Int): Stream[Int] =
    if (n == 0) Stream.empty else n #:: getStream(n - 1)

}
