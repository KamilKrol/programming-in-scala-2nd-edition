/**
  * Created by kamil on 17.12.15.
  */
package object traits {

  abstract class Animal

  trait HasLegs

  trait Philosophical {
    def philosophize(): Unit = {
      println("I consume memory, therefore I am!")
    }
  }

  class Frog extends Animal with Philosophical with HasLegs {
    override def toString = "Frog(green)"
  }

}
