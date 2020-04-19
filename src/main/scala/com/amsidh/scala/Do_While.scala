package com.amsidh.scala

object Do_While {
  def main(args: Array[String]): Unit = {
    var x = 0
    println("While Loop")
    while (x <= 6) {
      println(f"Value of X $x%d")
      x += 1
    }
    println("Do-While Loop")
    do{
      println(f"Value of X $x%d")
      x += 1
    }while (x <= 6)
  }
}
