package com.vainglory.cglibDynamicProxy;

/**
 * @author vaingloryss
 * @date 2019/9/25 0025 上午 8:24
 *
 * 被代理类
 */
public class HelloService {
    public HelloService(){
        System.out.println("HelloService的构造方法...");
    }

    /**
     * final修饰的方法不能被cglib代理
     * @param name
     */
    final void sayOthers(String name){
        System.out.println("HelloService:Hello !"+name);
    }

    public void sayHello(){
        System.out.println("HelloService:Hello...");
    }

}
