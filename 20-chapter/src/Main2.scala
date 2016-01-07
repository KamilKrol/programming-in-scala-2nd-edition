/**
  * Created by kkrol on 07/01/2016.
  */
object Main2 {

  def main(args: Array[String]) {

    println("Lazy class creation")
    val lazyClass = new LazyClass
    println("Lazy class created")

    println("lazyClass.normalVal = " + lazyClass.normalVal)
    println("lazyClass.lazyVal = " + lazyClass.lazyVal)

  }

  class LazyClass {

    lazy val lazyVal = {
      println("Initializing lazy val")
      Thread sleep 5000
      println("Lazy val initialized")
      5
    }

    val normalVal = {
      println("Initializing normal val")
      Thread sleep 5000
      println("Normal val initialized")
      5
    }

  }

}
