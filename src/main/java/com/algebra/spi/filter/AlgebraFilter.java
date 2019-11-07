package com.algebra.spi.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * @projectName: spidemo
 * @author: Algebra
 * @description: spi-自定义过滤器
 * @date: 2019/11/4 22:07
 * @version: 1.0
 */
@WebFilter(urlPatterns = {"/helloAlgebra2"},filterName = "AlgebraFilter")
public class AlgebraFilter implements Filter {


    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("这仅仅是一个测试过滤器----->>> 过滤器初始化-AlgebraFilter");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("这仅仅是一个测试过滤器----->>> 过滤器执行具体过滤逻辑-AlgebraFilter");
        filterChain.doFilter(servletRequest,servletResponse);
    }

    @Override
    public void destroy() {
        System.out.println("这仅仅是一个测试过滤器----->>> 过滤器销毁-AlgebraFilter");
    }
}
