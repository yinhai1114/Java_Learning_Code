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
}
