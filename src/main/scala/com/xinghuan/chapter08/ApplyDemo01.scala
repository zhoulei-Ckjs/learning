package com.xinghuan.chapter08

object ApplyDemo01 {
  def main(args: Array[String]): Unit = {
    val list = List(1, 2, 5)
    println(list)
    val pig = new Pig("小花")
    val pig2 = Pig("小黑猪") //会自动触发apply(pName)
    val pig3 = Pig()
    println(pig2.name)
    println(pig3.name)
  }
}
class Pig(pName : String){
  var name : String = pName

}
object Pig{
  //编写一个apply
  def apply(pName : String) : Pig = new Pig(pName)
  def apply() : Pig = new Pig("匿名猪猪")
}
