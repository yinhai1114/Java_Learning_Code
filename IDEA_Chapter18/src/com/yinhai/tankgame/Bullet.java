package com.yinhai.tankgame;

/**
 * @author 银海
 * @version 1.0
 * 子弹类
 */
public class Bullet {
    private int x;
    private int y;
    private int direct = 0;//子弹的方向
    private double speed;
    private boolean isLive = true;
    Shot shot = null;

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

            while (true){
                try {
                    Thread.sleep(100);
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
                System.out.println("子弹坐标" + x + "子弹坐标" + y);
                //如果子弹移动到面板边界时，应该销毁
                if(!(x >= 0 && x <1600 && y>= 0 && y <= 900)){
                    isLive = false;
                    break;
                }
            }
        }
    }
}
