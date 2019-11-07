package com.algebra.test.spi;

import java.util.ServiceLoader;

/**
 * @projectName: spidemo
 * @author: Algebra
 * @description: 测试主类
 * @date: 2019/11/6 21:36
 * @version: 1.0
 */
public class MainClass {

    public static void main(String[] args) {
        ServiceLoader<IParseDocs> parseDocs = ServiceLoader.load(IParseDocs.class);
        for (IParseDocs parseDoc : parseDocs) {
            parseDoc.parse();
        }

    }
}
