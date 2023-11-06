package com.yinhai.tankgame1_3;

/**
 * @author 银海
 * @version 1.0
 * 子弹类
 */
public class Bullet {
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

    public Bullet(int x, int y, double speed, int direct) {
        this.x = x;
        this.y = y;
        this.speed = speed;
        shot = new Shot();
        this.direct = direct;
    }

    public class Shot implements Runnable {
        public Shot() {
        }
        @Override
        public void run() {

            while (isLive){
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
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
