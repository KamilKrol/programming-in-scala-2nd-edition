/**
  * Created by kamil on 14.12.15.
  */
object Main1 {

  def main(args: Array[String]) {

    for (i <- 1 to 4)
      println(i)

    println

    for (i <- 1 until 4)
      println(i)

    println

    for (i <- 1 to 30 if i % 4 == 0)
      println(i)

    println



  }

}
