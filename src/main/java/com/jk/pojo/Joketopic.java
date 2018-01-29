package com.jk.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Joketopic {
    private Integer jokeid;

    private String joketitle;

    public void setJokedate(String jokedate) {
        this.jokedate = jokedate;
    }
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy:MM:dd")
    private Date joketime;

    public String getJokedate() {
        return jokedate;
    }

    private  String jokedate;

    private String jokecontent;

    private Integer typeid;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    private String  text;


    private Integer adminid;

    private Integer jokeyn;

    public Integer getJokeid() {
        return jokeid;
    }

    public void setJokeid(Integer jokeid) {
        this.jokeid = jokeid;
    }

    public String getJoketitle() {
        return joketitle;
    }

    public void setJoketitle(String joketitle) {
        this.joketitle = joketitle == null ? null : joketitle.trim();
    }

    public Date getJoketime() {
        return joketime;
    }

    public void setJoketime(Date joketime) {
        this.joketime = joketime;
    }

    public String getJokecontent() {
        return jokecontent;
    }

    public void setJokecontent(String jokecontent) {
        this.jokecontent = jokecontent == null ? null : jokecontent.trim();
    }

    public Integer getTypeid() {
        return typeid;
    }

    public void setTypeid(Integer typeid) {
        this.typeid = typeid;
    }

    public Integer getAdminid() {
        return adminid;
    }

    public void setAdminid(Integer adminid) {
        this.adminid = adminid;
    }

    public Integer getJokeyn() {
        return jokeyn;
    }

    public void setJokeyn(Integer jokeyn) {
        this.jokeyn = jokeyn;
    }

}