/**
  * Created by Kamil on 02.02.2016.
  */
object Main4 {

  def main(args: Array[String]) {

    val list = List(1, 2, 3, 4, 5, 6, 7)

    val groupedIterator = list.grouped(3)
    println("groupedIterator:")
    printIterator(groupedIterator)

    val slidingIterator = list.sliding(3)
    println("slidingIterator:")
    printIterator(slidingIterator)

  }

  def printIterator(it: Iterator[List[Int]]): Unit = {
    while(it.hasNext) println(" - " + it.next)
  }

}
