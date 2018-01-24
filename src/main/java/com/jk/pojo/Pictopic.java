package com.jk.pojo;

public class Pictopic {
    private Integer pictopicid;

    private Integer groupid;

    private Integer typeid;

    private String content;

    private Integer likecount;

    private Integer picyn;

    public Integer getPictopicid() {
        return pictopicid;
    }

    public void setPictopicid(Integer pictopicid) {
        this.pictopicid = pictopicid;
    }

    public Integer getGroupid() {
        return groupid;
    }

    public void setGroupid(Integer groupid) {
        this.groupid = groupid;
    }

    public Integer getTypeid() {
        return typeid;
    }

    public void setTypeid(Integer typeid) {
        this.typeid = typeid;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Integer getLikecount() {
        return likecount;
    }

    public void setLikecount(Integer likecount) {
        this.likecount = likecount;
    }

    public Integer getPicyn() {
        return picyn;
    }

    public void setPicyn(Integer picyn) {
        this.picyn = picyn;
    }
}