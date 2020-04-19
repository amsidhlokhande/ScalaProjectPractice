package com.amsidh.scala

object MapFunctionExample {
  def main(args: Array[String]): Unit = {
    var nums: List[Int] = List(1, 2, 3, 4, 5, 6)
    nums.map(_ * 2).foreach(println)
    nums.map(x => x * 2).foreach(println)
    nums.map("hi"*_).foreach(println)

    var map:Map[Int,String]= Map(1->"Pune",2->"Bijapur")
    map.map("hi"+ _).foreach(println)

    //FlatMap
    var listOfList:List[List[Int]]= List(List(1,2,3,4),List(3,4,5,6,7),List(1,2))
    println(listOfList.flatten)
    println(nums.map(x=> List.range(0, x)))
    println(nums.map(x=> List.range(0, x)).flatten)
    println(nums.flatMap(x=> List.range(0, x)))


  }
}
