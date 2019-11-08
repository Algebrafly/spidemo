package com.algebra.spi.handlertypes;

/**
 * @projectName: spidemo
 * @author: Algebra
 * @description: 仅仅为了测试
 * @date: 2019/11/6 21:50
 * @version: 1.0
 */
public class TomTestServiceImpl extends AbsTestService {
    @Override
    public String sayHello(String name) {
        System.out.println("Tom ------------>>> just for test!!!");
        return "Hello Tom, I am " + name;
    }
}
