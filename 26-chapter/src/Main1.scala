/**
  * Created by Kamil on 14.02.2016.
  */
object Main1 {

  def main(args: Array[String]) {

    val mail = EMail("kamil", "gmail.com")

    println(mail)
    println(EMail.unapply(mail))

    mail match {
      case EMail(name, domain) => println("Name = " + name + ", domain = " + domain)
      case _ => println("Didn't match")
    }

  }

}