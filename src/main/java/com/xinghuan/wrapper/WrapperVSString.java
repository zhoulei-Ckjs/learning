package com.xinghuan.wrapper;

public class WrapperVSString {
    public static void main(String[] args) {
        Integer i = 100;
        String str2 = i.toString();
        String s = String.valueOf(i);
        String str4 = "12345";
        Integer i1 = Integer.parseInt(str4);
        Integer integer = new Integer(str4);
        System.out.println("ok");
    }
}
