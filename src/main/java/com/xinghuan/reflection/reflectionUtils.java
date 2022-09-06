package com.xinghuan.reflection;

import org.junit.Test;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * 演示如何通过反射获取类的结构信息
 */
public class reflectionUtils {
    public static void main(String[] args) {
    }
    @Test
    public void aip_01() throws ClassNotFoundException {
        Class<?> aClass = Class.forName("com.xinghuan.reflection.Person");      //取得class对象
        System.out.println(aClass.getName());       //获取全类名
        System.out.println(aClass.getSimpleName()); //获取简单类名
        Field[] fields = aClass.getFields();        //获取public修饰属性，包含本类和父类
        for (Field field : fields){
            System.out.println(field.getName());
        }
        Field[] declaredFields = aClass.getDeclaredFields();    //获取本类中所有属性
        for (Field field : declaredFields){
            System.out.println(field.getName());
        }
        Method[] methods = aClass.getMethods();                 //获取所有public修饰的方法
        for (Method method : methods){
            System.out.println(method);
        }
        Method[] declaredMethods = aClass.getDeclaredMethods(); //获取本类所有的方法
        for (Method method : declaredMethods){
            System.out.println(method);
        }
        Constructor<?>[] constructors = aClass.getConstructors();               //获取所有Public修饰的构造器
        for (Constructor<?> constructor : constructors){
            System.out.println(constructor.getName());
        }
        Constructor<?>[] declaredConstructors = aClass.getDeclaredConstructors();   //获取本类中所有构造器
        for (Constructor<?> declaredConstructor : declaredConstructors) {
            System.out.println(declaredConstructor.getName());
        }
        System.out.println(aClass.getPackage());                //获取包名
        System.out.println(aClass.getSuperclass());             //获取父类的class
        Class<?>[] interfaces = aClass.getInterfaces();         //获取接口
        for (Class<?> anInterface : interfaces) {
            System.out.println(anInterface);
        }
        Annotation[] annotations = aClass.getAnnotations();     //获取注解信息
        for (Annotation annotation : annotations) {
            System.out.println(annotation);
        }
    }
}
class A{
    public String hobby;
    public void hi(){
    }
    public A() {
    }
}
interface IA{
}
interface IB{
}
@Deprecated
class Person extends A implements IA, IB{
    public String name;
    protected int age;
    String job;
    private double sal;
    public Person() {
    }
    public Person(String name) {
    }
    public Person(String name, int age) {
    }
    public void m1(){

    }
    protected void m2(){

    }
    void m3(){

    }
    private void m4(){

    }
}