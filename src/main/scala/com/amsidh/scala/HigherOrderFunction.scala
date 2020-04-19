package com.amsidh.scala

object HigherOrderFunction {

  def math(x:Double, y:Double,z:Double, f:(Double,Double)=>Double):Double = f(f(x,y),z)

  def mathematics(x:Int, y:Int, calculation:(Int,Int)=>Int):Int = calculation(x,y)


  def main(args: Array[String]): Unit = {
    var result = math(50,20,40,(x,y)=> x * y)
    println(result)

     result = math(50,20,10, _ * _)
    println(result)
  }
}
