package com.amsidh.scala

import scala.util.control.Breaks

object BreakConditionInScala {
  def main(args: Array[String]): Unit = {
    var num1: List[Int] = List(1, 2, 3, 4, 5, 6, 7, 8, 9);
    var num2: List[Int] = List(11, 12, 13, 14, 15, 16, 17, 18, 19, 20);
    var a = 0;
    var outerBreak: Breaks = new Breaks;
    var innerBreak: Breaks = new Breaks;
    outerBreak.breakable({
      for (a <- num1) {
        println(f"Value a= $a%d");
        innerBreak.breakable({
          val b: Int = 0;
          for (b <- num2) {
            println(f"Value b= $b%d");
            if (b == 15) {
              innerBreak.break();
            }
          }
        });
        println("InnerBreak Ended")
        if (a == 5) {
          outerBreak.break();
        }
      }
      println("OuterBreak Ended")
    });

  }
}
