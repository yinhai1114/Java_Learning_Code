package com.yinhai.qqcommon;

import java.io.Serializable;

/**
 * @author 银海
 * @version 1.0
 */
public class User implements Serializable {
    private static final long serialVersionUID = 1L;//用于记录序列化ID
    private String userId;
    private String password;

    public User(String userId, String password) {
        this.userId = userId;
        this.password = password;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public User(){

    }
}
