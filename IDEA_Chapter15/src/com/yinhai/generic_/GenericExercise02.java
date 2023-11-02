package com.yinhai.generic;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * @author 银海
 * @version 1.0
 */
/*
定义Employee类

1)该类包含: private成员变量name,sal,birthday, 其中birthday为MyDate类的对象;

2)为每一个属性定义getter, setter方法;

3)重写toString方法输出name, sal, birthday

4)MyDate类包含: private成员变量month,day,year;并为每一个属性定义gettesetter方法;

5)创建该类的3个对象，并把这些对象放入ArrayList集合中(ArrayList 需使用泛型来定义)，对集合中的元素进行排序，并遍历输出:排序方式:调用ArrayList 的sort方法，传入Comparator对象[使用泛型]，先按name排序，如果name相同，则按生日日期的先后排序。

 */
public class GenericExercise02 {
    public static void main(String[] args) {
        Empolyee empolyee = new Empolyee("xiaowang", 1800, "12", "30", "2001");
        Empolyee empolyee1 = new Empolyee("xiaohua", 2321, "7", "24", "2010");
        Empolyee empolyee2 = new Empolyee("xiaoming", 312, "1", "30", "1999");
        Empolyee empolyee3 = new Empolyee("xiaoming", 312, "1", "30", "1922");
        ArrayList<Empolyee> empolyees = new ArrayList<>();
        empolyees.add(empolyee);
        empolyees.add(empolyee1);
        empolyees.add(empolyee2);
        empolyees.add(empolyee3);
        System.out.println("========sort before========");
        System.out.println(empolyees);
        empolyees.sort(new Comparator<Empolyee>() {
            @Override
            public int compare(Empolyee emp1, Empolyee emp2) {
                int i;
                if (!(emp1 instanceof Empolyee && emp2 instanceof Empolyee)) {
                    System.out.println("类型不正确..");
                    return 0;
                }
                //比较name
                i = emp1.getName().compareTo(emp2.getName());
                if (i != 0) {
                    return i;
                }
                return  emp1.getBirthday().compareTo(emp2.getBirthday());
            }
            });
        System.out.println("========sort done ===========");
        System.out.println(empolyees);
        }
    }

    class Mydate implements Comparable<Mydate>{
        private String month;
        private String day;
        private String year;


        public Mydate(String month, String day, String year) {
            this.month = month;
            this.day = day;
            this.year = year;
        }

        @Override
        public int compareTo(Mydate o) {
            int i;
            if( (i = year.compareTo(o.year)) != 0){
                return i;
            }
            if( (i = month.compareTo(o.month)) != 0){
                return i;
            }
            if( (i = day.compareTo(o.day)) != 0){
                return i;
            }
            return 0;
        }

        public String getMonth() {
            return month;
        }

        public void setMonth(String month) {
            this.month = month;
        }

        public String getDay() {
            return day;
        }

        public void setDay(String day) {
            this.day = day;
        }

        public String getYear() {
            return year;
        }

        public void setYear(String year) {
            this.year = year;
        }

        @Override
        public String toString() {
            return "Mydate{" +
                    "month='" + month + '\'' +
                    ", day='" + day + '\'' +
                    ", year='" + year + '\'' +
                    '}' + "\n";
        }
    }

    class Empolyee {
        private String name;
        private int sal;
        Mydate birthday;

        public Empolyee(String name, int sal, String month, String day, String year) {
            this.name = name;
            this.sal = sal;
            birthday = new Mydate(month, day, year);
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getSal() {
            return sal;
        }

        public void setSal(int sal) {
            this.sal = sal;
        }

        public Mydate getBirthday() {
            return birthday;
        }

        public void setBirthday(Mydate birthday) {
            this.birthday = birthday;
        }

        @Override
        public String toString() {
            return "Empolyee{" +
                    "name='" + name + '\'' +
                    ", sal=" + sal +
                    ", birthday=" + birthday +
                    '}';
        }
    }