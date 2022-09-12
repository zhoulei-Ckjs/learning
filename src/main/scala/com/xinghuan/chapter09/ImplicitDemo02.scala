package com.xinghuan.chapter09

object ImplicitDemo02 {
  def main(args: Array[String]): Unit = {
    //编写一个隐式函数，丰富MySQL功能
    implicit def addDelete(mysql : MySQL): DB ={
      new DB
    }
    val mySQL = new MySQL
    mySQL.insert()
    mySQL.delete()    //使用了隐式转换
    mySQL.update()    //使用了隐式转换
  }
}
class MySQL{
  def insert(): Unit ={
    println("insert")
  }
}
class DB{
  def delete(): Unit ={
    println("delete")
  }
  def update(): Unit ={
    println("update")
  }
}