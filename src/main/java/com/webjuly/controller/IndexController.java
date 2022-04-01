package com.webjuly.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author : guyun
 * @date : 2022/4/1 15:53
 */
@Controller
public class IndexController {

    @RequestMapping("/")
    public String index() {
        return "hello world 55!";
    }
}
