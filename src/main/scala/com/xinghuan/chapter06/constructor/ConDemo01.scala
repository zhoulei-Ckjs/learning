package com.xinghuan.chapter06.constructor

object ConDemo01 {
  def main(args: Array[String]): Unit = {
    val p1 = new Person("jack")   //会调用辅助构造器
    println(p1)
  }
}
class Person(inName: String, inAge: Int){
  var name: String = inName   //主构造器会执行所有语句
  var age: Int = inAge

  override def toString: String = {
    "name=" + this.name + " age" + this.age
  }
  def this(name: String){
    this(name, 10)    //辅助构造器第一句话必须是调用主构造器
  }
}
