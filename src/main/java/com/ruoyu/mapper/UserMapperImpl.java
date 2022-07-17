package com.ruoyu.mapper;

import com.ruoyu.pojo.User;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

public class UserMapperImpl implements UserMapper{
    private SqlSessionTemplate sqlSessionTemplate;

    public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
        this.sqlSessionTemplate = sqlSessionTemplate;
    }

    @Override
    public User checkUserByName(String username) {
        return sqlSessionTemplate.getMapper(UserMapper.class).checkUserByName(username);
    }
}
