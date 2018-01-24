package com.jk.pojo;

public class Voicecomment {
    private Integer vcommentid;

    private String vccontent;

    private Integer userid;

    private Integer vid;

    public Integer getVcommentid() {
        return vcommentid;
    }

    public void setVcommentid(Integer vcommentid) {
        this.vcommentid = vcommentid;
    }

    public String getVccontent() {
        return vccontent;
    }

    public void setVccontent(String vccontent) {
        this.vccontent = vccontent == null ? null : vccontent.trim();
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getVid() {
        return vid;
    }

    public void setVid(Integer vid) {
        this.vid = vid;
    }
}