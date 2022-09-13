package com.xinghuan.chapter07.scalapackage.importDetails


object TestImport {
  def main(args: Array[String]): Unit = {

  }
}
class User{
import scala.beans.BeanProperty
  @BeanProperty var name : String = ""
}
class Dog{
//  @BeanProperty var name : String = ""
}