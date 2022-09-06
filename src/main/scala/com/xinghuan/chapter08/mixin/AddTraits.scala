package com.xinghuan.chapter08.mixin

//混入多个特质
object AddTraits {
  def main(args: Array[String]): Unit = {
    //创建MySQL4实例时，动态的混入DB4和File4
    //初始化时是从左向右初始化
    val mysql = new MySQL4 with DB4 with File4
    //当我们执行一个动态混入对象的方法，其执行顺序是从右向左开始执行
    mysql.insert(100)
  }
}
trait Operate4{
  println("Operate4...")  //会在底层生成一个构造器并调用这个
  def insert(id : Int)    //抽象方法
}
trait Data4 extends Operate4{
  println("Data4")
  override def insert(id: Int): Unit = {  //实现/重写insert方法
    println("插入数据 = " + id)
  }
}
trait DB4 extends Data4{
  println("DB4")
  override def insert(id: Int): Unit = {
    println("向数据库")
    super.insert(id)
  }
}
trait File4 extends Data4{
  println("File4")
  override def insert(id: Int): Unit = {
    println("向文件")
    super.insert(id)  //调用了insert方法，这里super在动态混入时，不一定时父类
  }
}
class MySQL4{}