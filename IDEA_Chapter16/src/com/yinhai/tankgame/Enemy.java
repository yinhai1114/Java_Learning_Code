package com.yinhai.tankgame;

/**
 * @author 银海
 * @version 1.0
 */
public class Enemy extends Tank{
    private int type = 1;
    public Enemy(int x, int y,double speed) {
        super(x, y,speed);
        setDirect(2);
    }

    public int getTYPE() {
        return type;
    }
}
