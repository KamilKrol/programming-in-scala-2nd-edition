/**
  * Created by Kamil on 14.02.2016.
  */
object EMail {

  def apply(user: String, domain: String) = user + "@" + domain

  def unapply(email: String): Option[(String, String)] = {
    val parts = email split "@"
    if (parts.length == 2) Some(parts(0), parts(1)) else None
  }

}
