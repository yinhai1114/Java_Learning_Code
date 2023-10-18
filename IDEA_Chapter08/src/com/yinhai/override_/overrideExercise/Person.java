package com.yinhai.override_.overrideExercise;

public class Person {
    private String name;
    private int age;
    Person(String name,int age){
        this.name = name;
        this.age = age;
    }
    public String say(){
        return name + " " + age;
    }
}
