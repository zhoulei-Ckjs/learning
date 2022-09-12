package com.xinghuan.reflection.class_;

import com.xinghuan.reflection.Cat;

public class Class01 {
    public static void main(String[] args) throws ClassNotFoundException {
//        Cat cat = new Cat();
        Class<?> aClass = Class.forName("com.xinghuan.reflection.Cat");
        Class<?> aClass1 = Class.forName("com.xinghuan.reflection.Cat");
        System.out.println(aClass.hashCode());
        System.out.println(aClass1.hashCode());
        Class<?> aClass2 = Class.forName("com.xinghuan.reflection.Dog");
        Cat cat = new Cat();
        Cat cat1 = new Cat();
        System.out.println(aClass2.hashCode());
    }
}
