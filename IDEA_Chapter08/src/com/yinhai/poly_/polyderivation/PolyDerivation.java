package com.yinhai.poly_.polyderivation;

public class PolyDerivation {
    public static void main(String[] args) {
        Master master = new Master("Jack");
        Dog dog = new Dog("xiaoYellow");
        Bone bone = new Bone("gutou");
        master.feed(dog,bone);
        System.out.println(" ================== ");
        Cat cat = new Cat("xiaoWeith");
        Fish fish = new Fish("zayu");
        master.feed(cat,fish);
    }
}