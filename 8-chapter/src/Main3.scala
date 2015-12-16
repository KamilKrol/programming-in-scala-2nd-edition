/**
  * Created by kamil on 15.12.15.
  */
object Main3 {

  def main(args: Array[String]) {

    var more = 1
    val function = (x: Int) => x + more

    println("1st function(10) = " + function(10))
    more = 2
    println("2nd function(10) = " + function(10))

  }

}
