package com.yinhai.collection_;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * @author 银海
 * @version 1.0
 */
public class CollectionIterator {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {

        Collection col = new ArrayList();

        col.add(new Book("三国演义", "罗贯中", 10.1));
        col.add(new Book("小李飞刀", "古龙", 5.1));
        col.add(new Book("红楼梦", "曹雪芹", 34.6));
        System.out.println("col=" + col);
        //希望遍历该集合
        //1.先得到col对应的迭代器
        Iterator iterator = col.iterator();
        //2.使用while循环遍历
        while(iterator.hasNext()){//判断是否还有数据
            //返回下一个元素，类型是Object
            Object obj = iterator.next();
            System.out.println("obj" + obj);
        }
        //快捷键，快速的生成while循环->itit (Ctrl +J 可以显示快捷模版)
        //
        //3.当退出while循环后，这是iterator迭代器指向最后的元素
        //iterator.next();//NoSuchElementException
        //4.再次遍历需要重置我们的迭代器
        iterator = col.iterator();
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
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}
