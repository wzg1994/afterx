package com.jk.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class Photo {
    private Integer photoid;

    public String getPicid() {
        return picid;
    }

    public void setPicid(String picid) {
        this.picid = picid;
    }

    private String picid;

    public Integer getPicgroupid() {
        return picgroupid;
    }

    public void setPicgroupid(Integer picgroupid) {
        this.picgroupid = picgroupid;
    }

    private Integer picgroupid;

    private String photourl;

    private Integer userid;
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy:MM:dd")
    private Date time;
    private String tidate;

    public String getTidate() {
        return tidate;
    }

    public void setTidate(String tidate) {
        this.tidate = tidate;
    }

    public Integer getPhotoid() {
        return photoid;
    }

    public void setPhotoid(Integer photoid) {
        this.photoid = photoid;
    }

    public String getPhotourl() {
        return photourl;
    }

    public void setPhotourl(String photourl) {
        this.photourl = photourl == null ? null : photourl.trim();
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}