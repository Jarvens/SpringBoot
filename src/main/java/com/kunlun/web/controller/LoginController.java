package com.kunlun.web.controller;

import com.kunlun.common.DataRet;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by kunlun on 2017/3/17.
 */
@RestController
public class LoginController {
    @RequestMapping("/login")
    public DataRet<String> login() {
        DataRet<String> ret = new DataRet<>();
        ret.setMessage("登录");
        ret.setBody("结构体");
        return ret;
    }
}
