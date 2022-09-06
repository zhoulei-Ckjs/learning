package com.xinghuan.reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class reflection02 {
    public static void main(String[] args) throws ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException {
        m1();
        m2();
        m3();
    }
    public static void m1(){
        Cat cat = new Cat();
        long start = System.currentTimeMillis();
        for(int i = 1; i < 900000000; i++){
            cat.hi();
        }
        long end = System.currentTimeMillis();
        System.out.println("传统方式调用耗时：" + (end - start));
    }
    //反射机制调用方法
    public static void m2() throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Class<?> aClass = Class.forName("com.xinghuan.reflection.Cat");
        Object o = aClass.newInstance();
        Method hi = aClass.getMethod("hi");
        long start = System.currentTimeMillis();
        for(int i = 1; i < 900000; i++){
            hi.invoke(o);
        }
        long end = System.currentTimeMillis();
        System.out.println("反射机制调用耗时：" + (end - start));
    }

    public static void m3() throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Class<?> aClass = Class.forName("com.xinghuan.reflection.Cat");
        Object o = aClass.newInstance();
        Method hi = aClass.getMethod("hi");
        hi.setAccessible(true);     //访问检查的开关关闭
        long start = System.currentTimeMillis();
        for(int i = 1; i < 900000; i++){
            hi.invoke(o);
        }
        long end = System.currentTimeMillis();
        System.out.println("反射机制调用耗时：" + (end - start));
    }
}
