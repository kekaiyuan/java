package com.kky;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class MyGlobalExceptionHandler {

    @ExceptionHandler(value = {ArithmeticException.class,NullPointerException.class})
    public ModelAndView handlerException1(Exception exception){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("error");
        mv.addObject("exce",exception);
        return mv;
    }

    @ExceptionHandler(value = {Exception.class})
    public ModelAndView handlerException2(Exception exception){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("error");
        mv.addObject("exce",exception);
        return mv;
    }
}
