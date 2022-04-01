package com.webjuly.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author : guyun
 * @date : 2022/4/1 16:38
 */
@Controller
public class SecondController {

    @RequestMapping("/second")
    public String second() {
        return "next go!";
    }
}
