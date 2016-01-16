/**
  * Created by Kamil on 15.01.2016.
  */
object Main2 {

  def main(args: Array[String]) {

    val list = List(1, 2, 3)
    println("list = " + list)

    val ranges = list.map(value => Range(1, value + 1))
    println("ranges = " + ranges)

    val flatRanges = ranges.flatMap(value => List(value.length, value.reduceRight(_ + _)))
    println("flatRanges = " + flatRanges)

  }

}
