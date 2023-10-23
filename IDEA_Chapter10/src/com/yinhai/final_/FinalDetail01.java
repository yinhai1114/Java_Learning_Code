package com.yinhai.final_;

public class FinalDetail01 {
    public static void main(String[] args) {
        new AA();
        new EE().cal();
    }
}
final class AA{
    public final double TAX_RATE1 = 0.08;
    public final double TAX_RATE2;
    public final double TAX_RATE3;
    //①定义时
    //
    //②在构造器中
    //
    //③代码块中。
    public AA(){
        TAX_RATE2 = 1.1;
    }
    {
        TAX_RATE3 = 10.0;
    }
}
class BB{
    public static final double TAX_RATE1 = 0.08;
    // public static final double TAX_RATE2;
    public static final double TAX_RATE3;
    // public AA(){
    //     TAX_RATE2 = 1.1;
    // }
    static  {
        TAX_RATE3 = 10.0;
    }
}
class DD{
    public final void cal(){
        System.out.println("cal()方法");
    }
}
class EE extends DD{

}