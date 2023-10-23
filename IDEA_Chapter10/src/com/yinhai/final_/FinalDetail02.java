package com.yinhai.final_;

public class FinalDetail02 {
    public static void main(String[] args) {
        System.out.println(BBB.num);
    }
}
class BBB{
    public final static int num = 10000;
    //final和static往往搭配使用，效率更高，不会导致类加载底层编译器做了优化处理。
    static {
        System.out.println("BBB代码块被执行");
    }
}