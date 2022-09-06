package com.xinghuan.throws_;

public class ThrowException {
    public static void main(String[] args) {
        try{
            ReturnExceptionDemo.methodA();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        ReturnExceptionDemo.methodB();
    }
}
class ReturnExceptionDemo{
    static void methodA(){
        try{
            System.out.println("进入方法A");
            throw new RuntimeException("制造异常");
        }finally {
            System.out.println("用A的方法finally");
        }
    }
    static void methodB(){
        try{
            System.out.println("进入方法B");
        }finally {
            System.out.println("调用B方法的finally");
        }
    }
}