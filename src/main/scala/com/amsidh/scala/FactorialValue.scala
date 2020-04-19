package com.amsidh.scala

object FactorialValue {
  def main(args: Array[String]): Unit = {
    println("Factorial of 4", factorial(4));
  }

  def factorial(i: BigInt): BigInt = {
    if (i <= 1) {
      1;
    } else {
      i * factorial(i - 1);
    }
  }
}
