package com.amsidh.scala

object ReduceFoldAndScan {
  def main(args: Array[String]): Unit = {
    var nums = List.range(0, 5)
    var chars: List[String] = List("A", "B", "C", "D", "E", "F")
    println("Reduce Left Sum Operation")
    println(nums.reduceLeft((x, y) => {
      println(f"$x%d : $y%d")
      x + y
    }))
    println("Reduce Right Sum Operation")
    println(nums.reduceRight((x, y) => {
      println(f"$x%d : $y%d")
      x + y
    }))

    println("Reduce Left Minus Operation")
    println(nums.reduceLeft((x, y) => {
      println(f"$x%d : $y%d")
      x - y
    }))
    println("Reduce Right Minus Operation")
    println(nums.reduceRight((x, y) => {
      println(f"$x%d : $y%d")
      x - y
    }))

    println("Fold Will set initial value and perform the binary Operation like SUM here")
    println(nums.fold(10)((x, y) => {
      println(f"$x%d : $y%d")
      x + y
    }))

    println("Scan Will set initial value, intermediary values  and perform left or right reduce using binary Operation like SUM here")
    println(nums.scanLeft(10)((x, y) => {
      println(f"$x%d : $y%d")
      x + y
    }))

    println(nums.scanRight(10)((x, y) => {
      println(f"$x%d : $y%d")
      x + y
    }))

  }
}
