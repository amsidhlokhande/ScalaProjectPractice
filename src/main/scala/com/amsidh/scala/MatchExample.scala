package com.amsidh.scala

object MatchExample {
  def main(args: Array[String]): Unit = {
    var age = 60

    age match {
      case 20=> println(age);
      case 10=> println(age);
      case 18=> println(age);
      case 50=> println(age);
      case 60=> println(age);
      case _=> println("default");
    }

   val result = age match {
      case 20=> age;
      case 10=> age;
      case 18=> age;
      case 50=> age;
      case 60=> age;
      case _=> "default";
    }
    println(result)


  }
}
