package com.vainglory.Factory;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class SqlSessionFactoryFactoryMethod {
    public SqlSessionFactory getSqlSessionFactory(){
        System.out.println("getSqlSessionFactory...");
        try {
            InputStream is = Resources.getResourceAsStream("mybatisConfig.xml");
            return new SqlSessionFactoryBuilder().build(is);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
