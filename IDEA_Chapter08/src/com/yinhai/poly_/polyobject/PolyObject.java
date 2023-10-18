package com.yinhai.poly_.polyobject;

public class PolyObject {
    public static void main(String[] args) {
        //The characteristics of object polymorphism
        Animal animal = new Dog(); //The compile type is determined of Animal class
        //But opera type is Dog of class
        animal.cry();//because when run this line,system will find opera type of object,and its Dog of class
        //so cry's method is Dog of class,system output "Dog crying...."
        animal = new Cat(); //attention,right here that compil type still of Animal,but run type is change to Cat class
        animal.cry();//now,system should be output "Cat crying..."
    }
}
