package com.xinghuan.chapter08.homework

/**
 * Scala单例设计模式
 */
object SingleDemo {
  def main(args: Array[String]): Unit = {
    val dog = Dog
    val dog2 = Dog
    println(dog == dog2)  //发现两只狗是相同的
  }
}
class Dog private(){}
object Dog{
  var singleDog : Dog = null
  def apply() : Dog={   //提供apply方法使得不需要new对象，直接使用类名就可以创建对象
    if (singleDog == null){
      singleDog = new Dog
    }
    singleDog
  }
}