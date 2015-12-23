/**
  * Created by kamil on 23.12.15.
  */
object Main1 {

  def main(args: Array[String]) {

    assert(2 == 2)
    //    assert(2 == 3)

    val positive = {
      2 + 2
    }.ensuring(_ > 0)
    println(positive)

//    val negative = {
//      2 - 3
//    }.ensuring(_ > 0)

  }

}
