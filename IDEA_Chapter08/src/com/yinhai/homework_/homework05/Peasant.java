package com.yinhai.homework_.homework05;

public class Peasant extends Empolyee {
    public Peasant(double sal) {
        super(sal);
    }
    public void printSal(){
        System.out.print("农民");
        super.printSal();
    }
}
