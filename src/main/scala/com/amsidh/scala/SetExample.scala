package com.amsidh.scala

object SetExample {
  def main(args: Array[String]): Unit = {
    var numSet: Set[Int] = Set[Int](1, 2, 3, 4, 5, 6, 7, 8, 9)
    println(numSet)

    numSet = numSet + 10;
    println(numSet)

  }
}
