package com.jk.pojo;

public class User {
    private Integer userid;

    private String usernickname;//昵称

    private String username;//名字

    private String userpass;//密码

    private Integer userinfo;//关联表

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUsernickname() {
        return usernickname;
    }

    public void setUsernickname(String usernickname) {
        this.usernickname = usernickname == null ? null : usernickname.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getUserpass() {
        return userpass;
    }

    public void setUserpass(String userpass) {
        this.userpass = userpass == null ? null : userpass.trim();
    }

    public Integer getUserinfo() {
        return userinfo;
    }

    public void setUserinfo(Integer userinfo) {
        this.userinfo = userinfo;
    }
}