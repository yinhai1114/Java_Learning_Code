package com.yinhai.homework_.homework10;

public class Doctor {
    private String name;
    private int age;
    private String job;
    private String gender;
    private double sal;

    public Doctor(String name, int age, String job, String gender, double sal) {
        this.name = name;
        this.age = age;
        this.job = job;
        this.gender = gender;
        this.sal = sal;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if(!(obj instanceof Doctor)){//如果不是子类直接返回false 避免出现不同类的指空异常
            return false;
        }
        Doctor doctor = (Doctor) obj;//是同一个类或者子类，向下转型调用特有的属性
        boolean temp = this.name.equals(doctor.name) && this.age == doctor.age &&
                this.job.equals(doctor.job) && this.gender.equals(doctor.gender) &&
                this.sal == doctor.sal;
        return temp;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }
}
