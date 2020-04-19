package com.amsidh.scala

class User(var name: String, var age: Int) {

  def this() {
    this("Amsidh", 37)
  }

  def this(name: String) {
    this(name, 6)
  }
}


object ClassInScala {
  def main(args: Array[String]): Unit = {
    val user1: User = new User("Amsidh", 37)
    val user2: User = new User()
    val user3 = new User("Aditya")
  }
}
