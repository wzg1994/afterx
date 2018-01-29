package com.jk.pojo;

public class HuiFu {
    private Integer hid;

    private Integer huserid;

    private String hneiyong;

    public Integer getHid() {
        return hid;
    }

    public void setHid(Integer hid) {
        this.hid = hid;
    }

    public Integer getHuserid() {
        return huserid;
    }

    public void setHuserid(Integer huserid) {
        this.huserid = huserid;
    }

    public String getHneiyong() {
        return hneiyong;
    }

    public void setHneiyong(String hneiyong) {
        this.hneiyong = hneiyong == null ? null : hneiyong.trim();
    }
}