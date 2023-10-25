package com.yinhai.homework10_.homework04;

/**
 * @author 银海
 * @version 1.0
 */
public class HomeWork04 {
    public static void main(String[] args) {
        CellPhone cellPhone = new CellPhone();
        cellPhone.textWork(new ICalculator() {
            @Override
            public double work(double n1, double n2) {
                return n1 + n2;
            }
        },10,18);
        cellPhone.textWork(new ICalculator() {
            @Override
            public double work(double n1, double n2) {
                return n1 * n2;
            }
        },10,18);
    }
}

interface ICalculator {
    double work(double n1 ,double n2);//接口是抽象类 不能有方法体 实现的work只是调用时的规范
}

class CellPhone {
    public void textWork(ICalculator iCalculator,double n1,double n2){
        //传入的iCal实际上运行类型是一个叫ICalculator$1的一个类
        //动态绑定之后，运行的是$1也就是匿名类的方法体，也就是说我们可以使用一次而且自己随意改变方法体的内容
        double res = iCalculator.work(n1,n2);//动态绑定
        System.out.println("结果为" + res);
    }
}
