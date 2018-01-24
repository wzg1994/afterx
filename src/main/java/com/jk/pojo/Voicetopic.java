package com.jk.pojo;

import java.util.Date;

public class Voicetopic {
    private Integer voiceid;

    private String voicetitle;

    private Integer zhuboid;

    private Integer voicefrom;

    private Date voicetime;

    private String voicimg;

    private Integer voicyn;

    public Integer getVoiceid() {
        return voiceid;
    }

    public void setVoiceid(Integer voiceid) {
        this.voiceid = voiceid;
    }

    public String getVoicetitle() {
        return voicetitle;
    }

    public void setVoicetitle(String voicetitle) {
        this.voicetitle = voicetitle == null ? null : voicetitle.trim();
    }

    public Integer getZhuboid() {
        return zhuboid;
    }

    public void setZhuboid(Integer zhuboid) {
        this.zhuboid = zhuboid;
    }

    public Integer getVoicefrom() {
        return voicefrom;
    }

    public void setVoicefrom(Integer voicefrom) {
        this.voicefrom = voicefrom;
    }

    public Date getVoicetime() {
        return voicetime;
    }

    public void setVoicetime(Date voicetime) {
        this.voicetime = voicetime;
    }

    public String getVoicimg() {
        return voicimg;
    }

    public void setVoicimg(String voicimg) {
        this.voicimg = voicimg == null ? null : voicimg.trim();
    }

    public Integer getVoicyn() {
        return voicyn;
    }

    public void setVoicyn(Integer voicyn) {
        this.voicyn = voicyn;
    }
}