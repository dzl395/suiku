package com.dong.pojo;

import java.util.Date;


public class User {
    private Integer id; // id
    private String userCode; // 用户编码
    private String userName; // 用户名称
    private String userPassword; // 用户密码


    public User() {
    }

    public User(Integer id, String userCode, String userName, String userPassword, Integer gender, Date birthday,
                String phone, String address, Integer userRole, Integer createdBy, Date creationDate, Integer modifyBy,
                Date modifyDate) {
        this.id = id;
        this.userCode = userCode;
        this.userName = userName;
        this.userPassword = userPassword;

    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

}