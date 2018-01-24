package com.jk.pojo;

public class Voice {
    private Integer vid;

    private String vurl;

    private Integer vfont;

    public Integer getVid() {
        return vid;
    }

    public void setVid(Integer vid) {
        this.vid = vid;
    }

    public String getVurl() {
        return vurl;
    }

    public void setVurl(String vurl) {
        this.vurl = vurl == null ? null : vurl.trim();
    }

    public Integer getVfont() {
        return vfont;
    }

    public void setVfont(Integer vfont) {
        this.vfont = vfont;
    }
}