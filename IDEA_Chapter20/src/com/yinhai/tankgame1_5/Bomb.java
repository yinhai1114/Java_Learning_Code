package com.yinhai.tankgame1_5;

/**
 * @author 银海
 * @version 1.0
 * 该类为炸弹类，用法为敌人被击中时就生成一个炸弹
 */
public class Bomb {
    /**
     * x y为炸弹坐标
     * life为该炸弹的生存周期，即10个线程时间消失
     * isLive表示该炸弹是否消亡
     */
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
    /**
     *该方法实现了炸弹周期的减少，为0时置为消亡
     */
    public void lifeDown(){
            if(life > 0){
                --life;
            }else{
                isLive = false;
            }
    }
}
