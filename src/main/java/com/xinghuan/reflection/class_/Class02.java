package com.xinghuan.reflection.class_;

import com.xinghuan.Car;

import java.lang.reflect.Field;

public class Class02 {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        String classAllPath = "com.xinghuan.Car";
        Class<?> cls = Class.forName(classAllPath);
//        <?>表示不确定的java类型
        System.out.println(cls.getClass());
        System.out.println(cls.getPackage().getName());
        System.out.println(cls.getName());
        Car car = (Car)cls.newInstance();
        System.out.println(car);
        Field brand = cls.getField("brand");
        System.out.println(brand.get(car)); //获取属性
        //通过反射给属性赋值
        brand.set(car, "奔驰");
        System.out.println(brand.get(car));
        Field[] fields = cls.getFields();
        for (Field field :
                fields) {
            System.out.println(field.getName());
        }
    }
}
