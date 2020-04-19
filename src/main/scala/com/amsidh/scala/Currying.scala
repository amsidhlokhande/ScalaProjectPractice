package com.amsidh.scala

object Currying {

  def add(x: Int, y: Int) = x + y

  //First Way of Currying
  def add2(x: Int) = (y: Int) => x + y

  def add2_p1 = add2(10)

  def add3(x: Int)(y: Int) = x + y

  def add3_p1 = add3(10)(_)
  def add3_p2 = add3(10)_


  def main(args: Array[String]): Unit = {
    println(add(10, 20))
    println(add2(10)(20))
    println(add3(10)(20))
    println(add2_p1(10))
    println(add3_p1(10))
    println(add3_p2(10))
  }
}
