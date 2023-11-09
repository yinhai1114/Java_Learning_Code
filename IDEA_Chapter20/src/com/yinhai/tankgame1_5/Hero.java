package com.yinhai.tankgame1_5;

import java.util.Vector;

/**
 * @author 银海
 * @version 1.0
 * 玩家的坦克，与敌人坦克类很相似
 */
public class Hero extends Tank {

    Vector<Bullet> heroBullets = new Vector<>();
    private boolean isLive = true;
    private int bulletSpeed = 30;
    final static Hero HERO = new Hero(-100,-100,0);
    private int type = 0;

    public boolean isLive() {
        return isLive;
    }
    @Override
    public void setLive(boolean life) {
        isLive = life;
    }

    @Override
    public int getType() {
        return type;
    }

    public Hero(int x, int y, double speed) {
        super(x, y, speed);
    }

    public int getTYPE() {
        return type;
    }

    public boolean checkBullets() {
        Bullet bullet;
        for (int i = 0; i < heroBullets.size(); i++) {
            bullet = heroBullets.get(i);
            if (bullet == null) {
                heroBullets.remove(null);
            }
            if (!bullet.isLive()) {
                heroBullets.remove(bullet);
            }
        }
        if (heroBullets.size() >= 3) {
            return true;
        }
        return false;
    }

    public void shotBullet() {
        Bullet bullet = null;
        System.out.println("hero射击");
        if (checkBullets()) {
            return;
        }
        switch (getDirect()) {
            case 0:
                bullet = new Bullet(this.getX(), this.getY() - 30 , bulletSpeed, getDirect());
                break;
            case 1:
                bullet = new Bullet(this.getX() + 30, this.getY() , bulletSpeed, getDirect());
                break;
            case 2:
                bullet = new Bullet(this.getX(), this.getY() + 30, bulletSpeed, getDirect());
                break;
            case 3:
                bullet = new Bullet(this.getX() - 20, this.getY(), bulletSpeed, getDirect());
                break;
        }
        heroBullets.add(bullet);
        Bullet.Shot shot = bullet.new Shot();
        Thread thread = new Thread(shot);
        thread.start();
    }

    public void heroMove() {

        Vector<Integer> wrongDirect = new Vector<>();
        for (int i = 0; i < 4; i++) {
            if (Map.scopeIf(this,i)) {
                wrongDirect.add(i);
            }
        }
        System.out.println(wrongDirect);
        if(wrongDirect.contains(this.getDirect()) ){
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

    }
    @Override
    public Vector<Bullet> getBullets() {
        return heroBullets;
    }
}
