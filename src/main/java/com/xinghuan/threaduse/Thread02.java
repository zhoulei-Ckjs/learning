package com.xinghuan.threaduse;

public class Thread02 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        //创建一个Thread，来调用start方法，底层利用了代理模式
        Thread thread = new Thread(dog);
        thread.start();
    }
}

//代理人模式
class ThreadProxy implements Runnable{
    private Runnable target = null;
    @Override
    public void run() {
        if(target != null){
            target.run();
        }
    }
    public ThreadProxy(Runnable target) {
        this.target = target;   //target实现了run方法
    }
    public void start(){
        start0();       //start0是真正实现了多线程
    }
    public void start0(){
        run();
    }
}

class Dog implements Runnable{
    int count = 0;
    @Override
    public void run() {
        while(true){
            System.out.println("count = " + (++count));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if(count == 10)
                break;
        }
    }
}