package com.yinhai.poly_.polydetail03;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class polyDetail03 {
    public static void main(String[] args) {
        BB bb = new BB();
        System.out.println(bb instanceof BB);//true
        System.out.println(bb instanceof AA);//true
        AA aa = new BB();//compilation type is AA,run type is BB
        System.out.println(aa instanceof AA);//true
        System.out.println(aa instanceof BB);//true ,so judgement of run type
        Object o = new Object();
        System.out.println(o instanceof AA);//false

    }
}
class AA{

}
class BB extends AA{

}