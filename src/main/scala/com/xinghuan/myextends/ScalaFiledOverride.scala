package com.xinghuan.myextends

object ScalaFiledOverride {
  def main(args: Array[String]): Unit = {
    val obj1 : AAA = new BBB
    val obj2 : BBB = new BBB
    //看是访问属性，其实是访问age()方法
    println("obj1.age=" + obj1.age + " obj2.age = " + obj2.age)
  }
}
class AAA{
  val age : Int = 10          //会生成public age()
}
class BBB extends AAA{
  override val age : Int = 20 //会生成public age()
}
