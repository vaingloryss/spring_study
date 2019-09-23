package com.vainglory.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ByType {
    /*
    由属性类型指定自动装配
    在 XML 配置文件中 beans 的 autowire 属性设置为 byType
    如果它的 type 恰好与配置文件中 beans 名称中的一个相匹配，它将尝试匹配和连接它的属性
    如果找到匹配项，它将注入这些 beans，否则，它将抛出异常
     */
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        TextEditor textEditor2 = (TextEditor) context.getBean("textEditor2");
        textEditor2.spellCheck();
    }
}
