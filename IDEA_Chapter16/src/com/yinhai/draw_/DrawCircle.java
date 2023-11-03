package com.yinhai.draw_;

import javax.swing.*;
import java.awt.*;

/**
 * @author 银海
 * @version 1.0
 */
public class DrawCircle extends JFrame {//继承J框架可以理解为画框
    //定义一个画板
    private MyPanel mp = null;

    public static void main(String[] args) {
        new DrawCircle();
    }

    public DrawCircle() {
        //初始化面板
        mp = new MyPanel();
        this.add(mp);//把画板放入画框（面板）
        this.setSize(1600, 940);//画板大小
        //当点击退出窗口后程序会退出
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);//是否显示
    }
}

//先定义一个面板MyPanel,继承JPanel,可以理解为画板,画图形就在面板画画
class MyPanel extends JPanel {
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawOval(10, 10, 120, 120);
        //演示绘制不同的图形

        //画直线 drawLine(int x1,int y1,int x2,int y2)
        g.drawLine(10, 140, 140, 140);

        //画矩形边框 drawRect(int x, int y, int width, int height)
        g.drawRect(10, 150, 120, 120);
        //画椭圆边框 drawOval(int x, int y, int width, int height)
        //g.drawOval(10,10,40,40);

        //填充矩形 fillRect(int x, int y, int width, int height)
        //设置画笔的颜色
        g.setColor(Color.RED);
        g.fillRect(10, 280, 120, 120);

        //填充椭圆 fillOval(int x, int y, int width, int height)
        g.setColor(Color.red);
        g.fillOval(10, 410, 120, 120);

        //画图片 drawImage(Image img, int x, int y, ..)
        //1. 获取图片资源, /bg.png 表示在该项目的根目录去获取 bg.png 图片资源
        // Image image = Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/MIKU.jpg"));//指的是编译文件的根目录
        //直接贴地址也能识别。
        Image image = Toolkit.getDefaultToolkit().getImage("C:\\Users\\64301\\Desktop\\JAVA\\code\\IDEA_Chapter16\\src\\com\\yinhai\\draw_/MIKU.jpg");//直接丢文件目录也行
        g.drawImage(image, 10, 540, 120, 120, this);

        //画字符串 drawString(String str, int x, int y)//写字
        //给画笔设置颜色和字体
        g.setColor(Color.red);//设置画笔的颜色
        g.setFont(new Font("宋体", Font.BOLD, 50));//设置画笔的字体
        //这里设置的 100， 100， 是 "北京你好"左下角
        g.drawString("Hello!", 180, 100);
    }

}