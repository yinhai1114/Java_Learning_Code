package com.yinhai.tankgame;

/**
 * @author 银海
 * @version 1.0
 */
public class Tank {
    private int x;
    private int y;
    private int direct;//坦克方向
    private double speed;

    public void moveUp(){
        y-=speed;
    }
    public void moveDown(){
        y+=speed;
    }
    public void moveRight(){
        x +=speed;
    }
    public void moveLeft(){
        x -=speed;
    }
    public int getDirect() {
        return direct;
    }

    public void setDirect(int direct) {
        this.direct = direct;
    }

    public Tank(int x, int y,double speed){
        this.x = x;
        this.y = y;
        this.speed = speed;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
