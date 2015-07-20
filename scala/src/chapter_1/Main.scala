package chapter_1

object Main extends App {
  println("Found chicago? " + Cities.find("Chicago"))
  println("Total of discounted prices: " + Discount.discount(20, 0.9))
}