package com.kunlun.web.impl;

import com.kunlun.web.domain.User;
import com.kunlun.web.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kunlun on 2017/3/17.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void delete(String userId) {
        jdbcTemplate.update("delete from user where userId=?", userId);
    }

    @Override
    public void create(String userId, String userName) {
        jdbcTemplate.update("insert into user(userId,userName) values(?,?)", userId, userName);
    }

    @Override
    public List<User> getAllUser() {
        List<User> list = new ArrayList<>();
        list = jdbcTemplate.queryForList("select * from user", User.class);
        return list;
    }
}
