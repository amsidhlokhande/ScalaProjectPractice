package com.amsidh.scala

object Closure {
  var y= 30;
  def add(x:Int):Int={
    y=40;
    x + y
  }
  def main(args: Array[String]): Unit = {
    println(y)
    println(add(30))
    println(y)
  }
}
