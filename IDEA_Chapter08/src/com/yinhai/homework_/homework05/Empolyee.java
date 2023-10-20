package com.yinhai.homework_.homework05;

public class Empolyee {
    private double sal;

    public void printSal(){
        System.out.println("的年工资为" + sal * 12);
    }

    public Empolyee(double sal) {
        this.sal = sal;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }
}
