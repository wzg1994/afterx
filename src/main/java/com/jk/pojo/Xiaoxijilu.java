package com.jk.pojo;

import java.util.Date;

public class Xiaoxijilu {
    private Integer id;

    private Integer fasongren;

    private String content;

    private Integer type;

    private Date time;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getFasongren() {
        return fasongren;
    }

    public void setFasongren(Integer fasongren) {
        this.fasongren = fasongren;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}