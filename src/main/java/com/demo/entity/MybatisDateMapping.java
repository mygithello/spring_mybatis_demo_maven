package com.demo.entity;

import java.util.Date;

public class MybatisDateMapping {

    private int id;
    private String username;
    private String password;
    private Date regTime;

    public MybatisDateMapping(String username, String password, Date regTime) {
        this.username = username;
        this.password = password;
        this.regTime = regTime;
    }

    public MybatisDateMapping() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getRegTime() {
        return regTime;
    }

    public void setRegTime(Date regTime) {
        this.regTime = regTime;
    }

    @Override
    public String toString() {
        return "MybatisDateMapping{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", regTime=" + regTime +
                '}';
    }
}
