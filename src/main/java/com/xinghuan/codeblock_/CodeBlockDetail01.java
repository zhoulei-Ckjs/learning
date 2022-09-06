package com.xinghuan.codeblock_;

public class CodeBlockDetail01 {
    public static void main(String[] args) {
        //创建实例时
//        AA aa = new AA();
//        System.out.println(Cat.n1);
//        System.out.println(Cat.n1);

//        DD animal = new DD();
        System.out.println(DD.n1);
    }
}
class DD{
    public static int n1 = 8888;
    static {
        System.out.println("DD 的静态代码块");
    }
    {
        System.out.println("DD 的普通代码块");
    }
}
class Animal{
    static {
        System.out.println("Animal的静态代码块。。。");
    }
}
class Cat extends Animal{
    public static int n1 = 999;
    static {
        System.out.println("Cat的静态代码块1被执行。。。");
    }
}
class BB{
    static{
        System.out.println("BB 的静态代码块");
    }
}
class AA extends BB{
    static {
        System.out.println("AA 的静态代码块1被执行了...");
    }
}
