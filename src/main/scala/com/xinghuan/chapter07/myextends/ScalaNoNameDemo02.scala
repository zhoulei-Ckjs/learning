package com.xinghuan.chapter07.myextends

object ScalaNoNameDemo02 {
  def main(args: Array[String]): Unit = {
    val monster = new Monster {
      override var name: String = _

      override def cry(): Unit = {
        println("ok...")
      }
    }
    monster.cry()
  }
}
abstract class Monster{
  var name: String
  def cry()
}
