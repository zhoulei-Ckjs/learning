package com.xinghuan.chapter05.fun

object Detail02 {
  def main(args: Array[String]): Unit = {

  }
  def getSum(n1 : Int, n2 : Int): Unit = {
    return n1 + n2
  }
  def func(s : String) : Any ={
    if(s.length >= 3)
      s + "123"
    else
      3
  }
}