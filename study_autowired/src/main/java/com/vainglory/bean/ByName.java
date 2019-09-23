package com.vainglory.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ByName {
    /*
    由属性名称指定自动装配
    XML 配置文件中 beans 的 auto-wire 属性设置为 byName
    将它的属性与配置文件中定义为相同名称的 beans 进行匹配和连接
    找到匹配项，它将注入这些 beans，否则，它将抛出异常
     */
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        TextEditor textEditor = (TextEditor) context.getBean("textEditor");
        textEditor.spellCheck();
    }
}
