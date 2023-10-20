package com.yinhai.homework_.homework03;

public class Lecturer extends Teacher{
    private double salary;
    private double grade = 1.1;
    public Lecturer(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }
    public void introduce(){
        System.out.println("===========这是讲师的信息===========");
        System.out.println(this + ", salary " + salary + ", grade" + grade);
    }
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
