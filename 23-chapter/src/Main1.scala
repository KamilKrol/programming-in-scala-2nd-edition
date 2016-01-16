/**
  * Created by Kamil on 15.01.2016.
  */
object Main1 {

  def main(args: Array[String]) {

    val pairs = for (i <- 1 to 5; j <- List('a', 'b')) yield (i, j)
    println(pairs)

  }

}
