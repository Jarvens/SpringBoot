package com.kunlun.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by kunlun on 2017/3/17.
 */
@Controller
public class ThymeleafController {

    @RequestMapping("/thymeleaf")
    public String thymeleaf(ModelMap map) {
        map.addAttribute("host", "localhost:8080");
        return "index";
    }
}
