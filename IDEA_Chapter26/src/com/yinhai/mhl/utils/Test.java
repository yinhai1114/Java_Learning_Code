package com.yinhai.mhl.utils;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * @author 银小海
 * @version 1.0
 * @email yinhai14@qq.com
 */
public class Test {
    public static void main(String[] args) throws SQLException {

        int i = Utility.readInt();
        System.out.println(i);

        Connection connection = JDBCUtilsByDruid.getConnection();
        System.out.println(connection);
    }
}
