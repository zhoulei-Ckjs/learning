package com.xinghuan.chapter08.mixin

object MixInDemo01 {
  def main(args: Array[String]): Unit = {
    val oracleDB = new OracleDB with Operate3 //动态混入
    oracleDB.insert(100)
    val mySQL = new MySQL3 with Operate3
    mySQL.insert(200)

    //如果一个抽象类有抽象方法，如何动态混入特质
    val mySql_ = new MySQL3_ with Operate3 {
      override def say(): Unit = {
        println("say")
      }
    }
    mySql_.insert(999)
    mySql_.say()
  }
}
trait Operate3{
  def insert(id : Int): Unit ={
    println("插入数据 = " + id)
  }
}
class OracleDB{}
abstract class MySQL3{}
abstract class MySQL3_{
  def say()
}