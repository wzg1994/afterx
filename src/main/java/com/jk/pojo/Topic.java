package com.jk.pojo;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Topic {
    private Integer topicid;

    private String topictitle;

    private String topiccontent;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date topicstarttime;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date topicendtime;

    private Integer topicyn;

    //业务字段
    private String starttime1;
    private String endtime1;

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

    public String getEndtime1() {
        return endtime1;
    }

    public void setEndtime1(String endtime1) {
        this.endtime1 = endtime1;
    }

    public String getStarttime1() {

        return starttime1;
    }

    public void setStarttime1(String starttime1) {
        this.starttime1 = starttime1;
    }
}