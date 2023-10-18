package com.yinhai.override_.overrideExercise;

public class Student extends Person{
    private String id;
    private int score;

    public Student(String name, int age, String id, int score) {
        super(name, age);
        this.id = id;
        this.score = score;
    }

    public String say(){
        return super.say() + " " + id + " " + score;
    }
}
