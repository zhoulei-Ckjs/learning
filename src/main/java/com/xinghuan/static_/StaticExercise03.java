package com.xinghuan.static_;

class Person{
    private int id;
    private static int total = 0;
    public static void setTotalPerson(int total){
        Person.total = total;
    }
    public Person(){
        total++;
        id = total;
    }
}

public class StaticExercise03 {
    public static void main(String[] args) {
        Person.setTotalPerson(3);
        new Person();
    }
}
