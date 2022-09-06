package com.xinghuan.chapter06.constructor

object ConDemo03 {
  def main(args: Array[String]): Unit = {
    val p1 = new Person01("fsd")    //只能调用辅助构造器，不给参数会报错
  }
}
class Person01 private (){
  var name: String = _
  var age: Int = _
  def this(name: String){
    this()
    this.name = name
  }
  def this(name : String, age : Int){
    this
    this.name = name
    this.age = age
  }
  def this(age : Int){
    this("匿名")  //间接调用主构造器，因为def this(name : String)中调用了主构造器
    this.age = age
  }
  def showInfo(): Unit = {
    println("person信息如下：")
    println("name = " + this.name)
    println("age = " + age)
  }
}