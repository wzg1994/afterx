package com.jk.pojo;

public class Gift {
    private Integer giftid;

    private String giftname;

    private Integer giftprice;

    private Integer giftcount;

    private String giftimg;

    public String getGiftimg() {
        return giftimg;
    }

    public void setGiftimg(String giftimg) {
        this.giftimg = giftimg;
    }

    public Integer getGiftid() {
        return giftid;
    }

    public void setGiftid(Integer giftid) {
        this.giftid = giftid;
    }

    public String getGiftname() {
        return giftname;
    }

    public void setGiftname(String giftname) {
        this.giftname = giftname == null ? null : giftname.trim();
    }

    public Integer getGiftprice() {
        return giftprice;
    }

    public void setGiftprice(Integer giftprice) {
        this.giftprice = giftprice;
    }

    public Integer getGiftcount() {
        return giftcount;
    }

    public void setGiftcount(Integer giftcount) {
        this.giftcount = giftcount;
    }
}