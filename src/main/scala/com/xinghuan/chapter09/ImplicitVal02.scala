package com.xinghuan.chapter09

object ImplicitVal02 {
  def main(args: Array[String]): Unit = {
    implicit val name : String = "scala"
//    implicit val name1 : String = "world"   //如果存在两个类型匹配的隐式参数，则在调用hello时会报错，ambiguous
    def hello(implicit content : String = "jack"): Unit ={
      println("Hello " + content)
    }
    hello       //hello scala，这个是因为编译器在底层直接将implicit的name传递给hello了，就是调用hello$1(name)
    hello()     //hello jack，这个是无参会使用函数默认值
  }
}
