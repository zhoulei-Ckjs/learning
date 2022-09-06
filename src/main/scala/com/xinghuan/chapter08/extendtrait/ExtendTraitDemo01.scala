package com.xinghuan.chapter08.extendtrait

object ExtendTraitDemo01 {
  def main(args: Array[String]): Unit = {

  }
}
trait LoggedException extends Exception{
  def log() : Unit = {
    println(getMessage)
  }
}
//UnHappyException就是Exception的子类
class UnHappyException extends LoggedException{
  override def getMessage = "消息错误"
}
//正确，IndexOutOfBoundsException是LoggedException父类Exception的子类
class UnHappyException2 extends IndexOutOfBoundsException with LoggedException{
  override def getMessage = "消息错误"
}
class CCC{}
//错误，CCC不是LoggedException的父类Exception的子类
//class UnHappyException3 extends CCC with LoggedException{
//  override def getMessage = "消息错误"
//}