package com.yinhai.mhl.service;

import com.yinhai.mhl.dao.MenuDAO;
import com.yinhai.mhl.domain.Menu;

import java.util.List;


/**
 * @author 银小海
 * @version 1.0
 * @email yinhai14@qq.com
 * 调用DAO完成对表的操作
 */
public class MenuService {
    private MenuDAO menuDAO = new MenuDAO();

    //返回所有的菜品
    public List<Menu> list(){
        return menuDAO.queryMulti("select * from menu",Menu.class);
    }

    public Menu getMenuId(int id){
        return menuDAO.querySingle("select * from menu where id = ?",Menu.class,id);
    }
}
