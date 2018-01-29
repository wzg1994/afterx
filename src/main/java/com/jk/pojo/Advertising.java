package com.jk.pojo;

public class Advertising {
    private Integer advertisingid;

    private String advertisingtitle;

    private String advertisingcontent;

    private String advertisingimg;

    private Integer advertisingcyn;

    public Integer getAdvertisingid() {
        return advertisingid;
    }

    public void setAdvertisingid(Integer advertisingid) {
        this.advertisingid = advertisingid;
    }

    public String getAdvertisingtitle() {
        return advertisingtitle;
    }

    public void setAdvertisingtitle(String advertisingtitle) {
        this.advertisingtitle = advertisingtitle == null ? null : advertisingtitle.trim();
    }

    public String getAdvertisingcontent() {
        return advertisingcontent;
    }

    public void setAdvertisingcontent(String advertisingcontent) {
        this.advertisingcontent = advertisingcontent == null ? null : advertisingcontent.trim();
    }

    public String getAdvertisingimg() {
        return advertisingimg;
    }

    public void setAdvertisingimg(String advertisingimg) {
        this.advertisingimg = advertisingimg == null ? null : advertisingimg.trim();
    }

    public Integer getAdvertisingcyn() {
        return advertisingcyn;
    }

    public void setAdvertisingcyn(Integer advertisingcyn) {
        this.advertisingcyn = advertisingcyn;
    }
}