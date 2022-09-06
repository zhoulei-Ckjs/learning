package com.xinghuan.collection_;

import java.util.ArrayList;
import java.util.List;

public class CollectionMethod {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("jack");
        list.add(10);
        list.add(true);
        System.out.println("list = " + list);
        list.remove(0);
        System.out.println("list = " + list);
        list.remove(true);
        System.out.println("list = " + list);
        System.out.println(list.contains(10));
    }
}
