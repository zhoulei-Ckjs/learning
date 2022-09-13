package com.xinghuan.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflecCreateInstance {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Class<?> userClass = Class.forName("com.xinghuan.reflection.User");
        //newInstance创建对象
        Object o = userClass.newInstance();
        System.out.println(o);
        //通过pulic的有参构造器创建实例
        Constructor<?> constructor = userClass.getConstructor(String.class);    //getConstructor是获取public的构造器
        Object xinghuan = constructor.newInstance("hanshunping");       //创建对象实例
        System.out.println(xinghuan);

        //通过非pulic的有参构造器创建实例
        Constructor<?> constructor1 = userClass.getDeclaredConstructor(int.class, String.class);    //getDeclaredConstructor是获取所有的构造函数
        constructor1.setAccessible(true);       //对私有方法进行爆破，使其可以被访问，使用反射可以访问private构造器
        Object o1 = constructor1.newInstance(100, "张三丰");
        System.out.println(o1);
    }
}
class User{
    private int age = 10;
    private String name = "xinghuan";
    public User(){
    }
    public User(String name){
        this.name = name;
    }
    private User(int age, String name){
        this.age = age;
        this.name = name;
    }
    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}