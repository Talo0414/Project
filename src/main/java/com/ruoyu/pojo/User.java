package com.ruoyu.pojo;

import org.springframework.stereotype.Component;

/*
create table tab_inventory(
    uid int primary key ,
    username varchar(20),
	password varchar(20)
);
 */
//用户表实体类
@Component
public class User {
    private int id;
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
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
