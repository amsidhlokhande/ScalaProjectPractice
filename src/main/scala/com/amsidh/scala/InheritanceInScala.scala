package com.amsidh.scala

trait Polygon {
  def shape(): Unit
  def area(): Unit
  def display():Unit={
    println("Non Abstract method")
  }
}

class Triangle(private val x: Int, private val y: Int, private val z: Int) extends Polygon {
  override def shape(): Unit = {
    println("Triangle")
  }

  override def area(): Unit = {
    println(f"Area Of Triangle($x%d, $y%d, $z%d) = ${x * y * z/2}%d")
  }
}

class Rectangle(private val x: Int, private val y: Int) extends Polygon {
  override def shape(): Unit = {
    println("Rectangle")
  }

  override def area(): Unit = {
    println(f"Area Of Triangle($x%d, $y%d) = ${x * y}%d")
  }
}

object InheritanceInScala {
  def main(args: Array[String]): Unit = {
    var triangle: Polygon = new Triangle(5, 10, 15)
    triangle.shape()
    triangle.area()
    triangle.display()

    var rectangle:Polygon= new Rectangle(10,15)
    rectangle.shape()
    rectangle.area()
    rectangle.display()
  }
}
