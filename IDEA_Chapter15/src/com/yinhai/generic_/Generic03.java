package com.yinhai.generic;

/**
 * @author 银海
 * @version 1.0
 */
public class Generic03 {
    public static void main(String[] args) {
        Person<String> stringPerson = new Person<String>("Hello");
        //E表示s的数据类型，该数据类型在定义Person对象的时候指定，即在编译期间，就确定E是什么类型
        /*
        class Person{//创建Person对象的时候指定
            String name;//String表示s的数据类型


            public Person(String name) {//String可以是参数类型
                this.name = name;
            }
            public String f(){//返回类型使用String
                return name;
            }
        }
        */
        Person<Integer> integerPerson = new Person<>(1500);
        //E表示s的数据类型，该数据类型在定义Person对象的时候指定，即在编译期间，就确定E是什么类型
        /*
        class Person{//创建Person对象的时候指定
            Integer name;//Integer表示s的数据类型


            public Person(Integer name) {//Integer可以是参数类型
                this.name = name;
            }
            public Integer f(){//返回类型使用Integer
                return name;
            }
        }
         */
    }
}
class Person<E>{//创建Person对象的时候指定
    E name;//E表示s的数据类型，该数据类型在定义Person对象的时候指定，即在编译期间，就确定E是什么类型


    public Person(E name) {//E可以是参数类型
        this.name = name;
    }
    public E f(){//返回类型使用E
        return name;
    }
}