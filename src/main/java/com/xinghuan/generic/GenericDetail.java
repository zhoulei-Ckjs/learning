package com.xinghuan.generic;

import java.util.ArrayList;

public class GenericDetail {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<Integer>();
//        List<int> ints = new ArrayList<int>();
        ArrayList<A> as = new ArrayList<>();
        Pig<A> aPig = new Pig<A>(new A());
        Pig<A> aPig2 = new Pig<A>(new B());

        ArrayList<Integer> integer = new ArrayList<>();
    }
}
class A{}
class B extends A{}
class Pig<E>{
    E e;

    public Pig(E e) {
        this.e = e;
    }
}