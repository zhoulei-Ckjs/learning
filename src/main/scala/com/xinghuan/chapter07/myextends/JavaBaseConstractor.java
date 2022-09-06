package com.xinghuan.chapter07.myextends;

public class JavaBaseConstractor {
    public static void main(String[] args) {
        B b = new B();
    }
}
class AAA{
    public AAA() {
        System.out.println("A()");
    }
    public AAA(String name){
        System.out.println("A(String name)" + name);
    }
}
class BBB extends AAA{
    public BBB() {
        System.out.println("B()");
    }
    public BBB(String name){
        super(name);
        System.out.println("B(String name)" + name);
    }
}
