package com.jk.pojo;

public class Jobinfo {
    private Integer jobid;

    private String jobname;

    public Integer getJobid() {
        return jobid;
    }

    public void setJobid(Integer jobid) {
        this.jobid = jobid;
    }

    public String getJobname() {
        return jobname;
    }

    public void setJobname(String jobname) {
        this.jobname = jobname == null ? null : jobname.trim();
    }
}