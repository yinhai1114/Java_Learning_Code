package com.yinhai.homework_.homework05;

public class Scienist extends Empolyee{
    private double bonus;

    public Scienist(double sal, double bonus) {
        super(sal);
        this.bonus = bonus;
    }
    public void printSal(){
        System.out.print("科学家的工资为" + (getSal() * 12 + bonus));
    }
}
