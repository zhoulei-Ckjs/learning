package com.xinghuan.chapter05.myexception

object ScalaExceptionDemo {
  def main(args: Array[String]): Unit = {
    try{
      val r = 10 / 0
    }catch {
      case ex: ArithmeticException => println("捕获了除数为零得算数异常")
      case ex: Exception => println("捕获了异常")
    }finally {
      println("scala finally...")
    }
  }
}
