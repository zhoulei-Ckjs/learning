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
    public void api_02() throws ClassNotFoundException {
        //得到Class对象
        Class<?> aClass = Class.forName("com.xinghuan.reflection.Person");
//        //获取本类中所有属性
//        Field[] declaredFields = aClass.getDeclaredFields();
//        for (Field declaredField:
//             declaredFields) {
//            System.out.println("本类中所有属性= " + declaredField.getName() + " 该属性的修饰符 " + declaredField.getModifiers()
//                    + " 该属性的类型：" + declaredField.getType());
//        }
//        Method[] declaredMethods = aClass.getDeclaredMethods();
//        for (Method declaredMethod :
//                declaredMethods) {
//            System.out.println("本类中所有方法=" + declaredMethod.getName() + " 该方法的修饰符 " + declaredMethod.getModifiers()
//                    + " 该方法的返回类型：" + declaredMethod.getReturnType());
//            Class<?>[] parameterTypes = declaredMethod.getParameterTypes();
//            System.out.print("该方法的形参类型为=");
//            for (Class<?> parameterType : parameterTypes) {
//                System.out.print(" " + parameterType);
//            }
//            System.out.println();
//        }
        Constructor<?>[] constructors = aClass.getConstructors();               //获取所有Public修饰的构造器
        for (Constructor<?> constructor : constructors){
            System.out.println(constructor.getName());
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            for (Class<?> parameterType : parameterTypes) {
                System.out.println("\t该构造器的形参类型=" + parameterType);
            }
        }
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
    protected static int age;
    String job;
    private double sal;
    public Person() {
    }
    public Person(String name) {
    }
    public Person(String name, int age) {
    }
    public void m1(String name, int age, double sal){

    }
    protected String m2(){
        return null;
    }
    void m3(){

    }
    private void m4(){

    }
}