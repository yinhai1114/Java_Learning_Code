package com.yinhai.tankgame1_5;

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

    public static boolean scopeIf(Tank tank, int testDirect) {
        switch (testDirect) {
            case 0:
                if (tank.getY() - 30 <= mapMinY) {
                    return true;
                }
                break;
            case 1:
                if (tank.getX() + 30 >= mapMaxX) {
                    return true;
                }
                break;
            case 2:
                if (tank.getY() + 30 >= mapMaxY) {
                    return true;
                }
                break;
            case 3:
                if (tank.getX() - 30 <= mapMinX) {
                    return true;
                }
                break;
        }
        return false;
    }

    //可以修改 tankCantMove 方法的返回类型，以返回一个表示不可移动方向的集合，而不仅仅是单个方向。
    // 这可以通过使用一个集合数据结构，如 ArrayList，来实现。

    //返回的值代表无法移动的方向
    //考虑细化碰撞方法，细化会出现【不能移动的方向为多个方向】
    public static int tankScopeIf(Tank tank, Tank tank1, int testDirect) {
        if (testDirect == 0) {
            switch (tank1.getDirect()) {
                case 0:
                case 2:
                    //左上角坐标[tank.getX - 20 ,tank.getY - 30]
                    if (tank.getX() - 20 >= tank1.getX() - 20
                            && tank.getX() - 20 <= tank1.getX() + 20
                            && tank.getY() - 30 >= tank1.getY() - 30
                            && tank.getY() - 30 <= tank1.getY() + 30) {
                        return 0;
                    }
                    //右上角坐标[tank.getX + 20 , tank.getY - 30]
                    if (tank.getX() + 20 >= tank1.getX() - 20
                            && tank.getX() + 20 <= tank1.getX() + 20
                            && tank.getY() - 30 >= tank1.getY() - 30
                            && tank.getY() - 30 <= tank1.getY() + 30) {
                        return 0;
                    }
                    break;
                case 1:
                case 3:
                    //左上角坐标[tank.getX - 20 ,tank.getY - 30]
                    if (tank.getX() - 20 >= tank1.getX() - 30
                            && tank.getX() - 20 <= tank1.getX() + 30
                            && tank.getY() - 30 >= tank1.getY() - 20
                            && tank.getY() - 30 <= tank1.getY() + 20) {
                        return 0;
                    }
                    //右上角坐标[tank.getX + 20 , tank.getY - 30]
                    if (tank.getX() + 20 >= tank1.getX() - 30
                            && tank.getX() + 20 <= tank1.getX() + 30
                            && tank.getY() - 30 >= tank1.getY() - 20
                            && tank.getY() - 30 <= tank1.getY() + 20) {
                        return 0;
                    }
                    break;
            }
        } else if (testDirect == 2) {
            switch (tank1.getDirect()) {
                case 0:
                case 2:
                    //左下角坐标[tank.getX - 20 ,tank.getY + 30]
                    if (tank.getX() - 20 >= tank1.getX() - 20
                            && tank.getX() - 20 <= tank1.getX() + 20
                            && tank.getY() + 30 >= tank1.getY() - 30
                            && tank.getY() + 30 <= tank1.getY() + 30) {
                        return 2;
                    }
                    //右下角坐标[tank.getX + 20 , tank.getY + 30]
                    if (tank.getX() + 20 >= tank1.getX() - 20
                            && tank.getX() + 20 <= tank1.getX() + 20
                            && tank.getY() + 30 >= tank1.getY() - 30
                            && tank.getY() + 30 <= tank1.getY() + 30) {
                        return 2;
                    }
                    break;
                case 1:
                case 3:
                    //左下角坐标[tank.getX - 20 ,tank.getY + 30]
                    if (tank.getX() - 20 >= tank1.getX() - 30
                            && tank.getX() - 20 <= tank1.getX() + 30
                            && tank.getY() + 30 >= tank1.getY() - 20
                            && tank.getY() + 30 <= tank1.getY() + 20) {
                        return 2;
                    }
                    //右下角坐标[tank.getX + 20 , tank.getY + 30]
                    if (tank.getX() + 20 >= tank1.getX() - 30
                            && tank.getX() + 20 <= tank1.getX() + 30
                            && tank.getY() + 30 >= tank1.getY() - 20
                            && tank.getY() + 30 <= tank1.getY() + 20) {
                        return 2;
                    }
                    break;
            }
        } else if (testDirect == 1) {
            switch (tank1.getDirect()) {
                case 0:
                case 2:
                    //右上角坐标[tank.getX + 30 ,tank.getY - 20]
                    if (tank.getX() + 30 >= tank1.getX() - 20
                            && tank.getX() + 30 <= tank1.getX() + 20
                            && tank.getY() - 20 >= tank1.getY() - 30
                            && tank.getY() - 20 <= tank1.getY() + 30) {
                        return 1;
                    }
                    //右下角坐标[tank.getX + 30 , tank.getY + 20]
                    if (tank.getX() + 30 >= tank1.getX() - 20
                            && tank.getX() + 30 <= tank1.getX() + 20
                            && tank.getY() + 20 >= tank1.getY() - 30
                            && tank.getY() + 20 <= tank1.getY() + 30) {
                        return 1;
                    }
                    break;
                case 1:
                case 3:
                    //右上角坐标[tank.getX + 30 ,tank.getY - 20]
                    if (tank.getX() + 30 >= tank1.getX() - 30
                            && tank.getX() + 30 <= tank1.getX() + 30
                            && tank.getY() - 20 >= tank1.getY() - 20
                            && tank.getY() - 20 <= tank1.getY() + 20) {
                        return 1;
                    }
                    //右下角坐标[tank.getX + 30 , tank.getY + 20]
                    if (tank.getX() + 30 >= tank1.getX() - 30
                            && tank.getX() + 30 <= tank1.getX() + 30
                            && tank.getY() + 20 >= tank1.getY() - 20
                            && tank.getY() + 20 <= tank1.getY() + 20) {
                        return 1;
                    }
                    break;
            }
        } else if (testDirect == 3) {
            switch (tank1.getDirect()) {
                case 0:
                case 2:
                    //左上角坐标[tank.getX - 30 ,tank.getY - 20]
                    if (tank.getX() - 30 >= tank1.getX() - 20
                            && tank.getX() - 30 <= tank1.getX() + 20
                            && tank.getY() - 20 >= tank1.getY() - 30
                            && tank.getY() - 20 <= tank1.getY() + 30) {
                        return 3;
                    }
                    //左下角坐标[tank.getX - 30 , tank.getY + 20]
                    if (tank.getX() - 30 >= tank1.getX() - 20
                            && tank.getX() - 30 <= tank1.getX() + 20
                            && tank.getY() + 20 >= tank1.getY() - 30
                            && tank.getY() + 20 <= tank1.getY() + 30) {
                        return 3;
                    }
                    break;
                case 1:
                case 3:
                    //左上角坐标[tank.getX - 30 ,tank.getY - 20]
                    if (tank.getX() - 30 >= tank1.getX() - 30
                            && tank.getX() - 30 <= tank1.getX() + 30
                            && tank.getY() - 20 >= tank1.getY() - 20
                            && tank.getY() - 20 <= tank1.getY() + 20) {
                        return 3;
                    }
                    //左下角坐标[tank.getX - 30 , tank.getY + 20]
                    if (tank.getX() - 30 >= tank1.getX() - 30
                            && tank.getX() - 30 <= tank1.getX() + 30
                            && tank.getY() + 20 >= tank1.getY() - 20
                            && tank.getY() + 20 <= tank1.getY() + 20) {
                        return 3;
                    }
                    break;
            }
        }
        return -1;
    }
}
