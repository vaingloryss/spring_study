package com.vainglory.testAOP;

import com.vainglory.aopInterface.OrderService;
import com.vainglory.aspectJAnnotation.UserService;
import com.vainglory.domain.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 三种aop实现方式的测试类
 */
public class TestAop {

    /**
     * 测试配置schema方式实现AOP（domain包中）
     */
    @Test
    public  void test(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("aopBeans.xml");
        Student student = applicationContext.getBean("student", Student.class);
        System.out.println("TestAop日志：test执行了...");
        System.out.println(student.toString());
    }

    /**
     * 测试aspectJ注解方式实现AOP
     */
    @Test
    public void test01(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("aspectJAnnotationBeans.xml");
        UserService userService = applicationContext.getBean("userService", UserService.class);
        userService.login("suxing","123123");
    }

    /**
     * 测试aop接口方式实现aop
     */
    @Test
    public void test02(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("aopInterfaceBeans.xml");
        OrderService oderService = applicationContext.getBean("orderService", OrderService.class);
        oderService.addOrder();
    }
}