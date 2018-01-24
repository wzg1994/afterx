package com.jk.pojo;

import java.util.Date;

public class Userinfo {
    private Integer userinfoid;//id

    private String usersign;//签名

    private Integer userscore;//积分

    private Integer userlocation;//位置

    private Integer usersex;//性别

    private Date userbirthday;//生日

    private Integer userlove;//恋爱状态

    private Integer usernowlocation;//当前位置

    private Integer userhometown;//家乡

    private Integer userjob;//行业

    private String usermail;//邮箱

    private String userpic;//头像

    private String userphone;//手机号

    private String userqq;//qq

    private String userwechat;//微信






    //别名
    private String uname;//用户表的昵称
    private String nameu;//名字
    private String pass;//密码
    private Integer countu;//积分表的积分
    private String namess;//地区表的地区名 位置
    private String namess2;//当前位置
    private String namess3;//家乡
    private String job;//行业表

    public Integer getUserinfoid() {
        return userinfoid;
    }

    public void setUserinfoid(Integer userinfoid) {
        this.userinfoid = userinfoid;
    }

    public String getUsersign() {
        return usersign;
    }

    public void setUsersign(String usersign) {
        this.usersign = usersign == null ? null : usersign.trim();
    }

    public Integer getUserscore() {
        return userscore;
    }

    public void setUserscore(Integer userscore) {
        this.userscore = userscore;
    }

    public Integer getUserlocation() {
        return userlocation;
    }

    public void setUserlocation(Integer userlocation) {
        this.userlocation = userlocation;
    }

    public Integer getUsersex() {
        return usersex;
    }

    public void setUsersex(Integer usersex) {
        this.usersex = usersex;
    }

    public Date getUserbirthday() {
        return userbirthday;
    }

    public void setUserbirthday(Date userbirthday) {
        this.userbirthday = userbirthday;
    }

    public Integer getUserlove() {
        return userlove;
    }

    public void setUserlove(Integer userlove) {
        this.userlove = userlove;
    }

    public Integer getUsernowlocation() {
        return usernowlocation;
    }

    public void setUsernowlocation(Integer usernowlocation) {
        this.usernowlocation = usernowlocation;
    }

    public Integer getUserhometown() {
        return userhometown;
    }

    public void setUserhometown(Integer userhometown) {
        this.userhometown = userhometown;
    }

    public Integer getUserjob() {
        return userjob;
    }

    public void setUserjob(Integer userjob) {
        this.userjob = userjob;
    }

    public String getUsermail() {
        return usermail;
    }

    public void setUsermail(String usermail) {
        this.usermail = usermail == null ? null : usermail.trim();
    }

    public String getUserpic() {
        return userpic;
    }

    public void setUserpic(String userpic) {
        this.userpic = userpic == null ? null : userpic.trim();
    }

    public String getUserphone() {
        return userphone;
    }

    public void setUserphone(String userphone) {
        this.userphone = userphone == null ? null : userphone.trim();
    }

    public String getUserqq() {
        return userqq;
    }

    public void setUserqq(String userqq) {
        this.userqq = userqq == null ? null : userqq.trim();
    }

    public String getUserwechat() {
        return userwechat;
    }

    public void setUserwechat(String userwechat) {
        this.userwechat = userwechat == null ? null : userwechat.trim();
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public void setNameu(String nameu) {
        this.nameu = nameu;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public void setCountu(Integer countu) {
        this.countu = countu;
    }

    public void setNamess(String namess) {
        this.namess = namess;
    }

    public void setNamess2(String namess2) {
        this.namess2 = namess2;
    }

    public void setNamess3(String namess3) {
        this.namess3 = namess3;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getUname() {
        return uname;
    }

    public String getNameu() {
        return nameu;
    }

    public String getPass() {
        return pass;
    }

    public Integer getCountu() {
        return countu;
    }

    public String getNamess() {
        return namess;
    }

    public String getNamess2() {
        return namess2;
    }

    public String getNamess3() {
        return namess3;
    }

    public String getJob() {
        return job;
    }
}