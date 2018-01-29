package com.jk.pojo;

public class Pictopic {
    private Integer pictopicid;

    private Integer groupid;//图片分组id picgroup图片组表

    private Integer typeid;//类型id menu菜单表

    private String content;

    private Integer likecount;//喜欢人数

    private Integer picyn;//状态

    private String groupname;

    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getGroupname() {
        return groupname;
    }

    public void setGroupname(String groupname) {
        this.groupname = groupname;
    }

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