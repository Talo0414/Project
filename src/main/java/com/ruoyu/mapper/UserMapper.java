package com.ruoyu.mapper;

import com.ruoyu.pojo.User;

import java.util.List;

public interface UserMapper {
    User checkUserByName(String username);
}
