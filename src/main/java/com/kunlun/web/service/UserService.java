package com.kunlun.web.service;

/**
 * Created by kunlun on 2017/3/17.
 */
public interface UserService {

    void delete(String userId);

    void create(String userId, String userName);
}
