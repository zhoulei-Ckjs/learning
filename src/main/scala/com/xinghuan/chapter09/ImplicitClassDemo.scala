package com.xinghuan.chapter09

object ImplicitClassDemo {
  def main(args: Array[String]): Unit = {
    //DB1是一个隐式类，当我们在该隐式类的作用域范围，创建MySQL1实例，该隐式类就会生效
    implicit class DB1(val m : MySQL1){
      def addSuffix(): Unit ={
        m + " scala"
      }
    }
    val mySQL = new MySQL1
    mySQL.sayOK()
    mySQL.addSuffix()
  }
}
class MySQL1{
  def sayOK(): Unit ={
    println("sayOK")
  }
}