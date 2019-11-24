package com.wj.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "user")
public class User implements Serializable{

    @Id
    @Column(name = "user_alias")
    private String userAlias;

    @Column(name = "username")
    private String username;
    @Column(name = "phonenum")
    private String phonenum;
    @Column(name = "email")
    private String email;
    @Column(name = "userid")
    private String userid;
    @Column(name = "password")
    private String password;
    @Column(name = "password_exp")
    private Date passwordExp;
    @Column(name = "reg_dttm")
    private Date regDttm;
    @Column(name = "upt_dttm")
    private Date uptDttm;

    public String getUserAlias() {
        return userAlias;
    }

    public void setUserAlias(String userAlias) {
        this.userAlias = userAlias;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPhonenum() {
        return phonenum;
    }

    public void setPhonenum(String phonenum) {
        this.phonenum = phonenum;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getPasswordExp() {
        return passwordExp;
    }

    public void setPasswordExp(Date passwordExp) {
        this.passwordExp = passwordExp;
    }

    public Date getRegDttm() {
        return regDttm;
    }

    public void setRegDttm(Date regDttm) {
        this.regDttm = regDttm;
    }

    public Date getUptDttm() {
        return uptDttm;
    }

    public void setUptDttm(Date uptDttm) {
        this.uptDttm = uptDttm;
    }

    @Override
    public String toString() {
        return "User{" +
                "userAlias='" + userAlias + '\'' +
                ", username='" + username + '\'' +
                ", phonenum='" + phonenum + '\'' +
                ", email='" + email + '\'' +
                ", userid='" + userid + '\'' +
                ", password='" + password + '\'' +
                ", passwordExp=" + passwordExp +
                ", regDttm=" + regDttm +
                ", uptDttm=" + uptDttm +
                '}';
    }
}
