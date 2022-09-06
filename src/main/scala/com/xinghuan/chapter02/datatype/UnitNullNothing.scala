package com.xinghuan.chapter02.datatype

object UnitNullNothing {
  def main(args: Array[String]): Unit = {
    val res = sayHello()
    println("res = " + res)
  }
  def sayHello() : Unit = {

  }
  val dog: Dog = null
}
class Dog{

}
