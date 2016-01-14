/**
  * Created by Kamil on 14.01.2016.
  */
object Main4 {

  implicit val defaultPrompt = new Prompt("Yes, sir ->")

  def main(args: Array[String]) {

    Greeter.greet("Kamil")

  }

}


object Greeter {
  def greet(name: String)(implicit prompt: Prompt): Unit = {
    println("Hello, " + name + "!")
    println(prompt.prompt)
  }
}

case class Prompt(prompt: String)