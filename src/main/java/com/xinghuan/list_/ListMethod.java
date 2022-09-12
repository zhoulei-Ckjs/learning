package com.xinghuan.list_;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings({"all"})
public class ListMethod {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("张三丰");
        list.add("贾宝玉");
        list.add(1, "韩顺平");
        System.out.println(list);

        List list1 = new ArrayList();
        list1.add("jack");
        list1.add("tom");
        list1.add("韩顺平");
        list.addAll(1, list1);
        System.out.println(list);
        System.out.println(list.indexOf("tom"));
        System.out.println(list.lastIndexOf("韩顺平"));

        list.remove(0);
        list.set(1, "玛丽");
        System.out.println(list.subList(0, 2));
    }
}
