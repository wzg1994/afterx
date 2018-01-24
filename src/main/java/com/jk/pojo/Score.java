package com.jk.pojo;

public class Score {
    private Integer scoreid;//id

    private Integer scorecount;//积分

    private Integer scoreleft;// 剩余积分

    private Integer userid;//用户id

    public Integer getScoreid() {
        return scoreid;
    }

    public void setScoreid(Integer scoreid) {
        this.scoreid = scoreid;
    }

    public Integer getScorecount() {
        return scorecount;
    }

    public void setScorecount(Integer scorecount) {
        this.scorecount = scorecount;
    }

    public Integer getScoreleft() {
        return scoreleft;
    }

    public void setScoreleft(Integer scoreleft) {
        this.scoreleft = scoreleft;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }
}