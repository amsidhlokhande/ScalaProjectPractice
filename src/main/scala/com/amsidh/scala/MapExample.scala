package com.amsidh.scala

object MapExample {
  def main(args: Array[String]): Unit = {
    var cityPinCode: Map[String, Int] = Map[String, Int]("Pride World City" -> 412105, "Lohegaon" -> 411049,
      "Magarpatta" -> 522212)

    var nameAgeMap: Map[String, Int] = Map[String, Int]("Amsidh" -> 37, "Anjali" -> 33, "Adithi" -> 10, "Aditya" -> 7)

    println(cityPinCode)
    println(nameAgeMap)
    cityPinCode.foreachEntry((k, v) => println(k + " : " + v))

    println(nameAgeMap)
    nameAgeMap.foreachEntry((k, v) => println(k + " : " + v))
    println(cityPinCode.keys)
    println(cityPinCode.values)

    println(nameAgeMap.keys)
    println(nameAgeMap.values)
    println(cityPinCode("Magarpatta"))
    println(cityPinCode("abc"))
  }

}
