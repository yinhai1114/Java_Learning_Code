package com.yinhai.tankgame;

/**
 * @author 银海
 * @version 1.0
 * 玩家的坦克
 */
public class Hero extends Tank {
    private int type = 0;
    public Hero(int x, int y,double speed) {
        super(x, y,speed);
    }

    public int getTYPE() {
        return type;
    }
    public Bullet shotBullet(){
        Bullet bullet = null;
        switch (getDirect()){
            case 0:
                bullet = new Bullet(this.getX() + 18,this.getY() - 10,50,getDirect());
                break;
            case 1:
                bullet  = new Bullet(this.getX() + 60,this.getY() +18,50,getDirect());
                break;
            case 2:
                bullet = new Bullet(this.getX() + 18,this.getY() +60,50,getDirect());
                break;
            case 3:
                bullet = new Bullet(this.getX() - 10,this.getY()+18,50,getDirect());
                break;
        }
        Bullet.Shot shot = bullet.new Shot();
        Thread thread = new Thread(shot);
        thread.start();
        return bullet;
    }

}
