package com.yinhai.object_.equals_.equalsexercise;


public class EqualsExercise01 {
    public static void main(String[] args) {
        Person person = new Person();
        Person person1 = new Person();
        System.out.println(person.equals(person1));
    }
}
class Person {
    private String name;
    private int age;
    private char gender;


    public boolean equals(Object b) {
        if (this == b) {
            return true;


        }
        if (b instanceof Person) {
            Person p = (Person) b;
            // why we need transition down? because we need to getting unicon parameter of b;
            return this.name.equals(p.name) && this.age == p.age && this.gender == p.gender;
            //why this.name.equals(p.name) this statement running not method of class Person?
            //because want to use equals method in current method,that statement is equals(p);
            //but this running "String" of method used this.name.equals()
        }
        return false;

    }

}