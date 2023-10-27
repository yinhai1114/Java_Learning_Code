package com.yinhai.wrapper_;

/**
 * @author 银海
 * @version 1.0
 */
public class Integer01 {
    public static void main(String[] args) {
        //演示int -- Integer的装箱和拆箱
        //手动装箱
        int n1 = 100;
        Integer integer = new Integer(n1);
        Integer integer1 = Integer.valueOf(n1);
        //手动拆箱
        //Integer -> int
        int i = integer.intValue();

        //jdk5以后就可以自动装箱自动拆箱了
        int n2 = 200;
        //自动装箱
        Integer integer2 = n2;//底层是使用了Interger.valueOf(n2)，使用debug能看到走到valueOf;
        int n3 = integer2;//底层仍然是使用了方法integer.intValue()使用debug能看到走到intValue
    }
}
