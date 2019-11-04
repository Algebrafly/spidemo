package com.algebra.spi.filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * @projectName: spidemo
 * @author: Algebra
 * @description: spi-自定义过滤器
 * @date: 2019/11/4 22:07
 * @version: 1.0
 */
public class MyFilter implements Filter {


    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

    }

    @Override
    public void destroy() {

    }
}
