package com.yinhai.poly_.polyparameter;

public class Manger extends Employee{
    private int bones;
    public int getAnnual(){
        return super.getAnnual();
    }

    public Manger(String name, int salary,int bones) {
        super(name, salary);
        this.bones = bones;
    }
    public void manage(){
        System.out.println(getName() + " managing...");
    }

    public int getBones() {
        return bones;
    }

    public void setBones(int bones) {
        this.bones = bones;
    }
}
