package com.yinhai.tankgame1_5;

/**
 * @author 银海
 * @version 1.0
 * 子弹类，该类主要负责子弹的移动
 */
public class Bullet {
    /**
     * x y direct为子弹的坐标，方向
     * speed代表坐标自减的速度
     * shot对象为该子弹类的一个行为 实际上是多余的 但是懒得改了
     */
    private int x;
    private int y;
    private int direct;
    private double speed;
    private boolean isLive = true;
    Shot shot = null;

    public void setLive(boolean live) {
        isLive = live;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getDirect() {
        return direct;
    }

    public double getSpeed() {
        return speed;
    }

    public boolean isLive() {
        return isLive;
    }

    /**
     * 在该类的构造器内给了一个shot行为，可认为每次创建Bullet都会Shot出去
     */
    public Bullet(int x, int y, double speed, int direct) {
        this.x = x;
        this.y = y;
        this.speed = speed;
        shot = new Shot();
        this.direct = direct;
    }

    /**
     * 该行为实现了Runable使其可以多线程执行
     */
    public class Shot implements Runnable {
        public Shot() {//看这个构造器就能知道shot类是多余的
        }
        @Override
        public void run() {

            while (isLive){
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                //移动，根据传来的方向移动
                switch (direct){
                    case 0:
                        y -= speed;
                        break;
                    case 1:
                        x += speed;
                        break;
                    case 2:
                        y += speed;
                        break;
                    case 3:
                        x -= speed;
                        break;
                }
                //如果子弹移动到面板边界时，应该销毁
                if(!(x >= 0 && x <1600 && y>= 0 && y <= 900)){
                    isLive = false;
                    break;
                }
            }
        }
    }
}
