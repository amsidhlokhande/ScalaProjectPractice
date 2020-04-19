package com.amsidh.scala

import Array._

object MultiDimArray {

  def multiDim(): Unit = {

    //Create Multi Dimensional Array of 3 * 3
    var matrix = ofDim[Int](3, 3);
    //Load matrix
    /*matrix(0)(0) = 1
    matrix(0)(1) = 1
    matrix(0)(2) = 1

    matrix(1)(0) = 2
    matrix(1)(1) = 2
    matrix(1)(2) = 2

    matrix(2)(0) = 3
    matrix(2)(1) = 3
    matrix(2)(2) = 3*/

    for (x <- 0 to matrix.length - 1) {
      for (y <- 0 to matrix.length - 1) {
        matrix(x)(y)= x + y;
      }
    }


    //print the matrix
    for (x <- 0 to matrix.length - 1) {
      for (y <- 0 to matrix.length - 1) {
        print(" " + matrix(x)(y));
      }
      println()
    }


  }

  def main(args: Array[String]): Unit = {
       multiDim();
  }
}
