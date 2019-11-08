package com.algebra.spi.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @projectName: spidemo
 * @author: Algebra
 * @description: 原生J2EE-web项目配置
 * @date: 2019/11/6 21:19
 * @version: 1.0
 */
@WebServlet(value = {"/hello"})
public class AlgebraServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().write("Hello Algebra! This just is a test servlet!");
    }
}
