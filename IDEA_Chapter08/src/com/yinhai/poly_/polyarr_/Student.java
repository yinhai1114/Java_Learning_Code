package com.yinhai.poly_.polyarr_;

public class Student extends Person{
    private double score;
    public Student(String name, int age,int score) {
        super(name, age);
        this.score = score;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String say() {
        return super.say() + " score=" + score;
    }
    public void study(){
        System.out.println(super.getName() + " studying...");
    }
}
