package com.example.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author yuanhang.liu@tcl.com
 * @description
 * @date 2020-10-10 10:38
 **/
@Controller
public class TestController {

    @GetMapping("/test")
    @ResponseBody
    public String test(){
        return "test.do";
    }

    @GetMapping("/index")
    public String index(){
        return "index.jsp";
    }
}
