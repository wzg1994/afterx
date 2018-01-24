package com.jk.pojo;

public class Leavemsg {
    private Integer leavemsgid;

    private Integer userid;

    private String msgcontent;

    private Integer beiuserid;

    private Integer type;

    public Integer getLeavemsgid() {
        return leavemsgid;
    }

    public void setLeavemsgid(Integer leavemsgid) {
        this.leavemsgid = leavemsgid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getMsgcontent() {
        return msgcontent;
    }

    public void setMsgcontent(String msgcontent) {
        this.msgcontent = msgcontent == null ? null : msgcontent.trim();
    }

    public Integer getBeiuserid() {
        return beiuserid;
    }

    public void setBeiuserid(Integer beiuserid) {
        this.beiuserid = beiuserid;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }
}