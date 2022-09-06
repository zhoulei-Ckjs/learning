package com.xinghuan.chapter08.mixin

object MixInPro {
  def main(args: Array[String]): Unit = {
    val mySQL = new MySQL6 with DB6 {
      override var sal: Int = _   //未初始化的字段在混入时必须初始化
    }
  }
}
trait DB6{
  var sal : Int   //未初始化的字段
  var opertype : String = "insert"  //这个字段是直接以匿名类的方式加入mySQL
  def insert(): Unit = {
  }
}
class MySQL6{
}