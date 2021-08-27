package com.kky.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * @author 柯凯元
 * @date 2021/08/06 10:22
 */

@Controller
public class PathVariableController {

    /**
     * @PathVariable 可以获取路径中的值
     *  在路径要用{变量名称}做标识
     *  在方法参数中添加 @PathVariable 做识别，如果路径和方法形参的参数名不一致，可以添加路径中的变量
     *  推荐添加
     * @param id
     * @param username
     * @param map
     * @return
     */
    @RequestMapping("/hello/{id}/{username}")
    public String testPathVariable(@PathVariable("id") Integer id,
                                   @PathVariable("username") String username,
                                   Map<String, String> map) {
        map.put("hello", id + "号" + username);
        //System.out.println(username);
        return "hello";
    }

}
