package com.jk.pojo;

import java.util.Date;

public class Suggest {
    private Integer suggestid;

    private Integer userid;

    private String suggestmsg;

    private Date time;

    public Integer getSuggestid() {
        return suggestid;
    }

    public void setSuggestid(Integer suggestid) {
        this.suggestid = suggestid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
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