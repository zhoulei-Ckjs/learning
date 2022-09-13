package com.xinghuan.generic;

import java.util.ArrayList;
import java.util.Comparator;

@SuppressWarnings({"all"})
public class GenericExercise02 {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("tom", 20000, new MyDate(2000,11, 11)));
        employees.add(new Employee("jack", 12000, new MyDate(2001,12, 12)));
        employees.add(new Employee("hsp", 50000, new MyDate(1980,10, 10)));
        System.out.println(employees);
        employees.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                if(!(o1 instanceof Employee && o2 instanceof Employee)){
                    System.out.println("类型不正确");
                    return 0;
                }

                int i = o1.getName().compareTo(o2.getName());
                if (i != 0) return i;
                return o1.getBirthday().compareTo(o2.getBirthday());
            }
        });
        System.out.println("排序后\n" + employees);
    }
}
