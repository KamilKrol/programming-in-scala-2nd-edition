/**
  * Created by kamil on 23.12.15.
  */
object Main2 {

  def main(args: Array[String]) {

    val intStringMap = Map[Int, String]()
    val stringIntMap = Map[String, Int]()
    println(getDetails(intStringMap))
    println(getDetails(stringIntMap))

  }

  def getDetails(map: Any): String = map match {
    case m: Map[_, _] => "map"
    case _ => "no details"
  }

}
