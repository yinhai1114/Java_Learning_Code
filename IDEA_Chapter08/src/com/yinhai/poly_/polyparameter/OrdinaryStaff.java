package com.yinhai.poly_.polyparameter;

public class OrdinaryStaff extends Employee{

    public void work(){
        System.out.println(getName() + " working...");
    }
    public int getAnnual(){
        return  super.getAnnual();
    }

    public OrdinaryStaff(String name, int salary) {
        super(name, salary);
    }
}
