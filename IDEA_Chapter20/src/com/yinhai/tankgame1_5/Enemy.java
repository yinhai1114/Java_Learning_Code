package com.yinhai.tankgame1_5;

import java.util.Collection;
import java.util.HashSet;
import java.util.Vector;

/**
 * @author 银海
 * @version 1.0
 * Enemy类，该类包含了enemy的射击，移动，范围碰撞等判断
 */
public class Enemy extends Tank implements Runnable {
    //子弹列表，主要作用是用于记录子弹是否存活，以及该对象还能否发射子弹
    Vector<Bullet> enemyBullets = new Vector<>();
    //敌人列表，主要作用是用于记录当前的其他敌人，在判断碰撞时用到
    Vector<Enemy> enemies;
    Hero hero;


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

    public void setEnemies(Vector<Enemy> enemies) {
        this.enemies = enemies;
    }

    public void setHero(Hero hero) {
        this.hero = hero;
    }

    /**
     * 所有敌人在构造时，默认朝下
     */
    public Enemy(int x, int y, double speed) {
        super(x, y, speed);
        setDirect(2);
    }

    public int getTYPE() {
        return type;
    }

    /**
     *
     * @return 返回值代表该对象发射的子弹是否存活，是否还能继续发射
     */
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

    /**
     * 发射子弹行为，调用check方法，查看现在是否能发射子弹
     * 如果还能发射，执行创建子弹对象，并开启对应的线程
     */
    public void shotBullet() {
        Bullet bullet = null;
        if (checkBullets()) {
            return;
        }
        switch (getDirect()) {
            case 0:
                bullet = new Bullet(this.getX(), this.getY() - 30, bulletSpeed, getDirect());
                break;
            case 1:
                bullet = new Bullet(this.getX() + 30, this.getY(), bulletSpeed, getDirect());
                break;
            case 2:
                bullet = new Bullet(this.getX(), this.getY() + 30, bulletSpeed, getDirect());
                break;
            case 3:
                bullet = new Bullet(this.getX() - 20, this.getY(), bulletSpeed, getDirect());
                break;
        }
        enemyBullets.add(bullet);
        Bullet.Shot shot = bullet.new Shot();
        Thread thread = new Thread(shot);
        thread.start();
    }

    /**
     * 移动方法 根据方向自减或自增
     */
    public void move() {
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

    /**
     * 该方法比较复杂，简单来说先调用地图范围判断，再调用坦克间的判断，两个方法都来自Map类
     * (本意只是想判断个地图范围写的Map类，后面懒就两个丢一块了)
     * @return 返回的int类型的列表，表示可以移动的方向
     */
    public Vector<Integer> getSafeDirect() {
        //两个列表 用于记录正确方向和错误方向
        Vector<Integer> safeDirects = new Vector<>();
        Vector<Integer> wrongDirects = new Vector<>();
        int direct;
        int cantMove;
        int haveHellDirect = -1;

        for (int i = 0; i < 4; i++) {
            safeDirects.add(i);
        }
        //假设四个方向 循环判断是否碰到墙壁，如果碰到就加到错误的方向wrongDirect内
        for (int i = 0; i < 4; i++) {
            if (Map.scopeIf(this, i)) {
                haveHellDirect = i;
                wrongDirects.add(haveHellDirect);
            }
        }
        //循环对比该坦克和其他所有坦克是否碰撞，如果碰撞，添加该方向到错误内
        for (int i = 0; i < enemies.size(); i++) {
            Enemy enemy = enemies.get(i);
            if (this == enemy) {
                continue;
            }
            //假定4个方向，分别判断该方向是否可以移动，如果不行，添加到错误内
            for (int j = 0; j < 4; j++) {
                if ((cantMove = Map.tankScopeIf(this, enemy, j)) != -1) {
                    wrongDirects.add(cantMove);
                }
            }
        }
        //使用移除，Vector类只会移除有的对象
        safeDirects.removeAll(wrongDirects);
        System.out.println("不能移动的方向" + wrongDirects);
        return safeDirects;//返回该正确的方向
    }

    /**
     * 该类主要是从返回的安全方向内随机挑出一个随机赋值给tank，用于体现随机移动
     */
    public void randomMove() {
        //获取正确方向
        Vector<Integer> safeDirects = getSafeDirect();
        //为空，不执行移动
        if (safeDirects.isEmpty()) {
            System.out.println("该敌人无法移动");
            return;
        }
        //如果现在的方向被安全方向包含，就保持方向移动
        if (safeDirects.contains(this.getDirect())) {
            move();
            count++;//记录安全方向行走次数
        }else {//如果不是，就随机从安全方向内获取方向赋值
            int index = (int) (Math.random() * safeDirects.size());//0-size
            setDirect(safeDirects.get(index));
        }
        //如果一直都是安全方向，到达5或者更多，随机从安全方向内赋值
        if (count >= (int) (Math.random() * 40) && count > 5) {//当移动的次数大于某个值的时候，改变方向，0-39的范围
            int index = (int) (Math.random() * safeDirects.size());//0-size
            setDirect(safeDirects.get(index));
            count = 0;//计数为0
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
                randomMove();//移动
                shotBullet();//射击
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
