package com.krisdrum

object MaxSumOfElementsRecursive extends App {
  val testSeqs: Seq[(Seq[Int], Int)] = Seq(
    Seq(1,2,3,4,5) -> 12,
    Seq() -> 0,
    Seq(1,2,3,-1) -> 6,
    Seq(-1,-2,-3) -> 0,
    Seq(2,-1,3,-2,4,-3,5) -> 9
  )

  def max(seq: Seq[Int]): Int = {
    def innerMax(seq: Seq[Int], localMax: Int, globalMax: Int): Int = seq match {
      case Nil => globalMax
      case x :: xi if x > 0 || localMax + x > 0 =>
        if (localMax + x > globalMax) innerMax(xi, localMax + x, localMax + x)
        else innerMax(xi, localMax + x, globalMax)
      case x :: xi => innerMax(xi, 0, globalMax)
    }

    innerMax(seq, 0, 0)
  }

}
