package com.yinhai.poly_.poly01;

public class Poly01 {

    public static void main(String[] args) {
        Master master = new Master("Jack");
        Dog dog = new Dog("xiaoYellow");
        Bone bone = new Bone("gutou");
        master.feed(dog, bone);//that run type is dog ,can passing in Base class of Animal
        //in other words,this is one way to used polymorphism,compil type not equal to run type

        System.out.println(" ================== ");
        Cat cat = new Cat("xiaoWeith");
        Fish fish = new Fish("zayu");
        master.feed(cat, fish);
    }

}
