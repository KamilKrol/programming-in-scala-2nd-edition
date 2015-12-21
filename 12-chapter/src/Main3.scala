import queue._

/**
  * Created by kamil on 21.12.15.
  */
object Main3 {

  def main(args: Array[String]) {

    val basicIntQueue = new BasicIntQueue
    basicIntQueue.put(1)
    basicIntQueue.put(2)

    println(basicIntQueue.get() + " " + basicIntQueue.get())

    val doublingQueue = new BasicIntQueue with Doubling
    doublingQueue.put(1)
    doublingQueue.put(2)

    println(doublingQueue.get() + " " + doublingQueue.get())

    val incrementingFilteringQueue = new BasicIntQueue with Incrementing with Filtering
    incrementingFilteringQueue.put(1)
    incrementingFilteringQueue.put(2)
    incrementingFilteringQueue.put(-1)

    println(incrementingFilteringQueue.get() + " " + incrementingFilteringQueue.get())
    //println(incrementingFilteringQueue.get())

  }

}
