/**
  * Created by kamil on 16.12.15.
  */
object Main5 {

  val assertionEnabled = true

  def main(args: Array[String]) {

    try {
      myAssert(() => 1 > 2)
    } catch {
      case exc: AssertionError => println("AssertionError")
    }

    try {
      byNameAssert(1 > 2)
    } catch {
      case exc: AssertionError => println("AssertionError")
    }


  }

  def myAssert(predicate: () => Boolean) =
    if (assertionEnabled && !predicate())
      throw new AssertionError

  def byNameAssert(predicate: => Boolean) =
    if (assertionEnabled && !predicate)
      throw new AssertionError

}
