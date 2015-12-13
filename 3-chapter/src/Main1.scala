/**
  * Created by kamil on 13.12.15.
  */
object Main1 {

  def main(args: Array[String]) {
    var immutableSet = Set(1, 2, 3)
    immutableSet += 4
    println(immutableSet.mkString(", "))

    val mutableSet = scala.collection.mutable.Set(1, 2, 3)
    mutableSet += 4
    println(mutableSet.mkString(", "))
  }

}
