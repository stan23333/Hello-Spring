package com.test_spring.diy_cutpoint;

public class Pointcut {
    public void before() {
        System.out.println("======方法执行前======");
    }

    public void after() {
        System.out.println("======方法执行后======");
    }
}
