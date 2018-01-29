package com.jk.service;

import com.alibaba.fastjson.JSONObject;
import com.jk.pojo.Advertising;

public interface AdvertisingService {

    JSONObject queryAdvertising(int page, int rows, Advertising advertising);

    int todeleteAdvertising1(int advertisingid);

    int todeleteAdvertising2(String s);

    int addAdvertising(Advertising advertising);

    Advertising toupdateAdvertising(int advertisingid);

    int updateAdvertising(Advertising advertising);

    int updatetoxiajia(int advertisingid);

    int updatetofabu(int advertisingid);
}
