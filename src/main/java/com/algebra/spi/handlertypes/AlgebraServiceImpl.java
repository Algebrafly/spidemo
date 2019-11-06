package com.algebra.spi.handlertypes;

/**
 * @projectName: spidemo
 * @author: Algebra
 * @description: 仅仅为了测试
 * @date: 2019/11/6 21:46
 * @version: 1.0
 */
public class AlgebraServiceImpl extends AbsTestService {
    @Override
    public String sayHello(String name) {
        System.out.println("Algebra ------------>>> just for test!!!");
        return "Hello algebra, I am " + name;
    }
}
