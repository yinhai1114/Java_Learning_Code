package com.yinhai.tankgame1_5;

/**
 * @author 银海
 * @version 1.0
 */
public class NodeHero extends Node{
    private int destroyEnemyCount;
    public NodeHero(int x, int y, int direct,int destroyEnemyCount) {
        super(x, y, direct);
        this.destroyEnemyCount = destroyEnemyCount;
    }

    public int getDestroyEnemyCount() {
        return destroyEnemyCount;
    }
}
