package com.xinghuan.chapter07.myextends;

public class JavaDynamicBind {
    public static void main(String[] args) {
        AA obj = new BB();
//        System.out.println(obj.sum());
//        System.out.println(obj.sum1());
        System.out.println(obj.i);
    }
}
class AA{
    public int i = 10;
    public int sum(){
        return getI() + 10;
    }
    public int sum1(){
        return i + 10;
    }
    public int getI(){
        return i;
    }
}
class BB extends AA{
    public int i = 20;
    public int sum(){
        return i + 20;
    }
    public int getI(){
        return i;
    }
    public int sum1(){
        return i + 10;
    }
}