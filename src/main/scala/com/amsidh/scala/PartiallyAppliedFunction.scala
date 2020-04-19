package com.amsidh.scala

import java.util.Date

object PartiallyAppliedFunction {

  def log(date:Date, message:String)={
    println(date + "    "+ message)
  }

    //partially applied function
  val date= new Date;
  val newLog= log(date,_:String);


  def sum(x:Int,y:Int,z:Int):Int = x+ y + z

  //partially applied functions
  def sum1= sum(_:Int,_:Int,30);
  def sum2= sum(_:Int,10,20)


  def main(args: Array[String]): Unit = {
    println(sum1(1,2))
    println(sum2(2))
    newLog("Hello Message1")
    newLog("Hello Message2")
    newLog("Hello Message3")
    newLog("Hello Message4")
  }
}
