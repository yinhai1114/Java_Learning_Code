package com.yinhai.exception_.throw_;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * @author 银海
 * @version 1.0
 */
public class ThrowsDetail {
    public static void main(String[] args) throws FileNotFoundException {
        f1();
        f4();
    }
    public static void f1()throws FileNotFoundException{
        f3();//抛出异常 因为这个f3()方法抛出的是编译异常
        // 即这时要求f1也必须显式的处理这个编译异常可以throw抛给父类
    }
    public static void f3()throws FileNotFoundException{
        // FileInputStream fi = new FileInputStream("e://aa.txt");
    }
    public static void f4(){
        f5();
    }
    public static void f5() throws RuntimeException{
        //对于抛出的是RunTime时的异常，f4调用f5编译器并不会报错，不需要再显式的定义throws

    }
}
class Father{//父类
    public void method() throws RuntimeException{

    }
}
class Son extends Father{
    //子类重写父类的方法时，对抛出异常的规定:
    // 子类重写的方法，所抛出的异常类型要么和父类抛出的异常一致，要么为父类方法抛出的异常的类型的子类型
    @Override
    public void method() throws NullPointerException{//Null 是Runtime 的子类所以没有报错
    // public void method() throws Exception{//Null 是Runtime 的子类所以没有报错

    }
}