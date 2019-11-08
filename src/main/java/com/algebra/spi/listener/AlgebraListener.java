package com.algebra.spi.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * @projectName: spidemo
 * @author: Algebra
 * @description: spi-自定义监听器
 * @date: 2019/11/4 22:08
 * @version: 1.0
 */
@WebListener(value = "AlgebraListener")
public class AlgebraListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        System.out.println("这仅仅是一个测试监听器--------->>> 监听WEB容器初始化-AlgebraListener");
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        System.out.println("这仅仅是一个测试监听器--------->>> 监听WEB容器销毁-AlgebraListener");
    }
}
