package com.yinhai.houserent.view;

import com.yinhai.houserent.domain.House;
import com.yinhai.houserent.service.HouseService;
import com.yinhai.houserent.utlity.Utility;

public class HouseView {
    private boolean loop = true;
    private char key = ' ';
    private HouseService houseService = new HouseService(5);

    //显示主菜单
    public void mainMenu() {
        do {
            System.out.println("===================房屋出租系统菜单===================");
            System.out.println("\t\t\t1 新 增 房 源");
            System.out.println("\t\t\t2 查 找 房 源");
            System.out.println("\t\t\t3 删 除 房 屋 信 息");
            System.out.println("\t\t\t4 修 改 房 屋 信 息");
            System.out.println("\t\t\t5 房 屋 列 表");
            System.out.println("\t\t\t6 退       出");
            System.out.println("请输入你的选择(1-6)");
            key = Utility.readChar();
            switch (key) {
                case '1':
                    addHouse();
                    break;
                case '2':
                    findHouse();
                    break;
                case '3':
                    delHouse();
                    break;
                case '4':
                    modifyingHouse();
                    break;
                case '5':
                    listHouse();
                    break;
                case '6':
                    exitView();
                    break;
            }
        } while (loop);
    }
    //编写listHouses房屋列表
    public void listHouse(){
        System.out.println("===================房屋列表===================");
        System.out.println("编号\t\t房主\t\t电话\t\t地址\t\t\t月租\t\t状态（已出租/未出租）");
        House[] houses = houseService.list();//list返回的也是数组
        for (int i = 0; i < houses.length; i++) {//但是length长度是10 会输出很多空
            //所以当 == null时可以直接break
            if(houses[i] == null){//如果为空 就不再显示
                break;
            }
            System.out.println(houses[i] );

        }
    }
    //编写addHouse() 接受用户输入 调用add方法
    public void addHouse(){
        System.out.println("===================新增房源===================");
        if(houseService.full()){//提前判断一次 避免打完信息发现满了
            System.out.println("=================添加房屋失败=================");
            while(true){//执行数组扩容
                System.out.println("是否扩容房屋列表y/n");
                key = Utility.readChar();
                if(key != 'y' && key != 'n'){
                    System.out.println("请输入y/n");
                    continue;
                }
                if(key == 'y'){
                    System.out.println("输入想要增加的个数");
                    int size = Utility.readInt();
                    houseService.addArrlength(size);
                }
                break;
            }

            return;
        }
        System.out.println("===================添加房屋===================");
        System.out.print("姓名:");
        String name = Utility.readString(8);
        System.out.println("电话:");
        String phone = Utility.readString(13);

        System.out.println("地址:");
        String address = Utility.readString(13);
        System.out.println("月租:");
        int rent  = Utility.readInt();
        System.out.println("状态:");
        String state = Utility.readString(3);
        //创建一个新的house对象 id应该是系统分配的，用户不能输入
        House newHouse = new House(0,name,phone,address,rent,state);
        if(houseService.add(newHouse)){
            System.out.println("添加房屋成功");
        }
    }
    public void delHouse(){
        System.out.println("===================删除房屋信息===================");
        System.out.println("请输入待删除房屋的编号(输入-1取消删除)");
        int delId = Utility.readInt();
        if(delId == -1){
            System.out.println("您已取消删除");
            return;
        }
        System.out.println("请确认是否删除编号为" + delId + "的房屋 y/n，请小心选择");
        while(true){
            char choice = Utility.readChar();
            if(choice != 'y' && choice != 'n'){
                System.out.println("输入有误请输入y/n");
                continue;
            }
            if(choice == 'y'){
                if(!houseService.del(delId)){
                    System.out.println("无法找到对应编码，请确认后重试");
                    return;
                }

            }
            if(choice == 'n'){
                return;
            }
            break;
        }

    }
    public void exitView(){
        System.out.println("=================退        出=================");
        char c = Utility.readConfirmSelection();
        if (c == 'Y'){
            loop = false;
        }
        if (c == 'N'){
            System.out.println("=============取消退出 返回主界面==============");
        }
    }
    public void findHouse() {
        System.out.println("===================查找房源===================");

        while (true) {
            System.out.println("请输入待查找房屋的编号(输入-1取消查找)");
            int findId = Utility.readInt();
            if (findId == -1) {
                System.out.println("您已取消查找");
                return;
            }
            if (!houseService.find(findId)) {
                break;
            }
            System.out.println("无法找到对应编码，请确认后重试");
        }
    }
    public void modifyingHouse(){
        System.out.println("===================修改房源信息===================");
        int modifyId = 0;
        while (true) {
            System.out.println("请输入待修改房屋的编号(输入-1取消修改)");
            int findId = Utility.readInt();
            modifyId = findId;
            if (findId == -1) {
                System.out.println("您已取消修改");
                return;
            }
            if (houseService.find(findId)) {
                break;
            }
            System.out.println("无法找到对应编码，请确认后重试");
            return;
        }
        System.out.println("请确认是否修改编号为" + modifyId + "的房屋 y/n，请小心选择");
        while(true){
            char choice = Utility.readChar();
            if(choice != 'y' && choice != 'n'){
                System.out.println("输入有误请输入y/n");
                continue;
            }
            if(choice == 'y'){
                break;
                }
            if(choice == 'n'){
                return;
            }
        }
        System.out.println("===================输入修改房源的信息===================");
        System.out.println("直接回车,不修改,保持原有");
        System.out.print("姓名:");
        String name = Utility.readString(8,"");
        System.out.println("电话:");
        String phone = Utility.readString(13,"");
        System.out.println("地址:");
        String address = Utility.readString(13,"");
        System.out.println("月租:");
        int rent  = Utility.readInt(0);
        System.out.println("状态:");
        String state = Utility.readString(13,"");
        //创建一个新的house对象 id为查找到的ID
        House newHouse = new House(modifyId,name,phone,address,rent,state);
        if(houseService.modify(newHouse)){
            System.out.println("修改成功");
        }else{
            System.out.println("未进行更改，保持原有属性");
        }


    }
}


