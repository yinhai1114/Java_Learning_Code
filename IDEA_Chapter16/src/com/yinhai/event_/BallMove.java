package com.yinhai.event_;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * @author 银海
 * @version 1.0
 * 演示小球通过键盘控制上下作业移动 - java的事件控制
 */
public class BallMove extends JFrame {
    MyPanel mp = null;
    public static void main(String[] args) {
        BallMove ballMove = new BallMove();

    }
    public BallMove(){
        mp = new MyPanel();
        this.add(mp);
        this.setSize(400,300);
        this.addKeyListener(mp);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

}
//implements KeyListener 一个监听器，监听键盘事件
class MyPanel extends JPanel  implements KeyListener{
    int x = 10;
    int y = 10;
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillOval(x, y, 50, 50);
    }
    //监听有字符输入时，该方法就会触发
    @Override
    public void keyTyped(KeyEvent e) {

    }
    //当某个键按下时，该方法会触发
    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println((char)e.getExtendedKeyCode() + "被按下");
        //根据用户按下不同键来处理小球的移动
        if(e.getKeyCode() == KeyEvent.VK_DOWN){//KeyEvent.VK_DOWN就是向下的箭头对应的code
            y++;
        }else if(e.getKeyCode() == KeyEvent.VK_UP){
            y--;
        }else if(e.getKeyCode() == KeyEvent.VK_RIGHT){
            x++;
        }else if(e.getKeyCode() == KeyEvent.VK_LEFT){
            x--;
        }
        //让面板重绘repaint方法被调用
        this.repaint();
    }
    //当某个键释放(松开)，该方法就会触发
    @Override
    public void keyReleased(KeyEvent e) {

    }
}