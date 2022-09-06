package com.xinghuan.final_;

public class FinalDetail01 {
    public static void main(String[] args) {

    }
}
class AA{
    public final double TAX_RATE = 0.08;    //定义时赋值
    public final double TAX_RATE2;
    public final double TAX_RATE3;

    public AA() {       //可以在构造器中赋初值
        this.TAX_RATE2 = 3;
    }
    {                   //也可以在代码块中赋初值
        TAX_RATE3 = 5;
    }
}
class BB{
    public static final double TAX_RATE = 99.9;
    public static final double TAX_RATE2 ;
    static {
        TAX_RATE2 = 10;
    }
}
