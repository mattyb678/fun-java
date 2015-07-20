package scala_chapter_1

object Cities {

  val cities = List("SLC", "Denver", "Chicago", "NYC", "Madrid", "London")

  def find (toFind: String): Boolean = {
    cities.contains(toFind)
  }
}