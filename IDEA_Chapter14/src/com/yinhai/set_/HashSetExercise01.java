package com.yinhai.set_;

import java.util.HashSet;
import java.util.Objects;

/**
 * @author 银海
 * @version 1.0
 */
public class HashSetExercise01 {
    public static void main(String[] args) {
        HashSet set = new HashSet();
        Employeee xiaowang = new Employeee("xiaowang", 18, "2000", "12", "20");
        Employeee xiaoming = new Employeee("xiaoming", 30, "2000", "12", "20");
        Employeee employee = new Employeee("Mr.w", 30, "2000", "12", "20");
        Employeee xiaowang2 = new Employeee("xiaowang", 40, "2000", "12", "20");
        Employeee xiaowang3 = new Employeee("xiaowang", 18, "2001", "01", "01");
        set.add(xiaowang);//添加
        set.add(xiaoming);//添加
        set.add(employee);//添加
        set.add(xiaowang2);//不添加
        set.add(xiaowang3);//添加
        System.out.println(set);
    }
}

class Employeee {
    private String name;
    private int age;
    private MyDate birthday;

    class MyDate {
        private String year;
        private String month;
        private String day;

        public MyDate(String year, String month, String day) {
            this.year = year;
            this.month = month;
            this.day = day;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            MyDate myDate = (MyDate) o;
            return Objects.equals(year, myDate.year) &&
                    Objects.equals(month, myDate.month) &&
                    Objects.equals(day, myDate.day);
        }

        @Override
        public int hashCode() {
            return Objects.hash(year, month, day);
        }

        @Override
        public String toString() {
            return "\tyear='" + year +
                            "\tmonth='" + month +
                            "\tday='" + day +
                            '}';
        }


    }

    public Employeee(String name, int age, String year, String month, String day) {
        this.name = name;
        this.age = age;
        birthday = new MyDate(year, month, day);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employeee employee = (Employeee) o;
        return this.name.equals(employee.name) && this.birthday.equals(employee.birthday);
    }

    @Override
    public int hashCode() {
        return Objects.hash(birthday.hashCode(), name);
    }

    @Override
    public String toString() {
        return "Employee" +
                "\tname=" + name +
                "\tage=" + age +
                 birthday + '\n' ;
    }
}
