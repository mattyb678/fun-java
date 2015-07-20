package chapter_1

object Discount {
  val prices: List[BigDecimal] = List(10, 30, 17, 20, 15, 18, 45, 12)

  def discount (over: BigDecimal, percent: BigDecimal) = {
    prices
      .filter(_ > over)
      .map(_ * percent)
      .foldLeft(BigDecimal(0))(_ + _)
  }
}