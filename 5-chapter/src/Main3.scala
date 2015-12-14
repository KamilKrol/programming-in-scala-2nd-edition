/**
  * Created by kamil on 14.12.15.
  */
object Main3 {

  def main(args: Array[String]) {

    println("abc" indexOf 'c')

    val kamil = Person("Kamil")
    println(kamil.name + " v. " + ~kamil)
  }

  case class Person(name: String) {
    def unary_~ = "~" + name
  }

}
