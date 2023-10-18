package com.yinhai.poly_.poly01;

public class Master {
    private String name;

    public Master(String name) {
        this.name = name;
    }
    //now,can use polymorphism to solve that problem
    public void feed(Animal animal,Food food){//compil type is Animal can point to object of Animal's subclasses
        //compil type is Food can point to object of Food's subclasses
        //can passing in all object of subclasses of compil type
        System.out.println("Master " + name + " feed " + animal.getName() + " " + food.getName());
    }
    public void feed(Cat cat, Fish fish){
        System.out.println("Master " + name + " feed " + cat.getName() + " " + fish.getName());
    }
}

