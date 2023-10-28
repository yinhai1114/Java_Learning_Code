package com.yinhai.array_;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author 银海
 * @version 1.0
 */
public class ArraysExercise {
    public static void main(String[] args) {
        /*
        案例：自定义Book类，里面包含name和price，按price排序(从大到小)。
        要求使用两种方式排序 , 有一个 Book[] books = 4本书对象.

        使用前面学习过的传递 实现Comparator接口匿名内部类，也称为定制排序。
        [同学们完成这个即可 10min  ],
        可以按照 price (1)从大到小 (2)从小到大 (3) 按照书名长度从大到小

         */

        Book[] books = new Book[4];
        books[0] = new Book("红楼梦", 100);
        books[1] = new Book("金瓶梅新", 90);
        books[2] = new Book("青年文摘20年", 5);
        books[3] = new Book("java从入门到放弃~", 300);
        arrCustom(books, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
               Book book1 = (Book)o1;
               Book book2 = (Book)o2;
               int temp =(int)(book1.getPrice() - book2.getPrice());
                return temp;
            }
        });
        System.out.println(Arrays.toString(books));
        arrCustom(books, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Book book1 = (Book)o1;
                Book book2 = (Book)o2;
                int temp =(int)(book1.getPrice() - book2.getPrice());
                return -temp;
            }
        });
        System.out.println(Arrays.toString(books));
        arrMintoMax(books);
        System.out.println(Arrays.toString(books));
        arrMaxtoMin(books);
        System.out.println(Arrays.toString(books));
        arrNameLength(books);
        System.out.println(Arrays.toString(books));
    }
    public static void arrMaxtoMin(Book[] books){//记得是引用赋值，改变这个books main方法内的也会改变
        //price从大到小
        Book temp;
        for (int i = 0; i < books.length - 1; i++) {
            for (int j = 0; j <books.length - i - 1; j++) {
                if(books[j].getPrice() < books[j + 1].getPrice()){
                    temp = books[j];
                    books[j] = books[j + 1];
                    books[j + 1] = temp;
                }
            }
        }
    }
    public static void arrMintoMax(Book[] books){
        //price从小到大
        Book temp;
        for (int i = 0; i < books.length - 1; i++) {
            for (int j = 0; j < books.length - i - 1; j++) {
                if(books[j].getPrice() > books[j + 1].getPrice()){
                    temp = books[j];
                    books[j] = books[j + 1];
                    books[j + 1] = temp;
                }
            }
        }
    }
    public static void arrCustom(Book[] books,Comparator c){
        //定制
        Book temp;
        for (int i = 0; i < books.length - 1; i++) {
            for (int j = 0; j < books.length - i - 1; j++) {
                if(c.compare(books[j],books[j + 1]) > 0){
                    temp = books[j];
                    books[j] = books[j + 1];
                    books[j + 1] = temp;
                }
            }
        }
    }
    public static void arrNameLength(Book[] books){
        //书名长度从大到小
        Book temp;
        for (int i = 0; i < books.length - 1; i++) {
            for (int j = 0; j < books.length - i - 1; j++) {
                if(books[j].getName().length() < books[j + 1].getName().length()){
                    temp = books[j];
                    books[j] = books[j + 1];
                    books[j + 1] = temp;
                }
            }
        }
    }
}

class Book {
    private String name;
    private double price;

    public Book(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}