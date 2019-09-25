package com.vainglory.jdkDynamicProxy;

import com.vainglory.staticProxy.Movie;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author vaingloryss
 * @date 2019/9/24 0024 下午 7:46
 *
 * 卖酒的柜台,Counter_a是对SellWine实现类（如MaoTaiWine）的增强
 * 但是，Counter_a并不像静态代理那样实现SellWine接口，
 * 而是实现InvocationHandler接口，动态代理的核心类
 */
public class Counter_a implements InvocationHandler {
    private Object brand;

    public Counter_a(Object brand){
        this.brand = brand;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("销售开始");
        System.out.println("柜台是："+this.getClass().getSimpleName());
        //核心业务
        method.invoke(brand,args);
        System.out.println("销售结束");
        return null;
    }
}
