package com.yinhai.homework;

import java.util.TreeSet;

/**
 * @author 银海
 * @version 1.0
 */
public class Homework04 {
    public static void main(String[] args) {

        TreeSet treeSet = new TreeSet();
        treeSet.add("hsp");
        treeSet.add("tom");
        treeSet.add("king");
        treeSet.add("hsp");//加入不了
        System.out.println(treeSet);


    }
}
