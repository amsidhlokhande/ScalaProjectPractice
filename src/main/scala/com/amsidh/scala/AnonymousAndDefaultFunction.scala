package com.amsidh.scala

object AnonymousAndDefaultFunction {

  object Math {
    def add(x: Int = 45, y: Int = 15): Int = {
      x + y
    }

    def square(x: Int = 10) = x * x
  }

  def print(x: Int, y: Int): Unit = {
    println(x + y)
  }

  def main(args: Array[String]): Unit = {
    var add = (x: Int, y: Int) => x + y
    println(add(10, 30))


    println(Math.add(60))
    println(Math square 20)
    print(20, 60)

  }
}
