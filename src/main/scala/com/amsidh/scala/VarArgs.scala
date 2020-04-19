package com.amsidh.scala

object VarArgs {

  def array1(args: Array[Int]): Unit = {
    for (i <- args) {
      println(f"Value of i=$i%d");
    }
  }

  def array2(args: Int*): Unit = {
    for (j <- args) {
      println(f"Value of j=$j%d");
    }
  }

  def main(args: Array[String]): Unit = {
    array1(Array(1, 2, 3, 4, 5));
    array2(11, 12, 13, 14, 15, 16, 17, 18)
  }
}
