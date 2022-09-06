package com.xinghuan.thrift_server2.service;


import com.xinghuan.thrift_server2.User;
import com.xinghuan.thrift_server2.UserService;
import org.apache.thrift.TException;

public class UserServiceImpl implements UserService.Iface {
    public static String Name_ = "";
    public static int bytes_ = 102400;      //实验所传递的字节个数
    User user = new User();
    public UserServiceImpl(){
        bytes_ /= 10;                   //这里是因为下面的Name_为10个10个的加的
        for (int i = 0; i < bytes_; i++) {
            Name_ += "abcdefghij";
        }
        user.setName(Name_);
        user.setAge(10);
        user.setId(1);
        user.setId(user.name.hashCode());
        System.out.println("user的大小为：" + user.name.length() + "个字符");
    }
    @Override
    public User getById(int id) throws TException {
//        System.out.println("======调用getById======");
        return user;
    }

    @Override
    public boolean isExist(String name) throws TException {
        return false;
    }
}
