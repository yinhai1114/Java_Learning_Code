package com.yinhai.tankgame1_3;

/**
 * @author 银海
 * @version 1.0
 */
public class Map {
    private static int mapMinX;
    private static int mapMaxX;
    private static int mapMinY;
    private static int mapMaxY;

    public static int getMapMinX() {
        return mapMinX;
    }

    public static int getMapMaxX() {
        return mapMaxX;
    }

    public static int getMapMinY() {
        return mapMinY;
    }

    public static int getMapMaxY() {
        return mapMaxY;
    }

    public Map(int mapMinX, int mapMinY, int mapMaxX, int mapMaxY) {
        this.mapMinX = mapMinX;
        this.mapMinY = mapMinY;
        this.mapMaxX = mapMaxX;
        this.mapMaxY = mapMaxY;
    }

    public static boolean scopeIf(Tank tank) {
        switch (tank.getDirect()) {
            case 0:
                if (tank.getY() < mapMinY +tank.getSpeed()) {
                    return false;
                }
                break;
            case 1:
                if (tank.getX() > mapMaxX - 60 - tank.getSpeed()) {
                    return false;
                }
                break;
            case 2:
                if (tank.getY() > mapMaxY - 60 - tank.getSpeed()) {
                    return false;
                }
                break;
            case 3:
                if (tank.getX() < mapMinX + tank.getSpeed()) {
                    return false;
                }
                break;
        }
        return true;
    }
}
