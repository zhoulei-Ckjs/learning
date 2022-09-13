package com.xinghuan.chapter09

object ImplicitDemo03 {
  def main(args: Array[String]): Unit = {
    implicit val str1 : String = "jack"   //这个就是隐式值
    hello   //没有给传递参数，会自动去寻找implicit隐式值
    def hello(implicit name : String): Unit ={
      println(name + " hello")
    }
  }
}
