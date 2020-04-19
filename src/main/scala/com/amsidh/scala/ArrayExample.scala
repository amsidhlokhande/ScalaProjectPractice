package com.amsidh.scala

object ArrayExample {
  def main(args: Array[String]): Unit = {
    var lst:Array[Int]= new Array[Int](5)
    var nums = Array(10,20,30,40,50)

    println(for{i<- 0 to lst.length} yield{i})

    for(j <- 0 to lst.length){
      println(j)
    }

    for(j <- 0 to nums.length){
      println(j)
    }
  }
}
