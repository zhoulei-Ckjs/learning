package com.xinghuan.chapter07.visit

object TestVisit {
  def main(args: Array[String]): Unit = {
    val person = new Person
    println(person.name)              //私有属性对visit包开放，包括visit包下面的子包
  }
}
class Clerk{
  var name: String = "jack"           //生成可读可写的方法
  private var sal : Double = 9999.9   //生成只读的方法
  def showInfo() : Unit = {
    println(" name " + name + " sal= " + sal)
  }
}
object Clerk{
  def test(c : Clerk) : Unit = {
    println("test() name=" + c.name + " sal=" + c.sal)
  }
}
class Person{
  private[visit] val name = "jack"    //private属性对visit包可见
}