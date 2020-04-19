#ScalaProjectPractice

This is the project of scala practise 

While extending the class scala has two condition
1) primary constructor of super class must be overridden by primary constructor of child class
2) And then extend the Super class
   For Example
     package com.amsidh.scala
     
     class Super(val x: Int, val y: Int) {
       def display(): Unit = {
         println(f"x= $x%d and  y= $y%d");
       }
     }
     
     class Child(override val x: Int, override val y: Int, val z: Int) extends Super(x, y) {
     
       def sum(): Unit = {
         val s = x + y + z;
         println(f"Sum= $s%d");
       }
     }
     
     object Inheritance {
       def main(args: Array[String]): Unit = {
         val s: Super = new Super(10, 20);
         s.display();
         val c: Child = new Child(20, 30, 40);
         c.display();
         c.sum();
       }
     }
#Scala Important Points to remember

Data Types In Scala
--------------------
  1) Boolean   true or false      New DataTypes in Scala
  2) Byte				10) Unit  - Corresponds to no value or void type
  3) Short				11) Null  - null or empty reference
  4) Char				12) Nothing - subtype of every other type
  5) Int				13) Any - The supertype of any type
  6) Long				14) AnyRef - The supertype of any reference type
  7) Float
  8) Double
  9) String 


String Interpolation
--------------------
val name="mark"
val age = 18.5
println(name + " is "+ age + " years old")
println(s"$name is $age years old")
println(f"$name%s is $age%f years old")
println(s"Hello \nWorld")
println(raw"Hello \nWorld")


If Else In Scala
-----------------------
if(x<20 || y>30
{
}else{

}

OR
val result = if( x == 20) "x==20" else "x!=20"
println(result);
println(if( x == 20) "x==20" else "x!=20");

While And Do-While Loop

while(x<10){
  x += 1 or x = x+1 // x++ not allowed in scala
}

and Do-While

do{
 
x += 1 or x = x+1 // x++ not allowed in scala
}while(x<10)


For Loop I  Scala
--------------------
  Different ways to use for loop
	1) for ( i <- 1 to 5){}
	2) for(i<- 1.to(5)){}
	3) for(i <- 1.until(5){})
	4) for( i <- 1 to 9; j <- t to 3){}  //nested for loop
	5) val lst = List(1,2,3,4,5,6,7,8,9)	
		for(i<- lst){}
	6) //filtering for loop
		for(i <- lst; if i < 6){}
	7) val result = for { i <- lst; if i < 6} yield { i*i}
	8)  val result = for { 
				i <- lst
				if i < 6
			      } yield { 
			         i*i
			      }


Match Expression
--------------------------
1) val age = 18
  age match {
   case 20 => println("Age is 20")
   case 46 => println("Age is 46")
   case 50 => println("Age is 50")
   case _ =>  println("Default Age 18") 
 }


2) val result = age match {
	   case 20 => age
	   case 46 => age
	   case 50 => age
	   case _ =>  "Default" 
	 }
   println(result)
3) val i =7
    i match{
      case 1|3|5|7|9 => println("odd")
      case 2|4|6|8|10 => println("even")
    }





Object Declaration in Scala
------------------------------
object Demo{
  //main method declaration in Scala
  def main(args:Array[String]){
  
  }
}


Function in Scala
--------------------------
  Function Delcaration in Scala
  def functionName(argument names):returnDatatype = {
   
   }

In scala method declaration provided more flexibility

 For Example
   def add(x:Int , y:Int) : Int = {
    return x + y
  }
  
  def substract(x:Int , y:Int) : Int = {
    x - y //return key word not required. Last line considered as return value
  }
  
  //we can remove the curly brace as well and make the function as single line
  def multiply(x:Int , y:Int) : Int = x * y 
  
  def divide(x:Int , y:Int) : Int = return x / y
  
 // We can also remove the return type
  def reminder(x:Int , y:Int) = x % y
  


 Higher Order Function in Scala
----------------------------------------
Higher order function are those function which will take function as argument and return function as a result
Example-
  object higherorderfunction {
    def sum(x:Int,y:Int,function1:(Int, Int) => Int):Int = { 
         return function1(x,y)
      }
    
    def sum(x:Int,y:Int, z:Int,function1:(Int, Int) => Int):Int = { 
         return function1(function1(x,y),z)
      }
    
    
    def main(args:Array[String]):Unit={
      var result = sum(30,50,(x,y)=> x + y)
      println(result);
      
      println(sum(400,50, _ + _))
      println(sum(400,50, _ min _))
      
      result = sum(30,50,40,(x,y)=> x + y)
      println(result)
      println(sum(30,50,40,(x,y)=> x max y))
	  
	  println(sum(30,50,40,(x,y)=> _**_))
      
    }
    
}


Partially Applied Function
---------------------------------------
//Partially applied function means a function which has partial implementation and partial unimplementation mean the function which is not 
fully implemented

object PartiallyAppliedFunction {
  def function(x:Int,y:Int,z:Int):Int = {
    return x + y+ z
  }
  
  //Create Partially Applied function from above function
  val fun = function(10, 20, _:Int)
  
  val fun2 = function(10, _:Int, _:Int)
  
  
  def log(date:Date, message:String):Unit = {
    println(date + "    " + message)
  }
  
  //create partial function for above log
  val partialLog = log(new Date, _:String)
  
  def main(args:Array[String]):Unit = {
    
    println(fun(30))
    println(fun2(30,40))
    
    partialLog("Logging the message hello world");
  }
  
}


Closures In Scala
-------------------------------
A closure is a function which uses one or more variables declared outside this function
Example-
  object ClosureFunction {
  //The Closure function is a function which uses one or more variables declared outside this function
   var y = 30 // if this variable declared as var means mutable/can change the value ie. impure closure 
             //and if it is val i.e immutable/can not change then it is pure closure
  
  def add(x:Int) = {
     y = 40 //if y is declared val then it will not allow to change
    x + y
    }
  def main(args:Array[String]):Unit={
    println(y) //30
    println(add(20)) //60
    println(y)  //40
 }

Currying in Scala
----------------------------

Currying is a technique of transforming a function that takes multiple arguments into a function
that takes a single argument
Example
object CurryingInScala {
  
  def add(x:Int, y:Int) = x + y
  // Currying is a technique of transforming a function that takes multiple arguments into a function
  //that takes a single argument
  //1 way
  def add2 (x:Int) = (y:Int) => x + y 
  //2 way
  //simpler curried function
  def add3(x:Int)(y:Int)= x + y
  
  def main(args:Array[String]):Unit = {
    
    println(add(45,35))
    println(add2(45)(35))

    //Partial function
    def sum40 = add2(40)
    println(sum40(30))
    
    println(add3(60)(40))
    
    
    val sum50=add3(50)_
    println(sum50(40))
    
  }
}

Array In Scala
------------------------
import Array._


object arrayinscala {
  //first way
  val myarray:Array[Int] = new Array[Int](4)
 //second way
  val myarray2 = new Array[Int](5)  //default value 0 stored 
  val myarray3 = Array(1,2,3,4,5,6,7,8)
  
  

  
  def main(args:Array[String]):Unit = {

    myarray(0)= 10
    myarray(1)= 20
    myarray(2)= 30
    myarray(3)= 40
    println(myarray) //not convinent
    
    for( x <- myarray ){
      println(x)
    }
    println("Another way")
    for(i <- 0 to (myarray.length-1)){
      println(myarray(i))
    }
    
    println("Thrird way")
    for(i <- 0 to (myarray3.length-1)){
      println(myarray3(i))
    }  
      //concatinate array
     println("Fourth way")
    val result = Array.concat(myarray,myarray3)
     for(i <- 0 to (result.length-1)){
      println(result(i))
    }
    
  }
}

List In Scala
------------------------------------
object listinscala {

  val mylist:List[Int] = List(1,2,3,4,5,6,7,8,9,10)
  val names:List[String] = List("AbC","PQR","XYZ")
  def main(args:Array[String]):Unit = {
    println(names)
    
        
    //add value at begining
    println(0::mylist)
    
    //list not change
    println(mylist)
    
    println(Nil)
    println(1::5::9::Nil)
    
    
    //first value of list
    println(mylist.head)
    //remaining values except first
    println(mylist.tail)
    
    
    println(names.isEmpty)
    
    
    mylist.foreach(println)
    
    names.foreach(println)
    
  }
}


Set In Scala
-------------------------------
 val nums:Set[Int] = Set[Int](1,2,3,4,4,5,5,6) //immutable set
 val names:Set[String] = Set[String]() //immutable set
 var cities:scala.collection.Set[String] = scala.collection.Set[String]() //mutable set

 Map in Scala
------------------------------------
object mapinscala {

  val myMap:Map[Int, String]= 
    Map[Int,String](1->"Amsidh",2->"********",3->"Sanjay")
  
  def main(args:Array[String]):Unit = {
    println(myMap)
    println(myMap(2))
    
    //println(myMap(4)) //throws exception as no such key found
    //so instead on this to check element use contain method
    println(myMap.keys)
    println(myMap.values)
    
    
    myMap.keys.foreach(key =>{
      println(key + "  "+ myMap(key))
    })
    
     
  }
}


Tuple In Scala
----------------------------------------
This is heterogeneous data type. Unlike array and list which stores only single data type element Tuple store multi data type element.7
In Scala tuple is immutable so we can not change value of it once declared
Example
object tupleinscala {
  //This is heterogeneous data type. Unlike array and list which stores only single data type element Tuple store multi data type element.
  val myTuple = (1, 2, "Amsidh", true, 5.8) // In scala tuple is immutable so we can not change value of it once declared
  val myTuple2 = new Tuple5(1, 2, "Amsidh", true, 5.8) 
  val myTuple3 = new Tuple2(1, 2) 
  val myTuple4 = new Tuple1(1)
 // val myTuple5 = new Tuple() //Will not work
  
    val myTuple6 = new Tuple4(1, 2, "Amsidh", (2,5)) 
  def main(args: Array[String]): Unit = {
     
    println(myTuple)
    println(myTuple2._1)
    println(myTuple2._2)
    println(myTuple2._3)
    println(myTuple2._4)
    println(myTuple2._5)
    //println(myTuple2._6) //Gives error
    
    //Iterate over tuple
    
    myTuple.productIterator.foreach(println)
    
    //Another way to create tuple
    println(1 -> "Amsidh")
    
    println(myTuple6._4._2)
    
  }
}


Options In Scala
----------------------------
In Scala Options are container which can give you two values. It can give you an instance of result or None

Example
object optionsInScala {
  
  val lst:List[Int] = List[Int](1,2,3,4,5)
  val map:Map[Int,String] = Map[Int,String](1->"Pune",2->"Bijapur",3->"Mumbai")
  
  val opt:Option[Int] = Some(55) // = None
  
  def main(args:Array[String]):Unit={
   println(lst.find(_ > 1)) //Some(2)
   
   println(lst.find(_ > 1).get) //2
   
   println(map.get(6))
   
  // println(map(10)) //this will through an exception to avoid this exception we can do like following
    println(map.get(10).getOrElse("No Name Found"))
    println(map.get(2).getOrElse("No Name Found"))
    
    println(opt.get)
  }
}

map Function In Scala
----------------------------------
map function in scala is used to iterate and apply action/operation on each element during iteration.

Example
object mapFunctionInScala {

  val lst: List[Int] = List[Int](1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
  val myMap: Map[Int, String] = Map[Int, String](1 -> "Pune", 2 -> "Mumbai", 3 -> "Bijapur")
  def main(args: Array[String]): Unit = {
    println(lst.map(_ * 2)); //Double every element in the list //List(2, 4, 6, 8, 10, 12, 14, 16, 18, 20)
    //Another way
    println(lst.map( x => x * 2)); //Double every element in the list  //List(2, 4, 6, 8, 10, 12, 14, 16, 18, 20)
    println(lst) //List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    println(lst.map("hi" * _)) //List(hi, hihi, hihihi, hihihihi, hihihihihi, hihihihihihi, hihihihihihihi, hihihihihihihihi, hihihihihihihihihi, hihihihihihihihihihi)
    
    println(myMap.map(x=> "hi" + x)) //List(hi(1,Pune), hi(2,Mumbai), hi(3,Bijapur))
    println(myMap.mapValues(x=> "hi" + x)) // Applies on value //Map(1 -> hiPune, 2 -> hiMumbai, 3 -> hiBijapur)
    
    println("hello".map(_.toUpper)) //Make String upper case using map //HELLO
    
    
    
  }
}


object flattenFunctionInScala {

  val lst: List[List[Int]] = List[List[Int]](List[Int](1, 2, 3, 4), List[Int](4, 5, 6), List[Int](7, 4, 8));
  
  def main(args: Array[String]): Unit = {
    val newlst = lst.flatten
    println(newlst)  //List(1, 2, 3, 4, 4, 5, 6, 7, 4, 8)
  }
}

object flatmapFunctionInScala {

  val lst: List[Int] = List[Int](1, 2, 3, 4, 4, 5, 6, 7, 4, 8);

  def main(args: Array[String]): Unit = {
    val resultflatMap = lst.flatMap(x => List(x, x + 1))
    println(resultflatMap) //List(1, 2, 2, 3, 3, 4, 4, 5, 4, 5, 5, 6, 6, 7, 7, 8, 4, 5, 8, 9)

    val resultOnlyMap = lst.map(x => List(x, x + 1))
    println(resultOnlyMap) //List(List(1, 2), List(2, 3), List(3, 4), List(4, 5), List(4, 5), List(5, 6), List(6, 7), List(7, 8), List(4, 5), List(8, 9))

    
    println(lst.filter(x=> x%2==0))  //List(2, 4, 4, 6, 4, 8)
    println(lst.filter(x=> x%2!=0)) //List(1, 3, 5, 7)
  }
}

Reduce,fold or scan In Scala
------------------------------------







scala> val EmployeesData = Seq( Employee("Anto",   21, "Software Engineer", 2000, 56798),
     |                                Employee("Jack",   21, "Software Engineer", 2000, 93798),
     |                                Employee("Mack",   30, "Software Engineer", 2000, 28798),
     |                                Employee("Bill",   62, "CEO", 22000, 45798),
     |                                Employee("Joseph", 74, "VP", 12000, 98798),
     |                                Employee("Steven", 45, "Development Lead", 8000, 98798),
     |                                Employee("George", 21, "Sr.Software Engineer", 4000, 98798),
     |                                Employee("Matt",   21, "Sr.Software Engineer", 4000, 98798))

EmployeesData: Seq[Employee] = List(Employee(Anto,21,Software Engineer,2000,56798), Employee(Jack,21,Software Engineer,2000,93798), Employee(Mack,30,Software Engineer,2000,28798), Employee(Bill,62,CEO,22000,45798), Employee(Joseph,74,VP,12000,98798), Employee(Steven,45,Development Lead,8000,98798), Employee(George,21,Sr.Software Engineer,4000,98798), Employee(Matt,21,Sr.Software Engineer,4000,98798))


scala> val Employee_DataFrame = EmployeesData.toDF
Employee_DataFrame: org.apache.spark.sql.DataFrame = [Name: string, Age: int, Designation: string, Salary: int, ZipCode: int]


scala> Employee_DataFrame.printSchema
root
 |-- Name: string (nullable = true)
 |-- Age: integer (nullable = false)
 |-- Designation: string (nullable = true)
 |-- Salary: integer (nullable = false)
 |-- ZipCode: integer (nullable = false)

 
 
scala> Employee_DataFrame.show
+------+---+--------------------+------+-------+
|  Name|Age|         Designation|Salary|ZipCode|
+------+---+--------------------+------+-------+
|  Anto| 21|   Software Engineer|  2000|  56798|
|  Jack| 21|   Software Engineer|  2000|  93798|
|  Mack| 30|   Software Engineer|  2000|  28798|
|  Bill| 62|                 CEO| 22000|  45798|
|Joseph| 74|                  VP| 12000|  98798|
|Steven| 45|    Development Lead|  8000|  98798|
|George| 21|Sr.Software Engineer|  4000|  98798|
|  Matt| 21|Sr.Software Engineer|  4000|  98798|
+------+---+--------------------+------+-------+












