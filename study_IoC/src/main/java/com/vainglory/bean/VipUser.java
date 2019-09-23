package com.vainglory.bean;

public class VipUser {
    private Integer id;
    private String username;
    private String gender;
    private String phone;
    private Integer vipId;

    public void init(){
        System.out.println("VipUser 被初始化了...");
    }
    public void destroy(){
        System.out.println("VipUser 被销毁了...");
    }
    public VipUser(Integer id, String username, String gender, String phone, Integer vipId) {
        this.id = id;
        this.username = username;
        this.gender = gender;
        this.phone = phone;
        this.vipId = vipId;
    }

    public VipUser() {
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

    public Integer getVipId() {
        return vipId;
    }

    public void setVipId(Integer vipId) {
        this.vipId = vipId;
    }

    @Override
    public String toString() {
        return "VipUser{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", gender='" + gender + '\'' +
                ", phone='" + phone + '\'' +
                ", vipId=" + vipId +
                '}';
    }
}
