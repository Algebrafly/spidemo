package com.algebra.spi.handlertypes;

/**
 * @projectName: spidemo
 * @author: Algebra
 * @description: 仅仅为了测试
 * @date: 2019/11/6 21:49
 * @version: 1.0
 */
public abstract class AbsTestService implements ITestService{
    @Override
    public String sayHello(String name) {
        System.out.println("启动中------------------->>>>>name");
        return null;
    }
}
