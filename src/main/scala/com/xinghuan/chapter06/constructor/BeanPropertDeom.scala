package com.xinghuan.chapter06.constructor

import scala.beans.BeanProperty

object BeanPropertDeom {
  def main(args: Array[String]): Unit = {
    val car = new Car
    car.setName("fsalfjd")
    car.getName
  }
}
class Car{
  @BeanProperty var name : String = null
}
