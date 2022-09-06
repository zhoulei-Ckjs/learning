package com.xinghuan.chapter07.myextends;

public class NoNameDemo01 {
    public static void main(String[] args) {
        A2 a2 = new A2() {      //匿名子类
            @Override
            public void cry() {
                System.out.println("cry");
            }
        };
        a2.cry();
    }
}
abstract class A2{
    abstract public void cry();
}
