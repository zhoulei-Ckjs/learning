package com.xinghuan.chapter07.myextends

object AbstractClassDemo01 {
  def main(args: Array[String]): Unit = {
    new Animal03 {
      override def sayhello(): Unit = {
        println("say hello")
      }
      override var food: String = _
    }.sayhello()
  }
}
abstract class Animal02{
  def sayHi(): Unit ={
    println("xxx")
  }
}
abstract class Animal03{
  def sayhello()
  var food : String
}