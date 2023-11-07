package com.yinhai.outputstream;

import java.io.Serializable;

public class Dog implements Serializable {
    private String name;
    private int age;
    private String form;
    private String color;

    public Dog(String name, int age, String form, String color) {
        this.name = name;
        this.age = age;
        this.form = form;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", form='" + form + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }
}
