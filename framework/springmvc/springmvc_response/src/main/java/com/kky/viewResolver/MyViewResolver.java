package com.kky.viewResolver;

import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;

import java.util.Locale;

//@Component
@Order(0)
public class MyViewResolver implements ViewResolver/*, Ordered*/ {

//    private int order = 0;

    @Override
    public View resolveViewName(String viewName, Locale locale) throws Exception {

        if (viewName.startsWith("kky:")) {
            return new MyView();
        } else {
            return null;
        }
//        if(viewName.startsWith("kky:")){
//            System.out.println(viewName);
//            return new MyView();
//        }else{
//            return null;
//        }
    }

//    @Override
//    public int getOrder() {
//        return 0;
//    }

//    public void setOrder(int order) {
//        this.order = order;
//    }
//
//    @Override
//    public int getOrder() {
//        return 0;
//    }
}
