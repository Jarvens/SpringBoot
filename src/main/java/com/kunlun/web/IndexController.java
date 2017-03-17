package com.kunlun.web;

import com.kunlun.common.DataRet;
import com.kunlun.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by kunlun on 2017/3/17.
 */
@RestController
public class IndexController {

    @Autowired
    private UserService userService;

    @RequestMapping("/index")
    public String index() {
        userService.create("1", "张三");
        userService.create("2", "李四");
        userService.create("3", "王五");
        return "hello world!";
    }

    @RequestMapping("/json")
    public DataRet<String> json() {
        DataRet<String> ret = new DataRet<>();
        ret.setBody("Null");
        ret.setErrorCode("400");
        ret.setMessage("Nothing...");
        return ret;
    }


}
