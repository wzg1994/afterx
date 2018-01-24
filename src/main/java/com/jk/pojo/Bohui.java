package com.jk.pojo;

public class Bohui {
    private Integer id;

    private Integer huatiid;

    private Integer type;

    private String yuanyin;

    private Integer userid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getHuatiid() {
        return huatiid;
    }

    public void setHuatiid(Integer huatiid) {
        this.huatiid = huatiid;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getYuanyin() {
        return yuanyin;
    }

    public void setYuanyin(String yuanyin) {
        this.yuanyin = yuanyin == null ? null : yuanyin.trim();
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }
}