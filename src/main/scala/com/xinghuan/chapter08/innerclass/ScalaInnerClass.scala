package com.xinghuan.chapter08.innerclass

object ScalaInnerClassDemo {
  def main(args: Array[String]): Unit = {
    val outer1 : ScalaOuterClass = new ScalaOuterClass
    val outer2 : ScalaOuterClass= new ScalaOuterClass
    val inner1 = new outer1.ScalaInnerClass
    val inner2 = new outer2.ScalaInnerClass

    //创建静态内部类实例
//    val staticInner = new ScalaOuterClass.ScalaStaticInnerClass
    inner1.info()
    inner1.test(inner1)
    //在默认情况下，scala的内部类的实例和创建该内部类的实例的对象关联
    inner1.test(inner2)   //这个就不会报错了
  }
}
class ScalaOuterClass{
  myounter =>                //起了别名
  class ScalaInnerClass{
    //成员内部类
    def info(): Unit ={
      println("name=" + myounter.name + " age=" + myounter.sal)
        //用别名替代ScalaOuterClass.this
    }
    //这里有一个方法，可以接收ScalaInnerClass实例
    def test(ic : ScalaOuterClass#ScalaInnerClass): Unit ={   //类型投影
      println(ic)
    }
  }
  var name = "scott"        //外部类属性需要写在别名后面
  private var sal = 30000.9
}
//object ScalaOuterClass{ //伴生对象
//  class ScalaStaticInnerClass{
//    //静态内部类
//  }
//}