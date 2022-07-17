package com.ruoyu.ui.login;

import com.ruoyu.mapper.UserMapper;
import com.ruoyu.pojo.User;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class CheckUser {
    private String username;
    private String password;

    private SqlSessionTemplate sqlSessionTemplate;
    User user;
    public static String checkoverusername;

    public boolean CheckUser(String username, String password) {
        this.username = username;
        this.password = password;

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMapper userMapper = context.getBean("userMapper", UserMapper.class);
        user = userMapper.checkUserByName(username);

        //调试用输出
        //System.out.println(user);

        if (user == null) {
            return false;
        } else {
            checkoverusername = user.getUsername();
            return user.getPassword().equals(password);
        }
    }
}
