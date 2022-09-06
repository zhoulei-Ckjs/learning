package com.xinghuan.collection_;

import java.util.ArrayList;

public class CollectionFor {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Book("三国演绎", "罗贯中", 10.1));
        arrayList.add(new Book("小李飞刀", "古龙", 5.1));
        arrayList.add(new Book("红楼梦", "曹雪芹", 34.6));
        for (Object book :
                arrayList) {
            System.out.println(book);
        }


    }
}
