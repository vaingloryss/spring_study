
package com.vainglory.aopInterface.advice;
import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class CustomMethodInterceptor implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        System.out.println(invocation.getMethod().getName()+"的环绕通知（前）执行了");
        Object o = invocation.proceed();
        System.out.println(invocation.getMethod().getName()+"的环绕通知（后）执行了");
        return o;
    }
}
