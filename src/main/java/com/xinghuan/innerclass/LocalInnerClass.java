package com.xinghuan.innerclass;

public class LocalInnerClass {
    public static void main(String[] args) {
        Outer02 outer = new Outer02();
        outer.m1();
        System.out.println(outer);
    }
}
class Outer02{
    private int n1 = 100;
    private void m2(){}
    public void m1(){
        class Inner02{  //局部内部类
            //可以直接访问内部类的所有成员，包含私有的
            //不能添加访问修饰符，但是可以使用final修饰
            private int n1 = 800;
            public void f1(){
                //如果想访问外部类的成员，使用外部类名.this.成员
                System.out.println("n1 = " + n1 + " 外部类n1=" + Outer02.this.n1);
                m2();
                System.out.println(Outer02.this);
            }
        }
        Inner02 inner02 = new Inner02();
        inner02.f1();
    }
}
