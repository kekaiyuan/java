package com.kky.controller;

import com.kky.UsernameException;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

/**
 * 当使用ExceptionHandler进行处理的时候，默认会先走小范围，然后再寻找大范围
 * 当在某一个类中定义的ExceptionHandler只能处理当前类的异常信息，如果其他类包含的话，无法进行处理
 * 可以通过@ControllerAdvice注解进行标注，表示为全局异常处理类
 * <p>
 * 每次进行异常处理的时候，现在本类查找，然后去查找全局配置
 */
@Controller
public class ExceptionController {

    @RequestMapping("/exception1")
    public String exception() {
        System.out.println(this.getClass().getName());
        int i = 10 / 0;
        return "success";
    }

    /**
     * @return
     * @ResponseStatus虽然可以标注在方法上，但是不推荐使用
     */
    @ResponseStatus(reason = "我就是错了，不知道什么原因", value = HttpStatus.NOT_ACCEPTABLE)
    @RequestMapping("/exception2")
    public String exception2() {
        System.out.println("exception2");
        return "success";
    }

    @RequestMapping("/exception3")
    public void exception3() {
        throw new UsernameException();
    }

    @RequestMapping(value = "/exception4", method = RequestMethod.POST)
    public String exception4() {
        System.out.println("exception3");
        return "success";
    }

    @ExceptionHandler(value = {ArithmeticException.class, NullPointerException.class})
    public ModelAndView handlerException1(Exception exception) {
        System.out.println("1");
        ModelAndView mv = new ModelAndView();
        mv.setViewName("error");
        mv.addObject("exce", exception);
        return mv;
    }

    @ExceptionHandler(value = {Exception.class})
    public ModelAndView handlerException2(Exception exception) {
        System.out.println("2");
        ModelAndView mv = new ModelAndView();
        mv.setViewName("error");
        mv.addObject("exce", exception);
        return mv;
    }
}
