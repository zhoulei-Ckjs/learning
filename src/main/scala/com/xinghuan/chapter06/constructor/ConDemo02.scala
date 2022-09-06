package com.xinghuan.chapter06.constructor

object ConDemo02 {
  def main(args: Array[String]): Unit = {
    val a = new AA
  }
}
class B{
  println("b~~~")
}
class AA extends B{
  def this(name: String){
    this  //调用A的主构造器，调用之前隐式调用父类的主构造器
    println("A this(name: String)")
  }
}