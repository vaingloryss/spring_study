package com.vainglory.cglibDynamicProxy.advice;

import com.vainglory.cglibDynamicProxy.HelloService;
import net.sf.cglib.core.DebuggingClassWriter;
import net.sf.cglib.proxy.Enhancer;

/**
 * @author vaingloryss
 * @date 2019/9/25 0025 上午 8:33
 *
 * 测试类
 */
public class Client {
    public static void main(String[] args) {
        //生成的代理类的class文件存入本地磁盘
        System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY,"d:\\code");
        //通过cglib动态代理获取代理对象的过程，创建Enhancer（增强）类对象
        Enhancer enhancer = new Enhancer();
        //设置enhancer对象的父类
        enhancer.setSuperclass(HelloService.class);
        //设置enhancer的回调对象
        enhancer.setCallback(new HelloServiceMethodInterceptor());
        //创建代理对象
        HelloService helloServiceProxy = (HelloService) enhancer.create();
        //通过代理对象调用被代理对象的方法
        helloServiceProxy.sayHello();
    }
}
