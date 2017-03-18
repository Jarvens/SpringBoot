package com.kunlun.web.service;

import com.kunlun.web.domain.User;

import java.util.List;

/**
 * Created by kunlun on 2017/3/17.
 */
public interface UserService {

    void delete(String userId);

    void create(String userId, String userName);

    List<User> getAllUser();
}
