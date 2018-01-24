package com.jk.pojo;

public class Zhubo {
    private Integer zhuboid;//id

    private String zhuboname;//名称

    private String idcard;//身份证

    private String loginname;//昵称

    private String loginpass;//登录密码

    public Integer getZhuboid() {
        return zhuboid;
    }

    public void setZhuboid(Integer zhuboid) {
        this.zhuboid = zhuboid;
    }

    public String getZhuboname() {
        return zhuboname;
    }

    public void setZhuboname(String zhuboname) {
        this.zhuboname = zhuboname == null ? null : zhuboname.trim();
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard == null ? null : idcard.trim();
    }

    public String getLoginname() {
        return loginname;
    }

    public void setLoginname(String loginname) {
        this.loginname = loginname == null ? null : loginname.trim();
    }

    public String getLoginpass() {
        return loginpass;
    }

    public void setLoginpass(String loginpass) {
        this.loginpass = loginpass == null ? null : loginpass.trim();
    }
}