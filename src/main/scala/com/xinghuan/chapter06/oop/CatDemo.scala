package com.xinghuan.chapter06.oop

object CatDemo {
  def main(args: Array[String]): Unit = {
    val cat = new Cat
    cat.name = "小白"   //会调用setter方法
    cat.age = 10
    cat.color = "白色"
  }
}
class Cat{
  //当我们声明了var name : String时，在底层对应private
  //同时生成getter和setter方法
  var name : String = ""
  var age : Int = _
  var color : String = _
}
