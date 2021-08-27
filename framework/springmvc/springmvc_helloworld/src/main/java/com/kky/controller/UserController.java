package com.kky.controller;

import com.kky.bean.User;
import com.kky.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author 柯凯元
 * @date 2021/08/06 11:30
 */
@Controller
@RequestMapping("user")
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping(method = RequestMethod.POST)
    public void insert() {
        userService.insert(new User());
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable("id") Integer id) {
        userService.delete(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public void update(@PathVariable("id") Integer id) {
        userService.update(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public void select(@PathVariable("id") Integer id) {
        userService.select(id);
    }
}
