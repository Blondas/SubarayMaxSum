package com.krisdrum

trait MaxSumOfElementsRecursive extends App {
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
