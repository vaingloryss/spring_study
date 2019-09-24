package com.vainglory.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import java.awt.image.BandCombineOp;

public class UserBeanProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println(beanName+"初始化方法执行之前...");
        return bean;
    }

    //postProcessAfterInitialization 方法参数中的Bean是postProcessBeforeInitialization返回的Bean、
    //动态代理的代理Bean的构建就在此方法中，
    //代理模式把原始Bean替换为动态生成的代理Bean就是在postProcessAfterInitialization方法中
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println(beanName+"初始化方法执行之后...");
        //此处的放回是getBean方法最终的返回Bean
        //动态代理的BeanPostProcessor就在此返回动态生成的代理Bean
        return bean;
    }
}
