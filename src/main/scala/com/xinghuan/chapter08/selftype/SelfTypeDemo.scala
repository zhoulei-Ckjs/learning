package com.xinghuan.chapter08.selftype



object SelfTypeDemo {
  def main(args: Array[String]): Unit = {

  }
}
//自身类型的主要目的是防止在混入的时候两者之间嵌套的使用
//Logger就是自身类型特质，当这里做了自身类型后，那么
//就相当于trait Logger extends Exception，要求混入该特质的类也是Exception的子类
trait Logger{
  //明确告诉编译器，我就是Exception，如果没有这句话，下面的getMessage不能调用
  this:Exception =>
  def log(): Unit = {
    //既然我就是Exception，那么就可以调用其中的方法
    println(getMessage)
  }
}
//class Console extends Logger{}              //这个类不是Exception子类，会报错
class Console extends Exception with Logger //正确，首先要是Exception子类