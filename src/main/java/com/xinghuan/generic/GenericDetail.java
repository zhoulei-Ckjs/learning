package com.xinghuan.generic;

import java.util.ArrayList;

@SuppressWarnings({"all"})
public class GenericDetail {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<Integer>();
//        List<int> ints = new ArrayList<int>();
        ArrayList<A> as = new ArrayList<>();
        Pig<A> aPig = new Pig<A>(new A());
        Pig<A> aPig2 = new Pig<A>(new B());

        ArrayList<Integer> integer = new ArrayList<>();
        ArrayList arrayList = new ArrayList();      //等价于Object
        arrayList.add("XX");
        Tiger tiger = new Tiger();
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
class Tiger<E>{
    E e;

    public Tiger(){}

    public Tiger(E e) {
        this.e = e;
    }
}