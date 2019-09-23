package com.vainglory.bean;

public class User {
    private Integer id;
    private String username;
    private String gender;
    private String phone;

    public void init(){
        System.out.println("user 被初始化了...");
    }
    public void destroy(){
        System.out.println("user 被销毁了...");
    }

    public User(Integer id, String username, String gender, String phone) {
        this.id = id;
        this.username = username;
        this.gender = gender;
        this.phone = phone;
    }

    public User() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", gender='" + gender + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
