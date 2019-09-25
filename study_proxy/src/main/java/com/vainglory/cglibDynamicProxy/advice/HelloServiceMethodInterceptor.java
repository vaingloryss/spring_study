package com.vainglory.cglibDynamicProxy.advice;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author vaingloryss
 * @date 2019/9/25 0025 上午 8:29
 */
public class HelloServiceMethodInterceptor implements MethodInterceptor {
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("=========插入前置通知=======");
        Object object = methodProxy.invokeSuper(o, objects);
        System.out.println("=========插入后置通知=======");
        return object;
    }
}
