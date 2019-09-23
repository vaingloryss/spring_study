package com.vainglory.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;

public class Student {
    private String name;
    private Integer age;
    public Student(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
    public Student() {
    }

    //@Autowired(required = false)
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    //表示该注解必须配置在xml文件中
    //@Required
    public void setAge(Integer age) {
        this.age = age;
    }
    public Integer getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    //生命周期回调方法
    //初始化
    public void init() {
        System.out.println("init...");
        // initialization logic
    }
    //销毁
    public void cleanup() {
        System.out.println("cleanup...");
        // destruction logic
    }
}
