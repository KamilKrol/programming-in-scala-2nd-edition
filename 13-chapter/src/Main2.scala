/**
  * Created by kamil on 21.12.15.
  */
object Main2 {

  def printDetails(fruit: Fruit): Unit = {
    import fruit._
    println("Name = " + name + " - color = " + color)
  }

  def main(args: Array[String]) {

    val apple = Fruit("Apple", "Red")
    printDetails(apple)

  }

  case class Fruit(name: String, color: String)

}
