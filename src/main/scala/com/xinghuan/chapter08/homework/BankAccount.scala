package com.xinghuan.chapter08.homework

object BankAccount {
  def main(args: Array[String]): Unit = {
    val account = new CheckingAccount(100)
    account.withdraw(10)
    account.query()
    account.deposit(10)
    account.query()
  }
}
class BankAccount(initialBalance : Double){
  private var balance = initialBalance
  def deposit(amount : Double) = {
    balance += amount
  }
  def withdraw(amount : Double) = {
    balance -= amount
    balance
  }
  def query(): Unit ={
    println("当前余额为" + this.balance)
  }
}
class CheckingAccount(initialBalance : Double) extends BankAccount(initialBalance){
  override def deposit(amount: Double): Unit = super.deposit(amount - 1)
  override def withdraw(amount: Double): Double = super.withdraw(amount + 1)
}
