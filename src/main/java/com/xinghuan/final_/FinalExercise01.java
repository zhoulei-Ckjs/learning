package com.xinghuan.final_;

public class FinalExercise01 {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        System.out.println(circle.calArea());
    }
}
class Circle{
    private double radius;
    private final double PI;
    public double calArea(){
        return PI * radius * radius;
    }
    public Circle(double radius) {
        this.radius = radius;
    }
    {
        PI = 3.14;
    }
}