package com.yinhai.homework_.homework11;

public class HomeWork11 {
    public static void main(String[] args) {
        Person student = new Student();//向上转型 //编译类型是Person 运行类型是Student
        //所以能调用的应该是Person类内的所有方法
        //但运行时的方法看运行类型，因为run被重写了，所以在编译阶段能写的如下
        student.run();
        student.eat();
        //而运行时，run方法是Student内的，eat则是Person内的 输出 student run 和 person eat
        Student student1 = (Student)student;//向下转型，这时候编译类型是Student
        //此时编译阶段能调用子类特有的方法，即study。以及父类的所有方法，因为是继承关系，所以都有
        System.out.println("================================");
        student1.run();
        student1.study();
        student1.eat();
        //运行时，根据查找关系，run study是Student类内的，而eat是Person类内的
        //输出 student run    student study    person  eat

    }
}
