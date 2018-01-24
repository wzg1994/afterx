package com.jk.pojo;

import java.util.Date;

public class Joketopic {
    private Integer jokeid;

    private String joketitle;

    private Date joketime;

    private String jokecontent;

    private Integer typeid;

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