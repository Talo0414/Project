package com.ruoyu.service;

import com.ruoyu.mapper.UserMapper;
import com.ruoyu.pojo.User;

public class UserServiceImpl implements UserService{
    private UserMapper userMapper;

    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public User checkUserByName(String username) {
        return userMapper.checkUserByName(username);
    }
}
