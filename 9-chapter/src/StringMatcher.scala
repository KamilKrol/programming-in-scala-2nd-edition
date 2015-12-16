/**
  * Created by kamil on 15.12.15.
  */
object StringMatcher {

  private def stringsMatching(strings: List[String], matcher: String => Boolean) =
    for (string <- strings if matcher(string)) yield string

  def stringsEnding(strings: List[String], query: String) =
    stringsMatching(strings, _.endsWith(query))

  def stringsContaining(string: List[String], query: String) =
    stringsMatching(string, _.contains(query))

}
