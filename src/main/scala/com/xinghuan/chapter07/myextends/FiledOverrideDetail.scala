package com.xinghuan.chapter07.myextends

object FiledOverrideDetail {
  def main(args: Array[String]): Unit = {
    val b2 : A = new B
    println(b2.sal)
  }
}
class A{
  def sal() : Int = {
    10
  }
}
class B extends A{
  override val sal : Int = 0
  // 这里可以这样覆写A类只是一个方法sal()
  // 而B类的覆写在底层只会生成get方法，即sal()
  // 会覆写A类的sal()方法
}