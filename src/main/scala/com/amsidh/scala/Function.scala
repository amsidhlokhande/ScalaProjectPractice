package com.amsidh.scala

object Function {

  //Copy all function in one object
  object Math {
    //One Way
    def add(x: Int, y: Int): Int = {
      return x + y
    }

    //Second Way
    def sub(x: Int, y: Int): Int = {
      x - y //avoid return as last line will get return automatically
    }

    def square(x: Int) = x * x
  }
  //Third Way
  def multi(x: Int, y: Int): Int = x * y //Avoid writing curly braces

  //Fourth Way
  def div(x: Int, y: Int)= x / y

  def main(args: Array[String]): Unit = {
    println(Math.add(10, 30)) //OR
    println(Math add(10, 30)) //OR
    println(Math.sub(10, 30)) //OR
    println(Math sub(10, 30)) //OR
    println(Math sub (10,10))
    println(multi(10, 30))
    println(div(100, 30))
    //If a function take only one argument then we can call the function like
    println(Math square 90) //OR
    println(Math square(20)) //OR
    println(Math.square(20))

  }
}
