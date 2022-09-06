package com.xinghuan.chapter06.constructor

object ConDemo04 {
  def main(args: Array[String]): Unit = {
    val worker = new Worker("simith")
    val worker1 = new Worker1("simth")
    worker1.inName
  }
}
//这种方式的参数inName就是一个局部变量
class Worker(inName: String){
  var name = inName
}
//这种方式的参数inName是Worker1的private只读属性
class Worker1(val inName : String){
  var name = inName
}
//inName是Worker2的可读写属性
class Worker2(var inName : String){
  var name = inName
}