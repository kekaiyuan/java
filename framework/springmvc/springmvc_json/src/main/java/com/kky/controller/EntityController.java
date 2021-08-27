package com.kky.controller;

import org.springframework.http.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;

import java.nio.charset.Charset;
import java.util.Locale;

@Controller
public class EntityController {

    @RequestMapping("/testHttpEntity")
    public void test(HttpEntity<String> httpEntity){
        System.out.println(httpEntity);
    }

    /**
     * 自定义响应相关的信息，包含body和header
     *
     * @return
     */
    @RequestMapping("/testResponseEntity")
    public ResponseEntity<String> testResponseEntity() {
        String str = "<h1>test response entity</h1>";
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("Set-Cookie", "name=zhangsan");
        return new ResponseEntity<String>(str, httpHeaders, HttpStatus.OK);
    }
}
