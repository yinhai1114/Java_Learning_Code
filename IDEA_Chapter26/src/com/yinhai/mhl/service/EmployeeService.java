package com.yinhai.mhl.service;

import com.yinhai.mhl.dao.EmployeeDAO;
import com.yinhai.mhl.domain.Employee;

/**
 * @author 银小海
 * @version 1.0
 * @email yinhai14@qq.com
 * 该类调用EmployeeDAO对象完成对表的各种操作
 */
public class EmployeeService {

    //定义一个EmployeeDAO属性
    private EmployeeDAO employeeDAO = new EmployeeDAO();

    //方法 根据empId和pwd返回一个Employee对象
    public Employee getEmployeeByIdAndPwd(String empId,String pwd){

        return employeeDAO.querySingle("select * from employee where empId=? and pwd=md5(?)", Employee.class, empId, pwd);
    }
}
