package com.xinghuan.chapter06.oop

object PropertyDemo {
  def main(args: Array[String]): Unit = {
    val person = new Person3
    println(person.Name)
    val a = new A
    println(a.var2)
  }
}
class Person3{
  var Name = null
}
class A{
  var var1 : String = _
  var var2 : Byte = _
  var var3 : Double = _
  var var4 : Boolean = _
}