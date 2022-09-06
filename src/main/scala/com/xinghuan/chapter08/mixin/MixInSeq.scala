package com.xinghuan.chapter08.mixin

object MixInSeq {
  def main(args: Array[String]): Unit = {
    val ff1 = new FF()
    println(ff1)
  }
}
trait AA{
  println("A...")
}
trait BB extends AA{
  println("B...")
}
trait CC extends BB{
  println("C...")
}
trait DD extends BB{
  println("D...")
}
class EE{
  println("E...")
}
class FF extends EE with CC with DD{
  println("F...")
}