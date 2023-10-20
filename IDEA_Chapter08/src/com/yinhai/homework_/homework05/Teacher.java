package com.yinhai.homework_.homework05;

public class Teacher extends Empolyee{
    private int classDay;
    private double classSal;

    public Teacher(double sal, int classDay, double classSal) {
        super(sal);
        this.classDay = classDay;
        this.classSal = classSal;
    }
    public void printSal(){
        System.out.print("老师的工资为" + (getSal() * 12 + classSal * classDay) + "\n");

    }
}
