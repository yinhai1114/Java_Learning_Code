package com.yinhai.list_;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @author 银海
 * @version 1.0
 */
public class ListExercise01 {
    @SuppressWarnings({"ALL"})
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(new Book("三国演义", "罗贯中", 10.1));
        list.add(new Book("小李飞刀", "古龙", 5.1));
        list.add(new Book("红楼梦", "曹雪芹", 34.6));
        list.add(new Book("活着", "余华", 12.4));
        list.add(new Book("3年模拟", "新华", 60.0));
        //如何对集合进行排序
        sort(list);

        for (Object o : list) {
            //直接sout(list)的话调用的是AbstactCoolection的toShtring方法，虽然也会调用对象的toString,但格式不对
            System.out.println(o);
        }

    }
    public static void sort(List list){
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = 0; j < list.size() - i - 1; j++) {
                //取出对象
                Book book = (Book)list.get(j);
                Book book1 = (Book)list.get(j + 1);
                if (book.getPrice() < book1.getPrice()){
                    list.set(j,book1);
                    list.set(j + 1,book);
                }
            }
        }
    }
}
class Book {
    private String name;
    private String author;
    private double price;

    public Book(String name, String author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "名字=" + name + "\t\t作者=" + author + "\t\t价格=" + price;
    }
}
