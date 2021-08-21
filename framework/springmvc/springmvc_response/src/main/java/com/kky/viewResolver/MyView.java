package com.kky.viewResolver;

import org.springframework.web.servlet.View;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.util.Map;

public class MyView implements View {
//    @Override
//    public String getContentType() {
//        return "text/html";
//    }

    @Override
    public void render(Map<String, ?> model, HttpServletRequest request, HttpServletResponse response) throws Exception {

//        String s = "/WEB-INF/page/" + model + ".jsp";
//        System.out.println(s);
        response.sendRedirect("index.jsp");
//        response.setContentType("text/html");
//        PrintWriter writer = response.getWriter();
//        writer.write("<h1>kky</h1>");
//        writer.write("123456");
    }
}
