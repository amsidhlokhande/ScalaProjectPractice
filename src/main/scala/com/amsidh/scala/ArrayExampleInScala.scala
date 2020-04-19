package com.amsidh.scala
import Array._
object ArrayExampleInScala {
  def main(args: Array[String]): Unit = {
    val numbs: Array[Int] = Array[Int](1, 2, 3, 4, 5, 6);
    numbs.foreach(x => print(f"$x%d "));
    println()
    val numbers:Array[Int] = range(0,100,5);
    numbers.foreach(y=>print(f"$y%d "));

    println()
   val numb2= 0 to 10;
    numb2.foreach(z=>print(f"$z%d "));

    println("\n\n")
    val numb3= 10 until 20;
    numb3.foreach(a=>print(f"$a%d "));
    println("\nEnd Of Program")
  }
}
