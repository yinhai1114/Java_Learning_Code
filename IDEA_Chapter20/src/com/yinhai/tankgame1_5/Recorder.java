package com.yinhai.tankgame1_5;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;

/**
 * @author 银海
 * @version 1.0
 */
public class Recorder  {
    //定义变量，记录击毁坦克数量
    private static int destroyEnemy = 0;
    private static FileWriter fileWriter = null;

    private static BufferedWriter bufferedWriter = null;
    private static ObjectOutputStream objectOutputStream = null;
    private static ObjectInputStream objectInputStream = null;
    private static String recordPath = "src\\com\\yinhai\\tankgame1_5\\information\\DestroyEnemyCount.txt";
    private static String recordEnemyInfoPath = "src\\com\\yinhai\\tankgame1_5\\information\\Nodes.txt";
    private static Vector<Enemy> enemies = null;
    private static Hero hero = null;
    private static Vector<Node> nodes = null;


    public static void setHero(Hero hero) {
        Recorder.hero = hero;
    }

    public static void setEnemies(Vector<Enemy> enemies) {
        Recorder.enemies = enemies;
    }

    public static int getDestroyEnemy() {
        return destroyEnemy;
    }

    public static void setDestroyEnemy(int destroyEnemy) {
        Recorder.destroyEnemy = destroyEnemy;
    }
    public static void addDestroyEnemyCount(){
        destroyEnemy++;
    }
    public static Vector<Node> recoveryEnemies() {

        try {
            File file = new File(recordEnemyInfoPath);
            if(!file.exists()){
                return null;
            }
            nodes = new Vector<>();
            objectInputStream = new ObjectInputStream(new FileInputStream(recordEnemyInfoPath));
            nodes =(Vector<Node>)objectInputStream.readObject();
            System.out.println("读取完毕");
            return nodes;
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("无上局游戏记录");
            System.exit(0);
        }
        finally {
            try {
                if (objectInputStream != null) {
                    objectInputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
    public static void saveNode() throws IOException {
        nodes = new Vector<>();
        if(hero.isLive()){
            nodes.add(0,new NodeHero(hero.getX(),hero.getY(), hero.getDirect(),Recorder.destroyEnemy));
        }else{
            nodes.add(0,null);
        }

        for (int i = 0; i < enemies.size(); i++) {
            Enemy enemy = enemies.get(i);
            if(enemy.isLive()){
                nodes.add(new Node(enemy.getX(),enemy.getY(),enemy.getDirect()));
            }
        }

        if (!nodes.isEmpty()){
            objectOutputStream.writeObject(nodes);
        }


    }
    public static void keepRecord() {
        try {
            objectOutputStream = new ObjectOutputStream(new FileOutputStream(recordEnemyInfoPath));
            saveNode();//每次也保存当前Tank的位置
            bufferedWriter = new BufferedWriter(new FileWriter(recordPath,true));
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 hh:mm:ss E");
            String format = sdf.format(new Date()); // format:将日期转换成指定格式的字符串
            bufferedWriter.write("================================\r\n");
           bufferedWriter.write( format + "\r\n" + "坦克大战游戏 击毁敌人数量为 " + destroyEnemy + "\r\n");
            for (int i = 0; i < enemies.size(); i++) {
                Enemy enemy = enemies.get(i);
                if(enemy.isLive()){
                    //保存该信息
                    String record = "敌人信息" + i + " " + enemy.getX() + " "
                            + enemy.getY() + " " + enemy.getDirect() + "\r\n";
                    //写入到文件
                    bufferedWriter.write(record);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(bufferedWriter != null){
                try {
                    bufferedWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(objectOutputStream != null){
                try {
                    objectOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
