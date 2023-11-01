package com.yinhai.homework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author 银海
 * @version 1.0
 */
public class Homework01 {
    public static void main(String[] args) {
        News news1 = new News("新冠确诊病例超千万，数百万印度教信徒赴恒河“圣浴”引民众担忧");
        News news2 = new News("男子突然想起2个月前钓的鱼还在网兜里，捞起一看赶紧放生");
        List list = new ArrayList();
        list.add(news1);
        list.add(news2);
        News temp;
        for (int i = list.size() - 1; i >= 0; i--) {
            temp = (News) list.get(i);
            if (temp.getTitle().length() > 15) {
                String temp1 = temp.getTitle().substring(0,15) + "...";
                System.out.println(temp1);
            } else {
                System.out.println(temp.getTitle());
            }

        }
    }
}

class News {
    private String title;
    private String context;

    public News(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    @Override
    public String toString() {
        return "News{" +
                "title='" + title + '\'' +
                ", context='" + context + '\'' +
                '}';
    }
}
