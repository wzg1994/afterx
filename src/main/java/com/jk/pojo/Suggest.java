package com.jk.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class Suggest {
    private Integer suggestid;

    private Integer userides;

    private String suggestmsg;
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy:MM:dd")
    private Date time;
    //业务字段
    private String usernames;

    private Integer useids;

    private String date1;

    private String date2;

    private String hneiyongs;

    public void setHneiyongs(String hneiyongs) {
        this.hneiyongs = hneiyongs;
    }
    public String getHneiyongs() {
        return hneiyongs;
    }

    public void setDate2(String date2) {
        this.date2 = date2;
    }
    public String getDate2() {
        return date2;
    }

    public String getDate1() {
        return date1;
    }
    public void setDate1(String date1) {
        this.date1 = date1;
    }
    public Integer getUseids() {
        return useids;
    }

    public void setUseids(Integer useids) {
        this.useids = useids;
    }

    public String getUsernames() {
        return usernames;
    }

    public void setUsernames(String usernames) {
        this.usernames = usernames == null ? null : usernames.trim();
    }

    public Integer getSuggestid() {
        return suggestid;
    }

    public void setSuggestid(Integer suggestid) {
        this.suggestid = suggestid;
    }

    public Integer getUserides() {
        return userides;
    }

    public void setUserides(Integer userides) {
        this.userides = userides;
    }

    public String getSuggestmsg() {
        return suggestmsg;
    }

    public void setSuggestmsg(String suggestmsg) {
        this.suggestmsg = suggestmsg == null ? null : suggestmsg.trim();
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}