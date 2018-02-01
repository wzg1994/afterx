package com.jk.pojo;

public class Employee {
    private Integer employeeid;

    private String employeename;

    private String employeepass;

    //角色
    private Integer jueseid;

    private String juesename;

    public Integer getJueseid() {
        return jueseid;
    }

    public void setJueseid(Integer jueseid) {
        this.jueseid = jueseid;
    }
    public String getJuesename() {
        return juesename;
    }

    public void setJuesename(String juesename) {
        this.juesename = juesename;
    }

    public Integer getEmployeeid() {
        return employeeid;
    }

    public void setEmployeeid(Integer employeeid) {
        this.employeeid = employeeid;
    }

    public String getEmployeename() {
        return employeename;
    }

    public void setEmployeename(String employeename) {
        this.employeename = employeename == null ? null : employeename.trim();
    }

    public String getEmployeepass() {
        return employeepass;
    }

    public void setEmployeepass(String employeepass) {
        this.employeepass = employeepass == null ? null : employeepass.trim();
    }
}