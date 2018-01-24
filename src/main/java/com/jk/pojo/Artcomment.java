package com.jk.pojo;

import java.util.Date;

public class Artcomment {
    private Integer artcommentid;

    private Integer userid;

    private String content;

    private Date time;

    private Integer articleid;

    public Integer getArtcommentid() {
        return artcommentid;
    }

    public void setArtcommentid(Integer artcommentid) {
        this.artcommentid = artcommentid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Integer getArticleid() {
        return articleid;
    }

    public void setArticleid(Integer articleid) {
        this.articleid = articleid;
    }
}