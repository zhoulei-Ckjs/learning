package com.xinghuan.chapter07.myextends

object ScalaBaseConstructor {
  def main(args: Array[String]): Unit = {
    val emp = new Emp700("mary")
  }
}
class Person700{
  var name = "张三"
  println("Person...")
}
class Emp700 extends Person700{
  println("Emp...")

  def this(name : String){
    this
    this.name = name
    println("Emp 辅助构造器")
  }
}
