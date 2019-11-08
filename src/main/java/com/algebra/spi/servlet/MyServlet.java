package com.algebra.spi.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @projectName: spidemo
 * @author: Algebra
 * @description: api-测试servlet
 * @date: 2019/11/4 22:26
 * @version: 1.0
 */
public class MyServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().write("Hello Servlet! This just is a test servlet of SPI!");
    }
}
