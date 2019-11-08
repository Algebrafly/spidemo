package com.algebra.spi.initializer;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

/**
 * @projectName: spidemo
 * @author: Algebra
 * @description: spring-boot 测试启动（Spring-boot方式的启动入口）
 * @date: 2019/11/6 22:07
 * @version: 1.0
 */
public class MyWebApplicationInitializer implements WebApplicationInitializer {

    @Override
    public void onStartup(ServletContext servletCxt) {

        // Load Spring web application configuration
//        AnnotationConfigWebApplicationContext ac = new AnnotationConfigWebApplicationContext();
//        ac.register(AppConfig.class);
//        ac.refresh();

        // Create and register the DispatcherServlet
//        DispatcherServlet servlet = new DispatcherServlet(ac);
//        ServletRegistration.Dynamic registration = servletCxt.addServlet("app", servlet);
//        registration.setLoadOnStartup(1);
//        registration.addMapping("/app/*");
    }
}
