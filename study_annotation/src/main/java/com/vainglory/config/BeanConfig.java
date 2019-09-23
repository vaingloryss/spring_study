package com.vainglory.config;

import com.vainglory.domain.SpellChecker;
import com.vainglory.domain.Student;
import com.vainglory.domain.TextEditor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * 代替beans.xml配置
 */
@Configuration
//引入其他配置文件，使用其中配置的Bean
@Import(SpellCheckerConfig.class)
public class BeanConfig {

    /**
     * 带有 @Configuration 的注解类表示这个类可以使用 Spring IoC 容器作为 bean 定义的来源。
     * @Bean 注解告诉 Spring，一个带有 @Bean 的注解方法将返回一个对象，该对象应该被注册为在 Spring 应用程序上下文中的 bean。
     * @import 注解可以直接把一个bean导入到了当前容器中，还允许从另一个配置类中加载 @Bean 定义
     *
     * @return
     */

    //指定初始化和销毁方法
    @Bean(initMethod = "init",destroyMethod = "cleanup")
    public Student student3(){
        return new Student("suxing",11);
    }

    @Bean
    public TextEditor textEditor(){
        return new TextEditor();
    }
}
