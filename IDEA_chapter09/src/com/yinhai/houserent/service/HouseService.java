package com.yinhai.houserent.service;

import com.yinhai.houserent.domain.House;

public class HouseService {
    private House[] houses;//保存house对象
    private int houseNum = 1;
    private int idCounter = 1;


    public HouseService(int size) {
        houses = new House[size];//当创建HouseService对象 指定大小
        houseNum = size;
        idCounter = size;
        //为了测试列表信息 初始化一个对象
        houses[0] = new House(1,"jack","112","shanghai",2000,"未出租");
        houses[1] = new House(2,"jack1","112","shanghai",2000,"未出租");
        houses[2] = new House(3,"jack2","112","shanghai",2000,"未出租");
        houses[3] = new House(4,"jack3","112","shanghai",2000,"未出租");
        houses[4] = new House(5,"jack4","112","shanghai",2000,"未出租");

    }
    public House[] list(){
        return houses;
    }
    public boolean add(House newHouse){
        //暂时不考虑数组扩容，判断是否还可以继续添加
        if(houseNum == houses.length){
            System.out.println("数组已满，不能再添加...");
            return false;
        }
        houses[houseNum++] = newHouse;
        newHouse.setId(++idCounter);
        return true;
    }
    public boolean full(){
        if(houseNum == houses.length){
            System.out.println("数组已满，不能再添加...");
            return true;
        }else {
            return false;
        }
    }
    public boolean del(int delId){
        //应当找到要删除的房屋信息的对应下标 delId和下标没关系，期间有删除会前移等等
        int index = -1;
        for (int i = 0; i < houseNum; i++) {
            if(delId == houses[i].getId()){
                index = i;
            }
        }
        if(index == -1){
            return false;
        }
        for (int i = index ; i < houseNum - 1; i++) {
            houses[i] = houses[i + 1];//煞笔了 用了index做自变量，人家都获取到了下标还懒觉自变
        }
        houses[--houseNum] = null;
        return true;

    }
    public void addArrlength(int size){
        int num = houses.length;
        House[] temp = new House[num + size];
        for (int i = 0; i < houses.length; i++) {
            temp[i] = houses[i];
        }
        houses = temp;
    }
    public boolean find(int findId){
        int index = -1;
        for (int i = 0; i < houseNum; i++) {
            if(findId == houses[i].getId()){
                index = i;
            }
        }
        if(index == -1){
            return false;
        }
        System.out.println(houses[index]);
        return true;
    }
    public boolean modify(House newHouse){
        int index = -1;
        for (int i = 0; i < houseNum; i++) {
            if(newHouse.getId() == houses[i].getId()){
                index = i;
            }
        }
        int modifyCount = -1;
        if(!newHouse.getName().equals("")){
            houses[index].setName(newHouse.getName());
            modifyCount++;
        }
        if(!newHouse.getPhone().equals("")){
            houses[index].setPhone(newHouse.getPhone());
            modifyCount++;
        }
        if(!newHouse.getAddress().equals("")){
            houses[index].setAddress(newHouse.getAddress());
            modifyCount++;
        }
        if(newHouse.getRent() != 0){
            houses[index].setRent(newHouse.getRent());
            modifyCount++;
        }
        if(!newHouse.getState().equals("")){
            houses[index].setState(newHouse.getState());
            modifyCount++;
        }
        if(modifyCount == -1){
            return false;
        }
        return true;
    }
}
