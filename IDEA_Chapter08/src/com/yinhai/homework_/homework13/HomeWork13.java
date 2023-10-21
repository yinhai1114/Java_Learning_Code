package com.yinhai.homework_.homework13;

public class HomeWork13 {
    public static void main(String[] args) {
        Student student = new Student("xiaowang", "nan", 18, "011114");
        Teacher teacher = new Teacher("Mr.chen", "nan", 30, 10);
        student.printInfo();
        System.out.println("-------------------------");
        teacher.printInfo();

        System.out.println("========================================================");
        //7.多态数组
        Person[] people = new Person[4];
        people[0] = new Student("xiao", "nv", 14, "011514");
        people[1] = new Student("wang", "nan", 1, "000000");
        people[2] = new Teacher("Mr.wang", "nan", 70, 30);
        people[3] = new Teacher("Ms.chen", "nv", 50, 20);

        //创建一个对象为homework13 调用排序方法
        HomeWork13 homework13 = new HomeWork13();
        homework13.sortArr(people);
        System.out.println("=====================排序后的数组=========================");
        for (int i = 0; i < people.length; i++) {
            System.out.println(people[i]);
            System.out.println();
        }
        System.out.println("========================================================");
        //调用子类特有方法uniqueMethod
        homework13.useUniqueMethod(people[0]);
        homework13.useUniqueMethod(people[3]);

    }
    public void sortArr(Person[] people){//排序方法
        Person temp = null;
        for (int i = 0; i < people.length - 1; i++) {
            for (int j = 0; j < people.length - i - 1; j++) {
                if(people[j].getAge() < people[j + 1].getAge()){
                    temp = people[j];
                    people[j] = people[j + 1];
                    people[j + 1] = temp;
                }
            }
        }
    }
    public void useUniqueMethod(Person p){//调用方法
        if(p instanceof Student){
            Student p1 = (Student)p;
            p1.study();
        }
        if(p instanceof Teacher){
            Teacher p1 = (Teacher)p;
            p1.teach();
        }

    }
}
