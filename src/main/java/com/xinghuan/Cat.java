package com.xinghuan;

public class Cat {
    public String name = "招财猫";
    public Cat(){

    }
    public Cat(String name){
        this.name = name;
    }
    public void hi(){
        System.out.println("hi " +name);
    }
    public void cry(){
        System.out.println(name + "喵喵叫...");
    }
}