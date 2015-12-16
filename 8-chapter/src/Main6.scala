/**
  * Created by kamil on 15.12.15.
  */
object Main6 {

  def main(args: Array[String]) {

    echo("a", "b", "c")

    val array = Array("a", "b", "c")
    echo(array : _*)

  }

  def echo(values: String*) = println(values.mkString(", "))

}
