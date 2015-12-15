/**
  * Created by kamil on 15.12.15.
  */
object Main2 {

  def main(args: Array[String]) {

    val yieldedValues = for {i <- 1 to 5;
                             j <- 1 to 5
                             if i == j
                             tuple = (i + "a", j + "b")} yield tuple

    println("yieldedValues = " + yieldedValues)

  }

}
