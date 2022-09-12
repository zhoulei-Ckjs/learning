package com.xinghuan.chapter09

object ImplicitDemo01 {
  def main(args: Array[String]): Unit = {
    implicit def f1(double: Double) : Int = {
      double.toInt
    }
    implicit def f2(f : Float): Int ={
      f.toInt
    }
    val num : Int = 3.5   //这里自动利用了f1做隐式转换，如果没有f1，则会报错
    val num2 : Int = 4.5f //
  }
}
