package com.yinhai.tankgame1_3;

import javax.swing.*;

/**
 * @author 银海
 * @version 1.0
 */
public class YinhaiTankGame01 extends JFrame {
    MyPanel myPanel = null;
    public static void main(String[] args) {
        YinhaiTankGame01 yinhaiTankGame01 = new YinhaiTankGame01();

    }

    public YinhaiTankGame01(){
        myPanel = new MyPanel();
        this.add(myPanel);
        this.setSize(1600,900);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.addKeyListener(myPanel);
        new Thread(myPanel).start();
    }
}
