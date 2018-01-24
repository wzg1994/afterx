package com.jk.pojo;

public class Voicefont {
    private Integer wenziid;

    private String wenzi;

    public Integer getWenziid() {
        return wenziid;
    }

    public void setWenziid(Integer wenziid) {
        this.wenziid = wenziid;
    }

    public String getWenzi() {
        return wenzi;
    }

    public void setWenzi(String wenzi) {
        this.wenzi = wenzi == null ? null : wenzi.trim();
    }
}