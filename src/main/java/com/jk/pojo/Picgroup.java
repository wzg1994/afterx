package com.jk.pojo;

public class Picgroup {
    private Integer picgroupid;

    private String picid;

    private String groupname;

    private Integer grouptype;

    private String imgid;

    public String getPhotourl() {
        return photourl;
    }

    public void setPhotourl(String photourl) {
        this.photourl = photourl;
    }

    private String photourl;

    public Integer getPicgroupid() {
        return picgroupid;
    }

    public void setPicgroupid(Integer picgroupid) {
        this.picgroupid = picgroupid;
    }

    public String getPicid() {
        return picid;
    }

    public void setPicid(String picid) {
        this.picid = picid == null ? null : picid.trim();
    }

    public String getGroupname() {
        return groupname;
    }

    public void setGroupname(String groupname) {
        this.groupname = groupname == null ? null : groupname.trim();
    }

    public Integer getGrouptype() {
        return grouptype;
    }

    public void setGrouptype(Integer grouptype) {
        this.grouptype = grouptype;
    }

    public String getImgid() {
        return imgid;
    }

    public void setImgid(String imgid) {
        this.imgid = imgid == null ? null : imgid.trim();
    }
}