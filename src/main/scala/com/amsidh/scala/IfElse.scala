package com.amsidh.scala

object IfElse {
  def main(args: Array[String]): Unit = {
    val age= 18
    if(age >= 18){
      println("Eligible for voting")
    }else if(age<=18){
      println("Not eligible for voting")
    }


    val result = if(age>=18) "Eligible for voting" else if(age<=18 && age>=12) "Not eligible for voting" else "You are kinder"
    println(result)
  }
}
