package com.yinhai.homework_.homework04;

public class Staff extends Employee {
    private double salary;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Staff(String name, double dailySalary, int workdays) {
        super(name, dailySalary, workdays);
        this.salary = dailySalary * workdays * 1.0;
    }
    public void printSalary(){
        System.out.println("这是" + getName() + "的工资为" + salary);
    }
}
