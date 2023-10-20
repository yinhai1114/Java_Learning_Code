package com.yinhai.homework_.homework01;

public class HomeWork01 {
    public static void main(String[] args) {
        Person[] person = new Person[3];
        person[0] = new Person("xiaowang",30,"engineer");
        person[1] = new Person("xiaohuang",18,"student");
        person[2] = new Person("laowang",66,"retire");
        Person person1 = person[0];
        person1.printArr(person);
        System.out.println("\n===========================");
        person1.sortArr(person);
        person1.printArr(person);

    }

}
class Person{
    String name;
    int age;
    String job;

    public Person(String name, int age, String job) {
        this.name = name;
        this.age = age;
        this.job = job;
    }
    public void sortArr(Person[] p){
        Person temp = null;
        for (int i = 0; i < p.length - 1; i++) {
            for (int j = 0; j < p.length - i - 1; j++) {
                if(p[j].age > p[j + 1].age){
                    temp = p[j + 1];
                    p[j + 1] = p[j];
                    p[j] = temp;
                }
            }
        }
    }
    public void printArr(Person[] p){
        for (int i = 0; i < p.length; i++) {
            System.out.println(p[i]);
        }
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", job='" + job + '\'' +
                '}';
    }
}