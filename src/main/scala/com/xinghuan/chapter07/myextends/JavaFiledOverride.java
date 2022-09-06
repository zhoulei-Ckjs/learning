package com.xinghuan.chapter07.myextends;

public class JavaFiledOverride {
    public static void main(String[] args) {
        Sub2 c1 = new Sub2();
        System.out.println(c1.s);
        Super2 c2 = new Sub2();
        System.out.println(c2.s);
    }
}
class Super2{
    String s = "super";
}

class Sub2 extends Super2{
    String s = "sub";
}
