package com.xinghuan.chapter08.mytrait

object TraitDemo02 {
  def main(args: Array[String]): Unit = {
    val c = new C
    val f = new F
    c.getConnect()
    f.getConnect()
  }
}
trait Trait01{
  def getConnect()
}

class A{}
class B extends A{}
class C extends B with Trait01 {
  override def getConnect(): Unit = {
    println("链接mysql数据库...")
  }
}
class D{}
class E extends D{}
class F extends E with Trait01 {
  override def getConnect(): Unit = {
    println("链接oracle数据库...")
  }
}
