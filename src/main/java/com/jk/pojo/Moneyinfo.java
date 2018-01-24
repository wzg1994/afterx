package com.jk.pojo;

import java.util.Date;

public class Moneyinfo {
    private Integer moneyid;

    private Integer userid;

    private Date time;

    private Integer monycount;

    private Integer status;

    private Integer reply;

    public Integer getMoneyid() {
        return moneyid;
    }

    public void setMoneyid(Integer moneyid) {
        this.moneyid = moneyid;
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

    public Integer getMonycount() {
        return monycount;
    }

    public void setMonycount(Integer monycount) {
        this.monycount = monycount;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getReply() {
        return reply;
    }

    public void setReply(Integer reply) {
        this.reply = reply;
    }
}