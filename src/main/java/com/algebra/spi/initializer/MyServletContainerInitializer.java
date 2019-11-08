package com.algebra.spi.initializer;

import com.algebra.spi.filter.MyFilter;
import com.algebra.spi.listener.MyListener;
import com.algebra.spi.handlertypes.ITestService;
import com.algebra.spi.servlet.MyServlet;

import javax.servlet.*;
import javax.servlet.annotation.HandlesTypes;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;

@HandlesTypes(value = {ITestService.class})
public class MyServletContainerInitializer implements ServletContainerInitializer {
    @Override
    public void onStartup(Set<Class<?>> set, ServletContext servletContext) throws ServletException {
        List<ITestService> testServices = new ArrayList<>();
        if(set != null){
            for (Class<?> aClass : set) {
                if(!aClass.isInterface()
                        && !Modifier.isAbstract(aClass.getModifiers())
                        && ITestService.class.isAssignableFrom(aClass)){
                    try {
                        testServices.add((ITestService) aClass.newInstance());
                    } catch (InstantiationException | IllegalAccessException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        for (ITestService testService : testServices) {
            testService.sayHello("SPI TEST!");
        }
        servletContext.addListener(MyListener.class);

        ServletRegistration.Dynamic servletRegistration = servletContext.addServlet("myServlet", new MyServlet());
        servletRegistration.addMapping("/myServlet");

        FilterRegistration.Dynamic filterRegistration = servletContext.addFilter("myFilter", MyFilter.class);
        filterRegistration.addMappingForUrlPatterns(EnumSet.of(DispatcherType.REQUEST),true,"/myServlet");
    }
}
