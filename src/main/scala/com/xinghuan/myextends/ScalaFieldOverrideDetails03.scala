package com.xinghuan.myextends

object ScalaFieldOverrideDetails03 {
  def main(args: Array[String]): Unit = {

  }
}
//对于抽象的属性，在底层不会生成对应的属性声明，而是生成两个对应的抽象方法（name name_$eq）
abstract class A03{
  var name : String //如果没有给赋值，则默认为抽象的，则类也为抽象的
  var age : Int = 10
}
class Sub_A03 extends A03{
  override var name: String = _
//  override var age : Int = 20   //不可以对变量进行重写
}