package com.xinghuan.reflection.question;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

public class ReflectionQuestion {
    @SuppressWarnings({"all"})
    public static void main(String[] args) throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Properties properties = new Properties();
        properties.load(new FileInputStream("src\\main\\java\\re.properties"));
        String classfullpath = properties.get("classfullpath").toString();
        String method = properties.get("method").toString();

        //加载类，返回Class类型的对象
        Class cls = Class.forName(classfullpath);
        //通过cls得到加载的类的对象实例
        Object o = cls.newInstance();
        //通过cls得到加载类的方法
        Method method1 = cls.getMethod(method);
        //通过method1调用方法来实现调用方法
        method1.invoke(o);  //这里是方法调用对象
    }
}
