package com.vainglory.aspectJAnnotation;

public class UserService {

    public void login(String username,String password){
        System.out.println("用户登录...");
        System.out.println("username:"+username+",password:"+password);
    }
}
