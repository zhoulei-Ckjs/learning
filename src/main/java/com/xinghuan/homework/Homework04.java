package com.xinghuan.homework;

public class Homework04 {
    public static void main(String[] args) {
        CellPhone cellPhone = new CellPhone();
        cellPhone.testWork(new Calculate() {
            @Override
            public double work(double n1, double n2) {
                return n1 + n2;
            }
        } , 10, 20);
    }
}
interface Calculate{
    public double work(double n1, double n2);
}
class CellPhone{
    public void testWork(Calculate iCalculate, double n1, double n2){
        double result = iCalculate.work(n1, n2);
        System.out.println("计算的结果是：" + result);
    }
}