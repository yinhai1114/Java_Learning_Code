package com.yinhai.homework_.homework04;

public class Employee {
    private String name;
    private double dailySalary;
    private int workdays;

    public Employee(String name, double dailySalary, int workdays) {
        this.name = name;
        this.dailySalary = dailySalary;
        this.workdays = workdays;
    }

    public void printSalary(){
        System.out.println(dailySalary);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDailySalary() {
        return dailySalary;
    }

    public void setDailySalary(double dailySalary) {
        this.dailySalary = dailySalary;
    }

    public int getWorkdays() {
        return workdays;
    }

    public void setWorkdays(int workdays) {
        this.workdays = workdays;
    }
}
