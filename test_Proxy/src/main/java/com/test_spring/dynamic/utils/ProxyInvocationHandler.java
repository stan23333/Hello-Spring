package com.test_spring.dynamic.utils;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyInvocationHandler implements InvocationHandler {
    private Object target;

    public Object getTarget() {
        return target;
    }

    public void setTarget(Object target) {
        this.target = target;
    }

    //重写InvocationHandler接口，添加代理的功能
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //动态代理的本质，就是使用反射机制实现！
        Object result = method.invoke(target, args);
        //代理的功能
        newFunction();
        log(method.getName());
        return result;
    }

    //生成代理类
    public Object getProxy() {
        return Proxy.newProxyInstance
                (this.getClass().getClassLoader(),
                        target.getClass().getInterfaces(),
                        this);
    }

    //代理功能
    public void newFunction(){
        System.out.println("代理的功能");
    }
    public void log(String msg){
        System.out.println("[Debug] 使用了一个"+msg+"方法");
    }




}
