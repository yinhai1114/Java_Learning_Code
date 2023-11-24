package com.yinhai.jdbc.myjdbc;

/**
 * @author 银小海
 * @version 1.0
 * @email yinhai14@qq.com
 */
public class MysqlJdbcImpl implements JdbcInterface {
    @Override
    public Object getConnection() {
        System.out.println("得到 Mysql的连接 升级");
        return null;
    }

    @Override
    public void crud() {
        System.out.println("完成 对Mysql的增删改查");
    }

    @Override
    public void close() {
        System.out.println("关闭 对Mysql的连接");
    }
}
