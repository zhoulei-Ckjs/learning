package com.xinghuan.chapter08.mytrait

object TraitDemo03 {
  def main(args: Array[String]): Unit = {
    val sheep = new Sheep
    sheep.sayHi()
    sheep.sayHello()
  }
}
trait Trait03{
  def sayHi()
  def sayHello(): Unit ={
    println("sya hello")
  }
}
class Sheep extends Trait03{
  override def sayHi(): Unit = {
    println("小羊say hi~~")
  }
}