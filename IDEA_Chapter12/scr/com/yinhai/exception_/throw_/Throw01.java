package com.yinhai.exception_.throw_;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * @author 银海
 * @version 1.0
 */
public class Throw01 {
    public static void main(String[] args) {


    }
    //public void f1() throws Exception{
    public void f1() throws FileNotFoundException{
    //public void f1() throws ArithmeticException,NullPointerException{
        //创建一个文件流对象
        //这里的异常是FileNotFoundException
        //这里可以使用两种异常处理方法
        //1.try catch
        //2.throws 抛出异常,让调用这个f1方法的调用者(方法)处理
        //使用throws可以抛给调用者，也可以抛给父类
        //throws 关键字后也可以是异常列表,即可以抛出多个异常
        FileInputStream fi = new FileInputStream("e://aa.txt");
    }
}
