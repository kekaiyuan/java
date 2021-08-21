package com.kky.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ViewResolverController {

    @RequestMapping("/kky")
    public String testView(){
        System.out.println("testView");
        return "kky:/index";
    }

    @RequestMapping("/msb2")
    public String testView2(){
        System.out.println("testView");
        return "heihei:/index";
    }
}
