package com.amsidh.scala

class Point(val xc: Int, val yc: Int) {
  var x: Int = xc;
  var y: Int = yc;

  def move(dx: Int, dy: Int): Unit = {
    x = x + dx;
    y = y + dy;
    println(f"Point ($x%d,$y%d)");
  }
}

class Location(override val xc: Int, override val yc: Int, val zc: Int) extends Point(xc, yc) {
  var z: Int = zc;

  def move(dx: Int, dy: Int, dz: Int): Unit = {
    x = x + dx;
    y = y + dy;
    z = z + dz;
    println(f"Point ($x%d,$y%d,$z%d)");
  }
}

object Demo {
  def main(args: Array[String]): Unit = {
    val p1: Point = new Point(10, 20);
    p1.move(30, 50);

    val p2:Location = new Location(10,20,30);
    p2.move(10,20,30);
  }
}