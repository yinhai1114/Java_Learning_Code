package com.yinhai.tankgame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Vector;

/**
 * @author 银海
 * @version 1.0
 * 坦克大战的绘图区
 */
public class MyPanel extends JPanel implements KeyListener {
    //定义我的坦克
    Hero hero = null;
    Vector<Enemy> enemies = new Vector<>();
    int enemySize = 3;
    public MyPanel() {
        hero = new Hero(800, 450,10.0);//初始化位置
        for (int i = 0; i <enemySize; i++) {
            enemies.add(new Enemy(100*(i+1),100,10));
        }
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillRect(0, 0, 1600, 900);//填充矩形默认黑色
        drawTank(hero.getX(), hero.getY(), g, hero.getDirect(), hero.getTYPE());
        for (Enemy enemy :enemies) {
            if(enemy == null)
            {
                break;
            }
            drawTank(enemy.getX(), enemy.getY(), g, enemy.getDirect(), enemy.getTYPE());
        }


    }

    /**
     * @param x      坦克整体左上角的x坐标
     * @param y      坦克整体左上角的y坐标
     * @param g      画笔
     * @param direct 方向(上下左右) 0表示向上 1表示向右 2表示向下 3表示向左
     * @param type   坦克类型
     */
    public void drawTank(int x, int y, Graphics g, int direct, int type) {
        switch (type) {//坦克类型
            case 0://hero
                g.setColor(Color.CYAN);
                break;
            case 1:
                g.setColor(Color.YELLOW);
                break;
        }
        //根据坦克的方向来绘制坦克
        switch (direct) {
            case 0:
                g.fill3DRect(x, y, 10, 60, false);//坦克左边的轮子
                g.fill3DRect(x + 10, y + 10, 20, 40, false);
                g.fill3DRect(x + 30, y, 10, 60, false);
                g.fillOval(x + 10, y + 20, 20, 20);
                g.drawLine(x + 20, y + 30, x + 20, y);
                //绘制一个填充有当前颜色的3-D高亮矩形。矩形的边缘将被突出显示，
                // 使其看起来好像边缘是从左上角倾斜并点亮。用于突出显示效果的颜色将根据当前颜色确定。
                break;
            case 1:
                g.fill3DRect(x, y, 60, 10, false);//坦克左边的轮子
                g.fill3DRect(x + 10, y + 10, 40, 20, false);
                g.fill3DRect(x, y + 30, 60, 10, false);
                g.fillOval(x + 20, y + 10, 20, 20);
                g.drawLine(x + 30, y + 20, x + 60, y + 20);
                break;
            case 2:
                g.fill3DRect(x, y, 10, 60, false);//坦克左边的轮子
                g.fill3DRect(x + 10, y + 10, 20, 40, false);
                g.fill3DRect(x + 30, y, 10, 60, false);
                g.fillOval(x + 10, y + 20, 20, 20);
                g.drawLine(x + 20, y + 30, x + 20, y + 60);
                break;
            case 3:
                g.fill3DRect(x, y, 60, 10, false);//坦克左边的轮子
                g.fill3DRect(x + 10, y + 10, 40, 20, false);
                g.fill3DRect(x, y + 30, 60, 10, false);
                g.fillOval(x + 20, y + 10, 20, 20);
                g.drawLine(x + 30, y + 20, x, y + 20);
                break;
            default:
                System.out.println("default");
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    //处理wasd按下的情况
    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_W) {
            //改变坦克的方向
            hero.setDirect(0);
            hero.moveUp();
        } else if (e.getKeyCode() == KeyEvent.VK_D) {
            hero.setDirect(1);
            hero.moveRight();
        } else if (e.getKeyCode() == KeyEvent.VK_S) {
            hero.setDirect(2);
            hero.moveDown();
        } else if (e.getKeyCode() == KeyEvent.VK_A) {
            hero.setDirect(3);
            hero.moveLeft();
        }
        this.repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
