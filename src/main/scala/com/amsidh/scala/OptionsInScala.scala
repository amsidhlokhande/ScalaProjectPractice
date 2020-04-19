package com.amsidh.scala

object OptionsInScala {
  def main(args: Array[String]): Unit = {
    var names= List("Amsidh","Aditya","Anjali","Adithi")
    println(names.find(_== "Aditya"))// Some(Amsidh)
    println(names.find(_== "Aditya").get)// Amsidh
    println(names.find(_== "Lokhande"))// None
    //println(names.find(_> "Lokhande").get)// Exception in thread "main" java.util.NoSuchElementException: None.get
    println(names.find(_== "Lokhande").getOrElse("No Record Found"))  //No Record Found

    var map:Map[Int,String]= Map[Int,String](1->"Amsidh",2->"Aditya")
    println(map.get(2)) //Some(Aditya)
    println(map.get(2).get) //Some(Aditya)
    println(map.get(4)) //None
   // println(map.get(4).get) //Exception in thread "main" java.util.NoSuchElementException: None.get
    println(map.get(4).getOrElse("No Record Found")) //No Record Found
  }
}
