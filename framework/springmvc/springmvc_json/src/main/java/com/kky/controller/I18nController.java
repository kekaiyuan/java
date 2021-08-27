package com.kky.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Locale;

@Controller
public class I18nController {

//    @Autowired
//    private MessageSource messageSource;

    @RequestMapping("/i18n")
    public String i18n(){
        return "login";
    }

//    @RequestMapping("/i18n")
//    public String i18n(@RequestParam(value = "locale",required = false) String localStr, Locale locale, HttpSession
//            session){
//
////        if (localStr!=null && !"".equals(localStr)){
////            locale = new Locale(localStr.split("_")[0],localStr.split("_")[1]);
////        }
////        System.out.println(locale);
//
////        session.setAttribute(SessionLocaleResolver.class.getName()+".LOCALE",locale);
//        return "login";
//    }
}
