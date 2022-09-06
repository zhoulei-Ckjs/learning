package com.xinghuan.static_;

public class VisitStatic {
    public static void main(String[] args) {
        System.out.println(A.name);
        System.out.println((new A()).name);
    }
}
class A{
    public static String name = "jlfdjsalf";
}