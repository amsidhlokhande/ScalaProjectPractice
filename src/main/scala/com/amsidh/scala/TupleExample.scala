package com.amsidh.scala

object TupleExample {
  def main(args: Array[String]): Unit = {
    var tuple = ("Amsidh", "Lokhande", 1, 2, "Adithi")
    var tuple2 = new Tuple2(1, "Amsidh")
    var tuple1 = new Tuple1(10)
    var namesTuple = ("Amsidh", "Aditya", 38, 7,("Anjali",33))

    println(tuple._1)
    tuple.productIterator.foreach(println)

    println(namesTuple._5._1)
    println(namesTuple._5._2)


  }
}
