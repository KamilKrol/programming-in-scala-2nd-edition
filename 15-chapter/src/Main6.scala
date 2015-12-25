/**
  * Created by kamil on 25.12.15.
  */
object Main6 {

  def main(args: Array[String]) {

    val second: PartialFunction[List[Int], Int] = {
      case x :: y :: _ => y
    }

    val oneElementList = List(1)
    println(second.isDefinedAt(oneElementList))
//    println(second(oneElementList))

    val twoElementList = List(1,2)
    println(second.isDefinedAt(twoElementList))
    println(second(twoElementList))

  }

}
