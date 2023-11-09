package com.yinhai.tankgame1_5;

import java.util.Vector;

/**
 * @author 银海
 * @version 1.0
 */
public class Test {
    public static void main(String[] args) {
        Vector<Integer> wrongDirect = new Vector<>();
        int a = -1;
        wrongDirect.add(a);
        System.out.println(wrongDirect);
        a = 1000000;
        System.out.println(wrongDirect);
        wrongDirect.add(-1);
        System.out.println(wrongDirect);
        Vector<Integer> wrongDirects = new Vector<>();

        wrongDirects.add(2);
        wrongDirects.add(3);
        wrongDirects.add(1);
        wrongDirects.add(4);
        System.out.println(wrongDirects);
        // wrongDirects.add(0);

        Vector<Integer> containsVector = new Vector<>();
        containsVector.add(0);
        containsVector.add(1);
        containsVector.add(2);
        containsVector.add(3);
        containsVector.add(3);
        containsVector.add(3);
        containsVector.add(3);
        if(wrongDirects.containsAll(containsVector)){
            System.out.println("0123都存在");
        }
        wrongDirects.removeAll(containsVector);
        System.out.println(wrongDirects);
    }
}
