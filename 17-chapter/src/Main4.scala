import scala.collection.mutable

/**
  * Created by kamil on 26.12.15.
  */
object Main4 {

  def main(args: Array[String]) {

    val immutableSet = Set(1, 2, 3)
    val mutableSet = mutable.Set.empty ++ immutableSet
    mutableSet.add(4)
    println(mutableSet)

  }

}
