package com.amsidh.scala

object MutableAndImmutable {
  def main(args: Array[String]): Unit = {
    var name: String = "Amsidh"; //var is mutable
    name = "Lokhande";
    println(f"Name $name%s");
    val city: String = "Pune";
    //city = "Bijapur" //This is not allowed as city is declared as val which is immutable/can't be changed
    println(s"City $city");

    val age: Int = 37;
    val weight: Double = 82.5
    println(f"$name%s is $age%d old and his weight is $weight%f");

  }
}
