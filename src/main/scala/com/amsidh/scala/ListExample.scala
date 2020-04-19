package com.amsidh.scala

object ListExample {

  def main(args: Array[String]): Unit = {
    var numList: List[Int] = List(54,76,73,96,234,53,67);
    var nameList: List[String] = List("Amsidh", "Adithi", "Anjali", "Aditya")

    var concatList = numList.concat(nameList)
    concatList.foreach(println)


    println(0::numList)
    println(numList)
    println(Nil)
    println(1::5::9::Nil)

    //first value of list
    println(numList.head)
    //remaining values except first
    println(numList.tail)

    var sum:Int = 0;
    numList.foreach(sum += _);
    println(f"Sum of list= $sum%d")
println("Drop Left ")
    var numList2= numList.drop(3) //delete all the elements left from index 3
    numList2.foreach(println)

    println("DropRight method")
    var numList3= numList.dropRight(3) //delete all the elements right from index 3
    numList3.foreach(println)





  }
}
