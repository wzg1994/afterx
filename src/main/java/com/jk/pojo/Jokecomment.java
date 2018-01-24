package com.jk.pojo;

import java.util.Date;

public class Jokecomment {
    private Integer id;

    private Integer userid;

    private String content;

    private Date time;

    private Integer status;

    private Integer joke;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getJoke() {
        return joke;
    }

    public void setJoke(Integer joke) {
        this.joke = joke;
    }
}