package com.xinghuan.generic;

import java.util.*;

public class GenericExercise {
    public static void main(String[] args) {
        HashSet<Student> students = new HashSet<>();
        boolean jack = students.add(new Student("jack", 18));
        boolean Tom = students.add(new Student("Tom", 18));
        boolean mary = students.add(new Student("mary", 18));
        for (Student student:
             students) {
            System.out.println(student);
        }
        HashMap<String, Student> stringStudentHashMap = new HashMap<String, Student>();
        stringStudentHashMap.put("tom", new Student("tom", 28));
        stringStudentHashMap.put("jack", new Student("jack", 18));
        stringStudentHashMap.put("smith", new Student("simth", 48));
        Set<Map.Entry<String, Student>> entries = stringStudentHashMap.entrySet();
        Iterator<Map.Entry<String, Student>> iterator = entries.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Student> next = iterator.next();
            System.out.println(next.getKey() + "-" + next.getValue());
        }
    }
}
class Student{
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}