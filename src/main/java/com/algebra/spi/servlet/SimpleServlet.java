package com.algebra.spi.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @projectName: spidemo
 * @author: Algebra
 * @description: servlet-web.xml方式加载测试
 * @date: 2019/11/7 20:06
 * @version: 1.0
 */
public class SimpleServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().write("Hello Algebra! This just is a test servlet!");
    }
}
