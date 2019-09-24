package com.vainglory.domain;

/**
 * 声明切面Logging，实现日志功能
 */
public class Logging {
    //Advice建言，即一些额外的功能
    //前置通知
    public void beforeAdvice(){
        System.out.println("Going to setup student profile.");
    }
    //后置通知
    public void afterAdvice(){
        System.out.println("Student profile has been setup.");
    }
    //返回时
    public void afterReturningAdvice(Object retVal){
        System.out.println("Returning:"+retVal.toString());
    }
    //异常通知
    public void afterThrowingAdvice(IllegalArgumentException ex){
        System.out.println("There has been an exception:"+ex.toString());
    }
}
