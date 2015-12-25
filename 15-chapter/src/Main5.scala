/**
  * Created by kamil on 25.12.15.
  */
object Main5 {

  def main(args: Array[String]) {

    val withDefault: Option[Int] => Int = {
      case Some(x) => x
      case None => 0
    }

    println(withDefault(Some(10)))
    println(withDefault(None))

  }

}
