package com.xinghuan.homework;

public class HomeWork05 {
    public static void main(String[] args) {
        A a = new A();
        a.f1();
    }
}
class A{
    private String NAME = "hello";
    public void f1(){
        class B{
            private final String NAME = "星环科技";
            public void show(){
                System.out.println("NAME=" + NAME);
                System.out.println("name=" + A.this.NAME);
            }
        }
        B b = new B();
        b.show();
    }
}
