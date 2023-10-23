package com.yinhai.abstract_;

public class AbstractDetail02 {
    public static void main(String[] args) {
        D.nihao();

    }
}
abstract class H{
    // private abstract void hi();
    // public final abstract void hi();
    // static abstract void hi();8)抽象方法不能使用private,final和static来修饰，因为这些关键字都是和重写相违背的。
}
class E{
    public static void hi(){

    }
}
class F extends E{

}
class G extends E{
    // public void hi() {//这里G类子类实现了父类E的抽象方法，就是有方法体

}

abstract class D{
    public int n1 = 10;
    public static String name = "yinhai";
    public D(){

    }
    {

    }
    static {

    }
    public abstract void hello();
    public void ok(){

    }
    public static void nihao (){

    }
}
