package com.yinhai.homework_.homework13;

public class Teacher extends Person{

    private int work_age;

    public Teacher(String name, String sex, int age, int work_age) {
        super(name, sex, age);
        this.work_age = work_age;
    }

    public int getWork_age() {
        return work_age;
    }

    public void setWork_age(int work_age) {
        this.work_age = work_age;
    }
    public void teach(){
        System.out.println("我会认真教书");
    }

    @Override
    public String play() {
        return super.play() + "爱玩象棋";
    }

    @Override
    public String toString() {
        return "老师的信息:\n" + super.toString() + "工龄:"+ work_age ;
    }
    public void printInfo(){
        System.out.println(toString());
        teach();
        System.out.println(play());

    }
}
