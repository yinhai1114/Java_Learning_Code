package com.yinhai.generic;

import java.util.*;

/**
 * @author 银海
 * @version 1.0
 */
public class GenericExercise01 {
    public static void main(String[] args) {
        Student student1 = new Student("小王");
        Student student2 = new Student("小马");
        Student student3 = new Student("小黄");
        HashSet<Student> hashSet = new HashSet<Student>();
        hashSet.add(student1);
        hashSet.add(student2);
        hashSet.add(student3);

        HashMap<String, Student> hashMap = new HashMap<String, Student>();
        hashMap.put(student1.getName(),student1);
        hashMap.put(student2.getName(),student2);
        hashMap.put(student3.getName(),student3);

        System.out.println("=========I遍历获取hashSet=======");
        for (Student student :hashSet) {
            System.out.println(student.getName());
        }
        Iterator iterator = hashSet.iterator();
        System.out.println("==========迭代器获取hashSet======");
        while (iterator.hasNext()) {
            Student next = (Student)iterator.next();
            System.out.println(next.getName());
        }
        System.out.println("=========I遍历获取hashMap内的entry=======");
        Set<Map.Entry<String, Student>> entries = hashMap.entrySet();
        for (Map.Entry entry : entries) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        System.out.println("=========获取key值========");
        Set<String> strings = hashMap.keySet();
        for (String key : strings) {
            System.out.println(key + " " + hashMap.get(key));
        }

        System.out.println("========迭代器取出entry========");
        Set<Map.Entry<String, Student>> entries1 = hashMap.entrySet();
        Iterator<Map.Entry<String, Student>> iterator1 = entries1.iterator();
        while (iterator1.hasNext()) {
            Map.Entry next =  iterator1.next();
            System.out.println(next.getKey() + " " +next.getValue());
        }
    }
}
class Student{
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}