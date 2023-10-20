package com.yinhai.homework_.homework04;

public class Manager extends Employee {
    private double salary;
    private double bonus = 0;
    public Manager(String name, double dailySalary, int workdays) {
        super(name, dailySalary, workdays);
        this.salary = 1000 + dailySalary * workdays * 1.2;
    }

    public void printSalary(){
        System.out.println("这是" + getName() + "的工资为" + salary);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
