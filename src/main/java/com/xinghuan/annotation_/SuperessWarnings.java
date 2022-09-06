package com.xinghuan.annotation_;

import java.util.ArrayList;

public class SuperessWarnings {
    @SuppressWarnings({"rawtypes","unchecked","unused"})
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("jack");
        arrayList.add("tom");
        arrayList.add("mary");
        int i;
        System.out.println(arrayList.get(1));
    }
}
