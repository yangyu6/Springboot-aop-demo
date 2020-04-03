package com.yu.annotationdemo.model;

import lombok.ToString;

/**
 * @author: yu
 * @description:
 * @create: 2020-04-03 13:35
 **/
public class User {

    public String username;

    private String password;

    @Override
    public String toString() {
        return "username:" + username + "--password:" + password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
