package com.yinhai.tankgame1_3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Vector;

/**
 * @author 银海
 * @version 1.0
 * 坦克大战的绘图区
 */
public class MyPanel extends JPanel implements KeyListener, Runnable {
    //定义我的坦克
    Hero hero = null;
    Vector<Enemy> enemies = new Vector<>();
    Vector<Bomb> bombs = new Vector<>();
    int enemyNum = 10;
    Image image = null;
    Image image1 = null;
    Image image2 = null;
    Map map = null;

    public MyPanel() {
        image = Toolkit.getDefaultToolkit().getImage("C:\\Users\\64301\\Desktop\\JA" +
                "VA\\code\\IDEA_Chapter18\\src\\com\\yinhai\\tankgame1_3/bomb_1.gif");
        image1 = Toolkit.getDefaultToolkit().getImage("C:\\Users\\64301\\Desktop\\JA" +
                "VA\\code\\IDEA_Chapter18\\src\\com\\yinhai\\tankgame1_3/bomb_2.gif");
        image2 = Toolkit.getDefaultToolkit().getImage("C:\\Users\\64301\\Desktop\\JA" +
                "VA\\code\\IDEA_Chapter18\\src\\com\\yinhai\\tankgame1_3/bomb_3.gif");
        hero = new Hero(800, 450, 10.0);//初始化位置
        for (int i = 0; i < enemyNum; i++) {
            Enemy enemy = new Enemy(100 * (i + 1), 100, 10);
            Thread thread = new Thread(enemy);
            thread.start();
            enemies.add(enemy);
            enemy.shotBullet();
        }
        map = new Map(0,0,1600,900);
    }

    @Override
    public void paint(Graphics g) {

        super.paint(g);
        g.fillRect(Map.getMapMinX(), Map.getMapMinY(), Map.getMapMaxX(), Map.getMapMaxY());//填充矩形默认黑色
        if(hero == Hero.HERO){
            g.setColor(Color.RED);//设置画笔的颜色
            g.setFont(new Font("楷体", Font.BOLD, 50));//设置画笔的字体
            g.drawString("Game Over!", 400, 400);
            g.drawString("Press R to restart", 350, 500);
        }
        drawTank(hero,g);
        bombEffect(g);
        for (int i = 0; i < enemies.size(); i++) {
            if (enemies.get(i) == null) {
                continue;
            }
            Enemy enemy = enemies.get(i);
            if (!enemy.isLive()) {
                enemies.remove(enemy);
                i--;//为什么需要i-- 是因为在处理敌人数组时，如果你使用 remove 方法来删除一个元素，它会将数组中的元素往前移动填补被删除元素的位置，这样数组中不会存在 null 元素。
                continue;
            }
            drawTank(enemy,g);
        }

        //有个问题 这里的bullet只会接受一个对象，所以想想怎么保证绘出多个bullet
        //可以用ArrayList接受，但是怎么销毁为空的对象呢?
        drawBullet(g,hero);
        for (int i = 0; i < enemies.size(); i++) {
            Enemy enemy = enemies.get(i);
            drawBullet(g,enemy);
        }


    }

    public void drawTank(Tank tank,Graphics g) {
        if(tank instanceof Hero){
            if(hero == Hero.HERO){
                return;
            }
        }
        switch (tank.getType()) {//坦克类型
            case 0://hero
                g.setColor(Color.CYAN);
                break;
            case 1:
                g.setColor(Color.YELLOW);
                break;
        }
        //根据坦克的方向来绘制坦克
        switch (tank.getDirect()) {
            case 0:
                g.fill3DRect(tank.getX(), tank.getY(), 10, 60, false);//坦克左边的轮子
                g.fill3DRect(tank.getX() + 10, tank.getY() + 10, 20, 40, false);
                g.fill3DRect(tank.getX() + 30, tank.getY(), 10, 60, false);
                g.fillOval(tank.getX() + 10, tank.getY() + 20, 20, 20);
                g.drawLine(tank.getX() + 20, tank.getY() + 30, tank.getX() + 20, tank.getY());
                //绘制一个填充有当前颜色的3-D高亮矩形。矩形的边缘将被突出显示，
                // 使其看起来好像边缘是从左上角倾斜并点亮。用于突出显示效果的颜色将根据当前颜色确定。
                break;
            case 1:
                g.fill3DRect(tank.getX(), tank.getY(), 60, 10, false);//坦克左边的轮子
                g.fill3DRect(tank.getX() + 10, tank.getY() + 10, 40, 20, false);
                g.fill3DRect(tank.getX(), tank.getY() + 30, 60, 10, false);
                g.fillOval(tank.getX() + 20, tank.getY() + 10, 20, 20);
                g.drawLine(tank.getX() + 30, tank.getY() + 20, tank.getX() + 60, tank.getY() + 20);
                break;
            case 2:
                g.fill3DRect(tank.getX(), tank.getY(), 10, 60, false);//坦克左边的轮子
                g.fill3DRect(tank.getX() + 10, tank.getY() + 10, 20, 40, false);
                g.fill3DRect(tank.getX() + 30, tank.getY(), 10, 60, false);
                g.fillOval(tank.getX() + 10, tank.getY() + 20, 20, 20);
                g.drawLine(tank.getX() + 20, tank.getY() + 30, tank.getX() + 20, tank.getY() + 60);
                break;
            case 3:
                g.fill3DRect(tank.getX(), tank.getY(), 60, 10, false);//坦克左边的轮子
                g.fill3DRect(tank.getX() + 10, tank.getY() + 10, 40, 20, false);
                g.fill3DRect(tank.getX(), tank.getY() + 30, 60, 10, false);
                g.fillOval(tank.getX() + 20, tank.getY() + 10, 20, 20);
                g.drawLine(tank.getX() + 30, tank.getY() + 20, tank.getX(), tank.getY() + 20);
                break;
            default:
                System.out.println("default");
        }
    }

    public void drawBullet(Graphics g, Tank tank) {
        tank.checkBullets();
        Vector<Bullet> bullets = tank.getBullets();
        Bullet bullet = null;
        switch (tank.getType()) {//坦克类型
            case 0://hero
                g.setColor(Color.CYAN);
                break;
            case 1:
                g.setColor(Color.YELLOW);
                break;
        }
        for (int i = 0; i < bullets.size(); i++) {
            bullet = bullets.get(i);
            g.fillOval(bullet.getX(), bullet.getY(), 5, 5);
        }
    }

    public void bombEffect(Graphics g) {
        for (int i = 0; i < bombs.size(); i++) {
            Bomb bomb = bombs.get(i);
            if(bomb.getLife()>0){
                bomb.lifeDown();
                if (bomb.getLife() > 6) {
                    g.drawImage(image, bomb.getX(), bomb.getY(), 60, 60, this);
                } else if (bomb.getLife() > 3) {
                    g.drawImage(image1, bomb.getX(), bomb.getY(), 60, 60, this);
                } else {
                    g.drawImage(image2, bomb.getX(), bomb.getY(), 60, 60, this);
                }
            }else {
                bombs.remove(bomb);
            }
        }
    }

    public boolean hitTank(Bullet b, Tank tank) {
        switch (tank.getDirect()) {
            case 0:
            case 2:
                if (b.getX() > tank.getX() && b.getX() < tank.getX() + 40
                        && b.getY() > tank.getY() && b.getY() < tank.getY() + 60) {
                    b.setLive(false);
                    tank.setLive(false);
                    bombs.add(new Bomb(tank.getX(), tank.getY()));
                    return true;
                }
                break;
            case 1:
            case 3:
                if (b.getX() > tank.getX() && b.getX() < tank.getX() + 60
                        && b.getY() > tank.getY() && b.getY() < tank.getY() + 40) {
                    b.setLive(false);
                    tank.setLive(false);
                    bombs.add(new Bomb(tank.getX(), tank.getY()));
                    return true;
                }
                break;
        }
        return false;
    }

    public void hitEnemyIf(Hero hero, Vector<Enemy> enemies) {
        for (int i = 0; i < hero.getBullets().size(); i++) {
            Bullet heroBullet = hero.getBullets().get(i);
            for (int j = 0; j < enemies.size(); j++) {
                Enemy enemy = enemies.get(j);
                hitTank(heroBullet, enemy);
            }
        }
    }
    public void hitHeroIf(Hero hero,Vector<Enemy> enemies){
        Enemy enemy = null;
        Bullet enemyBullet = null;
        for (int j = 0; j < enemies.size(); j++) {
            enemy = enemies.get(j);
            for (int i = 0; i < enemy.getBullets().size(); i++) {
                enemyBullet = enemy.getBullets().get(i);
                if(hitTank(enemyBullet,hero)){
                    this.hero = Hero.HERO;
                }
            }
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    //处理wasd按下的情况
    @Override
    public void keyPressed(KeyEvent e) {

        if (e.getKeyCode() == KeyEvent.VK_W) {
            //改变坦克的方向
            hero.setDirect(0);
            hero.heroMove();
        } else if (e.getKeyCode() == KeyEvent.VK_D) {
            hero.setDirect(1);
            hero.heroMove();
        } else if (e.getKeyCode() == KeyEvent.VK_S) {
            hero.setDirect(2);
            hero.heroMove();
        } else if (e.getKeyCode() == KeyEvent.VK_A) {
            hero.setDirect(3);
            hero.heroMove();
        }
        //如果按下的是J就调用hero的shotBullet方法
        if (e.getKeyCode() == KeyEvent.VK_J) {
            hero.shotBullet();
        }
        if(e.getKeyCode() == KeyEvent.VK_R){
            hero = new Hero(500,500,30);
        }
        this.repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void run() {


        while (true) {

            hitEnemyIf(hero, enemies);
            hitHeroIf(hero,enemies);
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            this.repaint();
        }
    }
}
