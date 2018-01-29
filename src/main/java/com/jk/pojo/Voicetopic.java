package com.jk.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class Voicetopic {
    private Integer voiceid;

    private String voicetitle;

    private Integer zhuboid;

    private Integer voicefrom;
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy:MM:dd")
    private Date voicetime;

    private String voicimg;

    private Integer voicyn;

    private String neirongs;


    //主播关联业务字段
    private Integer boid;
    private String boname;
    //音频关联业务字段
    private Integer vids;
    private String vurls;
    //文字关联业务字段
    private Integer wenziids;
    private String wenzis;

    public String getNeirongs() {
        return neirongs;
    }

    public void setNeirongs(String neirongs) {
        this.neirongs = neirongs;
    }

    public Integer getBoid() {
        return boid;
    }

    public void setBoid(Integer boid) {
        this.boid = boid;
    }

    public void setBoname(String boname) {
        this.boname = boname;
    }

    public String getBoname() {
        return boname;
    }

    public Integer getVids() {
        return vids;
    }

    public void setVids(Integer vids) {
        this.vids = vids;
    }

    public String getVurls() {
        return vurls;
    }

    public void setVurls(String vurls) {
        this.vurls = vurls;
    }

    public Integer getWenziids() {
        return wenziids;
    }

    public void setWenziids(Integer wenziids) {
        this.wenziids = wenziids;
    }

    public String getWenzis() {
        return wenzis;
    }
    public void setWenzis(String wenzis) {
        this.wenzis = wenzis;
    }

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