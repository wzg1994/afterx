package com.jk.pojo;

import java.util.Date;

public class Userinfo {
    private Integer userinfoid;

    private String usersign;

    private Integer userscore;

    private Integer userlocation;

    private Integer usersex;

    private Date userbirthday;

    private Integer userlove;

    private Integer usernowlocation;

    private Integer userhometown;

    private Integer userjob;

    private String usermail;

    private String userpic;

    private String userphone;

    private String userqq;

    private String userwechat;

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
}