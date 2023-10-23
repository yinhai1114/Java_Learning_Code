package com.yinhai.abstract_;

public class AbstractExercise01 {
    public static void main(String[] args) {
        CommonEmployee xiaowang = new CommonEmployee("xiaowang", "11111", 20000);
        Maanager laochen = new Maanager("laochen", "1111321", 1000000, 500000);
        xiaowang.work();
        laochen.work();
    }
}
abstract class Employee{
    private String name;
    private String id;
    private double salary;

    public Employee(String name, String id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    public abstract void work();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
class Maanager extends Employee{
    private double bonus;

    public Maanager(String name, String id, double salary, double bonus) {
        super(name, id, salary);
        this.bonus = bonus;
    }

    public void work(){
        System.out.println("经理 " + getName() + "正在工作中");
    }
}
class CommonEmployee extends Employee{
    public void work(){
        System.out.println("普通员工 " + getName() + "正在工作中");
    }

    public CommonEmployee(String name, String id, double salary) {
        super(name, id, salary);
    }
}