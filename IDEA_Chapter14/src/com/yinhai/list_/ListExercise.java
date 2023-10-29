package com.yinhai.list_;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author 银海
 * @version 1.0
 */
public class ListExercise {
    public static void main(String[] args) {
        List list = new ArrayList();
        for (int i = 0; i < 12; i++) {
            list.add("hello" + i);
        }//在索引为1插入一个元素
        list.add(1,"hspedu");
        System.out.println("list=" + list);//在abstractCollection内有toString方法
        //获得下标为4的元素
        System.out.println("第五个元素" + list.get(4));
        //删除下标为5的元素
        list.remove(5);
        System.out.println("list" + list);
        //修改第七个元素
        list.set(6,"三国演义");
        //使用迭代器
        for (Object o : list) {
            System.out.println(o);
        }
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next);
        }

    }
}
