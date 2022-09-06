package com.xinghuan.final_;

public class FinalDetail02 {
    public static void main(String[] args) {
        System.out.println(BBB.num);
    }
}
class BBB{
    public static int num = 10000;
    static{
        System.out.println("BBB 静态代码块被执行");
    }
}
final class AAA{
    public final void cry(){}
}
