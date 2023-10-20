package com.yinhai.homework_.homework05;

public class Worker extends Empolyee{
    public Worker(double sal) {
        super(sal);
    }
    public void printSal(){
        System.out.print("工人");
        super.printSal();
    }
}
