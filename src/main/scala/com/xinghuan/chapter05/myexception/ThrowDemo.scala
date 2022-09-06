package com.xinghuan.chapter05.myexception

object ThrowDemo {
  def main(args: Array[String]): Unit = {
    val res = test()
    //如果我们希望在test()抛出异常后，代码可以继续执行，则我们需要处理
    println(res.toString)
  }
  def test(): Nothing = {
    throw new Exception("不对")
  }
}
