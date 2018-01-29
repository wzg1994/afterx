package com.jk.service.Impl;

import com.alibaba.fastjson.JSONObject;
import com.jk.dao.AdvertisingMapper;
import com.jk.pojo.Advertising;
import com.jk.service.AdvertisingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdvertisingServiceImpl implements AdvertisingService {

    @Autowired
    private AdvertisingMapper advertisingMapper;

    @Override
    public JSONObject queryAdvertising(int page, int rows, Advertising advertising) {
        long total = advertisingMapper.queryAdvertisingtotal(advertising);
        int start = (page-1)*rows;
        List<Advertising> list = advertisingMapper.queryAdvertisinglist(start,rows,advertising);
        JSONObject json = new JSONObject();
        json.put("total", total);
        json.put("rows", list);
        return json;
    }

    @Override
    public int todeleteAdvertising1(int advertisingid) {
        return advertisingMapper.todeleteAdvertising1(advertisingid);
    }

    @Override
    public int todeleteAdvertising2(String s) {
        return advertisingMapper.todeleteAdvertising2(s);
    }

    @Override
    public int addAdvertising(Advertising advertising) {
        return advertisingMapper.addAdvertising(advertising);
    }

    @Override
    public Advertising toupdateAdvertising(int advertisingid) {
        return advertisingMapper.toupdateAdvertising(advertisingid);
    }

    @Override
    public int updateAdvertising(Advertising advertising) {
        return advertisingMapper.updateAdvertising(advertising);
    }

    @Override
    public int updatetoxiajia(int advertisingid) {
        return advertisingMapper.updatetoxiajia(advertisingid);
    }

    @Override
    public int updatetofabu(int advertisingid) {
        return advertisingMapper.updatetofabu(advertisingid);
    }
}
