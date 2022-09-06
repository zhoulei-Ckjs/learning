package com.xinghuan.chapter08.homework

object Exercise04 {
  def main(args: Array[String]): Unit = {
    println(Suits)
    println(Suits.isRed(Suits.Diamond))
    println(Suits.isRed(Suits.Spade))
  }
}
object Suits extends Enumeration{
  type Suits = Value
  val Spade = Value("A")
  val Club = Value("B")
  val Heart = Value("C")
  val Diamond = Value("D")

  override def toString() : String = {
    Suits.values.mkString(",")
  }
  def isRed(card : Suits) = card == Heart || card == Diamond
}
