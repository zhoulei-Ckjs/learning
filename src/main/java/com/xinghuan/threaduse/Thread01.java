package com.xinghuan.threaduse;

public class Thread01 {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.start();

    }
}
class Cat extends Thread{
    @Override
    public void run() {     //重写run方法，写上自己的业务逻辑
        System.out.println("笑笑，我是小猫咪:" + Thread.currentThread().getName());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}