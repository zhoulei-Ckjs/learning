package com.xinghuan.generic.improve;

public class Generic03 {
    public static void main(String[] args) {
        Person<String> stringPerson = new Person<String>("jfdas");
        stringPerson.show();
    }
}
class Person<T>{
    T s;
    public Person(T s) {
        this.s = s;
    }
    public T f(){
        return s;
    }
    public void show(){
        System.out.println(s.getClass());
    }
}
