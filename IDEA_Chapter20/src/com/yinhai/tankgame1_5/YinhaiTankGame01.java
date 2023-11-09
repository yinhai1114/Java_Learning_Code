package com.yinhai.tankgame1_5;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Scanner;

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
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入1:新游戏 2:上一局游戏");
        String key = scanner.next();
        myPanel = new MyPanel(key);
        this.add(myPanel);
        this.setSize(1600,900);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.addKeyListener(myPanel);
        new Thread(myPanel).start();
        //增加响应关闭窗口的处理
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.out.println("检测到关闭窗口");
                Recorder.keepRecord();
                System.exit(0);
            }
        });
    }
}
