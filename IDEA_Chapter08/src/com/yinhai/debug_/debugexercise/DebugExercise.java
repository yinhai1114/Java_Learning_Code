package com.yinhai.debug_.debugexercise;

//Demonstrates the process of object creation
public class DebugExercise {
    public static void main(String[] args) {
        //process of object creation
        //1.load Person class information
        //2.initialization 1)default initialization 2)explicit initialization 3)constructor initialization
        //3.return address of object
        Person person = new Person("Jack",20);
        System.out.println(person);
    }
}
class Person{
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
