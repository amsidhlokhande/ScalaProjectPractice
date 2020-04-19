package com.amsidh.scala

object StringInterpolationInScala {
 def main(args:Array[String]):Unit={
   val firstName = "Amsidh";
   val lastName = "Lokhande";
   val age = 37;
   val weight = 80.487654645;

   //first way
   println("First Way:");
   println("FirstName "+firstName);

   //second way
   println("Second  Way using s interpolation:");
   println(s"Name $firstName $lastName age is $age and weight $weight");

   //third way
   println("Third way which is type safe using f interpolation:");
   println(f"Name $firstName%s $lastName%s age is $age%d and weight $weight%f");

   //fourth way
   println("Fourth way which is type safe using raw interpolation:");
   println(raw"Name $firstName \n $lastName");
 }
}
