package com.vainglory;

import com.vainglory.domain.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 代替beans.xml配置
 */
@Configuration
public class BeanConfig {

    /**
     * 声明该方法返回一个Bean
     * @return
     */
    @Bean
    public Student student3(){
        return new Student("suxing",11);
    }
}
