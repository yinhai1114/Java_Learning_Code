package com.yinhai.override_.overrideExercise;

public class OverrideExercise {
    public static void main(String[] args) {
        Person person = new Person("jack",99);
        Student student = new Student("yinhai",18,"20011114",95);
        System.out.println(person.say());
        System.out.println(student.say());
    }
}
