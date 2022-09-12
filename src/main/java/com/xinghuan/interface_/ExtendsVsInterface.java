package com.xinghuan.interface_;

public class ExtendsVsInterface {
    public static void main(String[] args) {
        LittleMonkey littleMonkey = new LittleMonkey("悟空");
        littleMonkey.climbing();
        littleMonkey.swimming();
        littleMonkey.flying();
    }
}
interface Fishable{
    void swimming();
}
interface Birdable{
    void flying();
}
class Monkey implements Fishable, Birdable{
    private String name;

    public Monkey(String name) {
        this.name = name;
    }

    public void climbing(){
        System.out.println(name + "会爬树");
    }

    public String getName() {
        return name;
    }

    @Override
    public void swimming() {
        System.out.println(getName() + " 通过学习，可以像鱼儿一样游泳");
    }

    @Override
    public void flying() {
        System.out.println(getName() + " 通过学习，可以像鸟儿一样飞翔");
    }
}
class LittleMonkey extends Monkey{
    public LittleMonkey(String name) {
        super(name);
    }
}