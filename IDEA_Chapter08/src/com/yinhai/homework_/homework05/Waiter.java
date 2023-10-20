package com.yinhai.homework_.homework05;

public class Waiter extends Empolyee{
    public Waiter(double sal) {
        super(sal);
    }
    public void printSal(){
        System.out.print("服务员");
        super.printSal();
    }
}
