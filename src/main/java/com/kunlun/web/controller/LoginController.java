package com.kunlun.web.controller;

import com.kunlun.common.DataRet;
import com.kunlun.config.exception.MyException;
import com.kunlun.web.domain.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by kunlun on 2017/3/17.
 */
@RestController
public class LoginController {
    @RequestMapping("/login")
    public DataRet<User> login() throws MyException {
        DataRet<User> ret = new DataRet<>();
        User user = new User();
        ret.setMessage("登录信息");
        ret.setBody(user);
        ret.setErrorCode("LOGIN");
        //throw new MyException("异常");
        return ret;
    }
}
