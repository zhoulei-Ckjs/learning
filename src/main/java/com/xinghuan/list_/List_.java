package com.xinghuan.list_;

import java.util.ArrayList;
import java.util.List;

public class List_ {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("jack");
        list.add("tom");
        list.add("tom");
        list.add("mary");
        list.add("hsp");
        System.out.println(list);
        System.out.println(list.get(3));
    }
}
