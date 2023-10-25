package com.yinhai.homework10_.homework01;

/**
 * @author 银海
 * @version 1.0
 */
public class HomeWork01 {
    public static void main(String[] args) {
        Car c =new Car();//无参构造时改变color为red
        Car c1=new Car(100);//price改为100，是c1对象的值
        System.out.println(c);//out 9 red
        System.out.println(c1);//out 100 red

    }
}
class Car{
    double price=10;
    static String color="white";//静态方法，共享属性
    public String toString(){
        return price+"\t"+color;
    }
    public Car(){
        this.price=9;
        this.color="red";
    }
    public Car(double price){
        this.price=price;
    }
}
