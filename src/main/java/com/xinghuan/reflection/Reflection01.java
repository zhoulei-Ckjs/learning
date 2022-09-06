package com.xinghuan.reflection;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Properties;

public class Reflection01 {
    public static void main(String[] args) throws Exception {
        Properties properties = new Properties();
        properties.load(new FileInputStream("src\\main\\java\\re.properties"));
        String methodName = properties.get("method").toString();
        String classfullpath = properties.get("classfullpath").toString();
        Class cls = Class.forName(classfullpath);
        Object o = cls.newInstance();
        System.out.println("o的运行类型=" + o.getClass());
        Method method = cls.getMethod(methodName);
        System.out.println("======================");
        method.invoke(o);
        //getField获取字段
        Field name = cls.getField("name");  //getField不能获得私有属性
        System.out.println(name.get(o));
        //getConstructor获取构造器
        Constructor constructor = cls.getConstructor();
        Constructor constructor1 = cls.getConstructor(String.class);
        System.out.println(constructor1);
    }
}
