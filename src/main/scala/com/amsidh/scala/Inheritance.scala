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
