package com.kunlun;

import com.kunlun.web.service.UserService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by kunlun on 2017/3/17.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(Application.class)
public class ApplicationTest {

    @Autowired
    private UserService userService;
    @Before
    public void setUp(){
        System.out.println("Do Nothing...");
//        userService.create("1","张三");
//        userService.create("2","李四");
//        userService.create("3","王五");
    }

    @Test
    public void test() throws Exception{
        userService.create("1","张三");
        userService.create("2","李四");
        userService.create("3","王五");
    }
}