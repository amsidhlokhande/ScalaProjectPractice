package com.amsidh.scala

object StringInterpolation {
  def main(args: Array[String]): Unit = {
    val firstNme = "Amsidh"
    val lastName = "Lokhande"
    val age = 37
    val weight = 80.487654645

    //first way
    println("First Way:")
    println(firstNme + "  "+ lastName + "  age is "+ age + " and weight is" + weight)

    //Second way
    println("Second  Way using s interpolation:")
    println(s"$firstNme  $lastName age is $age and weight is $weight")


    //Third way which is type safe
    println("Third way which is type safe using f interpolation:")
    println(f"$firstNme%s  $lastName%s age is $age%d and weight is $weight%f")

    //Fourth way which is type safe
    println("Fourth way which is type safe using raw interpolation:")
    println(raw"Hello \nWorld") // This will print Hello \nWorld

  }
}
