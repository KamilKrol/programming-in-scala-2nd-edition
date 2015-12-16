/**
  * Created by kamil on 16.12.15.
  */
package object element {

  class Element {
    var value = ""

    private def this(value: String) {
      this()
      this.value = value
    }

    def print() {
      println("value = " + value)
    }
  }

  object Element {
    def getInstance(value: String) = new Element(value)
  }

}
