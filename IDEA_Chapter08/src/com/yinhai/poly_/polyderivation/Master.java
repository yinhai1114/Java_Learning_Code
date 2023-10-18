package com.yinhai.poly_.polyderivation;

public class Master {
    private String name;

    public Master(String name) {
        this.name = name;
    }

    public void feed(Dog dog,Bone bone){
        System.out.println("Master " + name + " feed " + dog.getName() + " " + bone.getName());
    }
    public void feed(Cat cat,Fish fish){
        System.out.println("Master " + name + " feed " + cat.getName() + " " + fish.getName());
    }
}

