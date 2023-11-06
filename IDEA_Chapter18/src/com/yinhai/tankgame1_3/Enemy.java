package com.yinhai.tankgame1_3;

import java.util.Vector;

/**
 * @author 银海
 * @version 1.0
 */
public class Enemy extends Tank implements Runnable {
    Vector<Bullet> enemyBullets = new Vector<>();
    private int type = 1;
    private boolean isLive = true;
    private int count;
    private int bulletSpeed = 10;


    public boolean isLive() {
        return isLive;
    }

    @Override
    public int getType() {
        return type;
    }

    public void setLive(boolean live) {
        isLive = live;
    }

    public Enemy(int x, int y, double speed) {
        super(x, y, speed);
        setDirect(2);
    }

    public int getTYPE() {
        return type;
    }
    public boolean checkBullets() {
        Bullet bullet;
        for (int i = 0; i < enemyBullets.size(); i++) {
            bullet = enemyBullets.get(i);
            if (bullet == null) {
                enemyBullets.remove(null);
            }
            if (!bullet.isLive()) {
                enemyBullets.remove(bullet);
            }
        }
        if (enemyBullets.size() >= 1) {
            return true;
        }
        return false;
    }

    public void shotBullet() {
        Bullet bullet = null;
        if(checkBullets()){
            return;
        }
        switch (getDirect()) {
            case 0:
                bullet = new Bullet(this.getX() + 18, this.getY() - 10, bulletSpeed, getDirect());
                break;
            case 1:
                bullet = new Bullet(this.getX() + 60, this.getY() + 18, bulletSpeed, getDirect());
                break;
            case 2:
                bullet = new Bullet(this.getX() + 18, this.getY() + 60, bulletSpeed, getDirect());
                break;
            case 3:
                bullet = new Bullet(this.getX() - 10, this.getY() + 18, bulletSpeed, getDirect());
                break;
        }
        enemyBullets.add(bullet);
        Bullet.Shot shot = bullet.new Shot();
        Thread thread = new Thread(shot);
        thread.start();
    }

    public void randomMove() {
        //先随机是否移动
        if ((int) (Math.random() * 4) == 3) {
            return;
        }
        if(!Map.scopeIf(this)){
            setDirect((int) (Math.random() * 4));
            return;
        }
        switch (getDirect()) {
            case 0:
                moveUp();
                break;
            case 1:
                moveRight();
                break;
            case 2:
                moveDown();
                break;
            case 3:
                moveLeft();
                break;
        }
        if (count >= (int) (Math.random() * 40)) {
            setDirect((int) (Math.random() * 4));
            count = 0;
        }
    }
    @Override
    public Vector<Bullet> getBullets() {
        return enemyBullets;
    }

    @Override
    public void run() {
        while (isLive) {
            try {
                Thread.sleep(500);
                randomMove();
                shotBullet();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
