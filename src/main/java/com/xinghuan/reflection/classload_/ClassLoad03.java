package com.xinghuan.reflection.classload_;

public class ClassLoad03 {
    public static void main(String[] args) {
//        B b = new B();
        System.out.println(B.num);
    }
}
class B{
    static {
        System.out.println("B 静态代码块被执行");
        num = 300;
    }
    static int num = 100;

    public B() {
        System.out.println("B()构造函数被执行");
    }
}