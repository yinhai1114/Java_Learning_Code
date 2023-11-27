package com.yinhai.mhl.service;

import com.yinhai.mhl.dao.DiningTableDAO;
import com.yinhai.mhl.domain.DiningTable;

import java.util.List;

/**
 * @author 银小海
 * @version 1.0
 * @email yinhai14@qq.com
 */
public class DiningTableService {
    //定义一个DiningTableDAO对象
    private DiningTableDAO diningTableDAO = new DiningTableDAO();

    //返回所有餐桌的信息
    public List<DiningTable> list(){

        return diningTableDAO.queryMulti("select id,state from diningTable", DiningTable.class);
    }

    //根据id 查询对应的DiningTable对象 如果返回null 表示id编号对应餐桌不存在
    public DiningTable getDiningTableById(int id){

        //把sql语句放到查询分析器去测试一下
        return diningTableDAO.querySingle("select * from diningTable where id = ?",DiningTable.class,id);
    }

    //如果餐桌可以预定 调用方法对其状态进行更新
    public boolean orderDiningTable(int id,String orderName,String orderTel) {
        int dml =
                diningTableDAO.dml("update diningTable set state = '已经" +
                        "预定',orderName = ?,orderTel=? where id = ?", orderName, orderTel, id);
        return dml > 0;
    }

    //需要提供一个更新餐桌状态的方法
    public boolean updateDiningTableState(int id,String state){
        int dml = diningTableDAO.dml("update diningTable set state=? where id=?", state, id);
        return dml > 0;
    }

    //需要提供一个更新餐桌状态为空闲的方法
    public boolean updateDiningTableToFree(int id,String state){
        int dml = diningTableDAO.dml("update diningTable set state=?,orderName = '',orderTel = '' where id=?", state, id);
        return dml > 0;
    }
}
