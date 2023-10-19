package com.yinhai.object_.equals_;

public class EqualsExercise02 {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "xiaowang";
        Person p2 = new Person();
        p2.name = "xiaowang";
        System.out.println(p1 == p2);//f different address
        System.out.println(p1.name.equals(p2.name));//t use String of method
        System.out.println(p1.equals(p2));//f different address
        String s1 = new String("asdf");
        String s2 = new String("asdf");
        System.out.println(s1.equals(s2));//t same above
        System.out.println(s1 == s2);//f
    }
}

class Person{
    public String name;
}