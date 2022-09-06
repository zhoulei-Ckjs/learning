package com.xinghuan.innerclass;

/**
 * 演示匿名内部类的使用
 */
public class AnonymousInnerClass {
    public static void main(String[] args) {
        Outer04 outer04 = new Outer04();
        outer04.method();
    }
}
class Outer04{
    private int n1 = 10;
    public void method(){
        IA tiger = new IA(){   //匿名内部类Outer04$1为匿名类的底层名字
            @Override
            public void cry() {
                System.out.println("老虎叫唤...");
            }
        };
        tiger.cry();
        System.out.println(tiger.getClass());
        /*  下面匿名内部类相当于一个对象继承了Father
            class Outer04$2 extends Father{}
         */
        Father jack = new Father("jack"){
            @Override
            public void test() {    //匿名内部类重写了test方法
                System.out.println("匿名内部类重写了test方法");
            }
        };
        jack.test();
        System.out.println(jack.getClass());
        /*
            基于抽象类的匿名内部类
            这个匿名内部类名字为Outer04$3 #$3是第三个匿名内部类
         */
        Animal animal = new Animal(){
            @Override
            void eat() {
                System.out.println("必须重写该方法");
            }
        };
        animal.eat();
        System.out.println(animal.getClass());
    }
}
interface IA{
    void cry();
}

class Father{
    public Father(String name){
        super();
    }
    public void test(){

    }
}
abstract class Animal{
    abstract void eat();
}
