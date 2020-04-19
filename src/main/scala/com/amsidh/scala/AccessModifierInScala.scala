package com.amsidh.scala

class AccessModifierInScala {
   protected def message(): Unit ={
     println("protected method message() is called")
   }
   class Inner{
     private def privateDisplay():Unit={
       message();
       println("Inner class privateDisplay method called")
     }

      def publicDisplay():Unit={
       println("Inner class publicDisplay method called")
     }
     class InnerMost{
       message();
       privateDisplay(); //both private and public method can be accessible
       publicDisplay();
     }
   }
  def show(): Unit ={
    val inner:Inner = new Inner;
    //inner.privateDisplay(); //This method is not accessible because of private accessibility.
    inner.publicDisplay();

  }
}
class SubClass extends AccessModifierInScala {
  def callProtectedMethodFromSubClass() = {
    message();
  }

  def m1():Unit={
    println("m1 method from Child class");
  }
}

object Access{
  def main(args: Array[String]): Unit = {
    val obj:AccessModifierInScala = new AccessModifierInScala;
    obj.show();

    val child:SubClass = new SubClass;
    child.callProtectedMethodFromSubClass();
    child.m1();
  }
}
