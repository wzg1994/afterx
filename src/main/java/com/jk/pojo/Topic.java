package com.jk.pojo;

import java.util.Date;

public class Topic {
    private Integer topicid;

    private String topictitle;

    private String topiccontent;

    private Date topicstarttime;

    private Date topicendtime;

    private Integer topicyn;

    public Integer getTopicid() {
        return topicid;
    }

    public void setTopicid(Integer topicid) {
        this.topicid = topicid;
    }

    public String getTopictitle() {
        return topictitle;
    }

    public void setTopictitle(String topictitle) {
        this.topictitle = topictitle == null ? null : topictitle.trim();
    }

    public String getTopiccontent() {
        return topiccontent;
    }

    public void setTopiccontent(String topiccontent) {
        this.topiccontent = topiccontent == null ? null : topiccontent.trim();
    }

    public Date getTopicstarttime() {
        return topicstarttime;
    }

    public void setTopicstarttime(Date topicstarttime) {
        this.topicstarttime = topicstarttime;
    }

    public Date getTopicendtime() {
        return topicendtime;
    }

    public void setTopicendtime(Date topicendtime) {
        this.topicendtime = topicendtime;
    }

    public Integer getTopicyn() {
        return topicyn;
    }

    public void setTopicyn(Integer topicyn) {
        this.topicyn = topicyn;
    }
}