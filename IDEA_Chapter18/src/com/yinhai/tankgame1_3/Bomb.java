package com.yinhai.tankgame1_3;

/**
 * @author 银海
 * @version 1.0
 */
public class Bomb {
    private int x;
    private int y;
    private int life = 10;
    private boolean isLive = true;

    public int getLife() {
        return life;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Bomb(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public boolean isLive() {
        return isLive;
    }

    public void lifeDown(){
            if(life > 0){
                --life;
            }else{
                isLive = false;
            }
    }
}
