package com.amsidh.scala

object ForLoop {
  def main(args: Array[String]): Unit = {
    println("Range using to keyword")
    for (i <- 1 to 10) {
      println("For Loop Using to as Range " + i)
    }
    println("Range using .to() keyword")
    for (i <- 1.to(10)) {
      println("For Loop Using .to() as Range " + i)
    }

    println("Range using until keyword")
    for (i <- 1 until 10) {
      println("For Loop Using until as Range " + i)
    }
    println("Range using .until() keyword")
    for (i <- 1.until(10)) {
      println("For Loop Using .until() as Range " + i)
    }

    println("Multiple Range using to keyword")
    for (i <- 1 to 10; j <- 1 to 3) {
      println(f"For Loop Using multiple range using to $i%d $j%d")
    }


    println("For loop using list")
    val lst = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    for (i <- lst) {
      println(f"For loop using list $i%d")
    }

    //Filtering the list
    println("For loop using list and condition")
    for (i <- lst; if i % 2 == 0) {
      println(f"For loop using list $i%d")
    }
    //For loop as expression
    val result = for {i <- lst; if i % 3 == 0} yield {
      i * i
    }

    for(j<-result){
      println(f"For loop as expression $j%d")
    }
  }
}
