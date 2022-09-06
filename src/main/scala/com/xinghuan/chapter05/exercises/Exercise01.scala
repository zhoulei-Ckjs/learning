package com.xinghuan.chapter05.exercises
import java.util.Scanner
import scala.io

object Exercise01 {
  def main(args: Array[String]): Unit = {
    println("请输入1-9之间")

    val scanner = new Scanner(System.in)
    val n = scanner.nextInt()
    print99(n)
  }
  def print99(n : Int): Unit ={
    for (i <- 1 to n){
      for(j <- 1 to i){
        printf("%d * %d = %d", j, i, j * i)
      }
      println()
    }
  }
}
