package com.xinghuan.interface_;

public class InterfaceExercise01 {
    public static void main(String[] args) {
        B b = new B();
        System.out.println(b.a);
        System.out.println(B.a);
        System.out.println(A.a);
    }
}
interface A{
    int a = 23;
}
class B implements A{
}