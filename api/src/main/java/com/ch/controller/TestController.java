package com.ch.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Author : chengheng
 * Description : xxx
 * created at : 2019/1/2 8:22 PM
 */
@Controller
public class TestController {
    @RequestMapping(value = "/test")
    @ResponseBody
    public String test(){
        return "if you see this ,you success";
    }
}
