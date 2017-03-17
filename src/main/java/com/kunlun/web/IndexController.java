package com.kunlun.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by kunlun on 2017/3/17.
 */
@RestController
public class IndexController {

    @RequestMapping("/index")
    public String index(){
        return "hello world!";
    }


}
