package com.amsidh.scala

object CurryingExample {
    def add(x: Int, y: Int): Int = x + y

    //first way of currying
    def add1(x: Int) = (y: Int) => x + y

    //Partially applied
    def add1_First = add1(30)

    //Second way of currying
    def sum(x: Int)(y: Int) = x + y
    //Partially Applying
    def sum1 = sum(10)_
    def sum2 = sum(30)(_)

    def main(args: Array[String]): Unit = {
        println(add1_First(40))

        println(sum1(30))
        println(sum2(40))


    }

}
