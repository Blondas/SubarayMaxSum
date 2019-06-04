package com.krisdrum

import org.scalatest.{FlatSpec, Matchers}

class MaxSumOfElementsSpec extends FlatSpec  with Matchers {
  val testSeqs: Seq[(Seq[Int], Int)] = Seq(
    Seq(1,2,3,4,5) -> 15,
    Seq() -> 0,
    Seq(1,2,3,-1) -> 6,
    Seq(-1,-2,-3) -> 0,
    Seq(2,-1,3,-2,4,-3,5) -> 8
    )

  for ((seq, expected) <- testSeqs) s"Max sum of $seq" should s"equal $expected" in {
    MaxSumOfElementsRecursive.max(seq) shouldEqual expected
    MaxSumOfElements.max(seq.toArray) shouldEqual expected
  }
}
