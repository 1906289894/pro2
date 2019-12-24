package com.wb.domain;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component("user")
public class User implements Serializable {
    private int id;
    private String username;
    private String password;

    public int getId() {
        return id;
    }

    //@Required  必须添加属性
    public void setId(int id) {
        this.id = id;
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

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
