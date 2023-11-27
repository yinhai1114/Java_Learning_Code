package com.yinhai.mhl.domain;

/**
 * @author 银小海
 * @version 1.0
 * @email yinhai14@qq.com
 * 该javabean和 menu 表对应
 *  id INT PRIMARY KEY AUTO_INCREMENT, #自增, 表示餐桌编号
 * 	state VARCHAR(20) NOT NULL DEFAULT '',#餐桌的状态
 * 	orderName VARCHAR(50) NOT NULL DEFAULT '',#预订人的名字
 * 	orderTel VARCHAR(20) NOT NULL DEFAULT ''
 */
public class Menu {
    private Integer id;
    private String name;
    private String type;
    private Double price;

    public Menu(){//无参构造器

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Menu(Integer id, String name, String type, Double price) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.price = price;
    }

    @Override
    public String toString() {
        return id +"\t\t" + name + "\t\t" + type+ "\t\t" + price + "\t\t" ;
    }
}
