package com.xinghuan.chapter08.innerclass

object ScalaInnerClassDemo {
  def main(args: Array[String]): Unit = {
    val outer1 : ScalaOuterClass = new ScalaOuterClass
    val outer2 : ScalaOuterClass= new ScalaOuterClass
    val inner1 = new outer1.ScalaInnerClass
    val inner2 = new outer2.ScalaInnerClass

    //创建静态内部类实例
    val staticInner = new ScalaOuterClass.ScalaStaticInnerClass
  }
}
class ScalaOuterClass{
  class ScalaInnerClass{
    //成员内部类
  }
}
object ScalaOuterClass{ //伴生对象
  class ScalaStaticInnerClass{
    //静态内部类
  }
}