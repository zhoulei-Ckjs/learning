package com.xinghuan.innerclass;

public class InnerClassExercise01 {
    public static void main(String[] args) {
        f1(new IL() {
            @Override
            public void show() {
                System.out.println("这是一副名画");
            }
        });
        f1(new Picture());
    }
    //静态方法，形参就是接口类型
    public static void f1(IL il){
        il.show();
    }
}
interface IL{
    void show();
}
class Picture implements IL{

    @Override
    public void show() {
        System.out.println("这是一副名画");
    }
}