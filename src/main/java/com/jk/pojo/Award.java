package com.jk.pojo;

import java.util.Date;

public class Award {
    private Integer awardid;

    private Date time;

    private Integer awardmoney;

    private Integer awardbecause;

    private Integer article;

    public Integer getAwardid() {
        return awardid;
    }

    public void setAwardid(Integer awardid) {
        this.awardid = awardid;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Integer getAwardmoney() {
        return awardmoney;
    }

    public void setAwardmoney(Integer awardmoney) {
        this.awardmoney = awardmoney;
    }

    public Integer getAwardbecause() {
        return awardbecause;
    }

    public void setAwardbecause(Integer awardbecause) {
        this.awardbecause = awardbecause;
    }

    public Integer getArticle() {
        return article;
    }

    public void setArticle(Integer article) {
        this.article = article;
    }
}