/**
  * Created by kamil on 25.12.15.
  */
object Main7 {

  def main(args: Array[String]) {

    val results = List(Some("Kamil"), None, Some("Bogi"))

    for (result <- results) println(result)
    println
    for (Some(name) <- results) println(name)

  }

}
