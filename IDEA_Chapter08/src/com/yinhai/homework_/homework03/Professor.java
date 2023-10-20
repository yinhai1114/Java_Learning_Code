package com.yinhai.homework_.homework03;

public class Professor extends Teacher{
    private double salary;
    private double grade = 1.3;

    public Professor(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }
    public void introduce(){
        System.out.println("===========这是教授的信息===========");
        System.out.println(this + ", salary " + salary + ", grade" + grade);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

}
