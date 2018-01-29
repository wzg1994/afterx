package com.jk.service.Impl;

import com.alibaba.fastjson.JSONObject;
import com.jk.dao.PictopicMapper;
import com.jk.pojo.Pictopic;
import com.jk.service.PictopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PictopicServiceImpl implements PictopicService {

    @Autowired
    private PictopicMapper pictopicMapper;

    @Override
    public JSONObject querytotoPictopic(int page, int rows, Pictopic pictopic) {
        long total = pictopicMapper.querytotoPictopictotal(pictopic);
        Integer start = (page-1)*rows;
        List<Pictopic> list = pictopicMapper.querytotoPictopiclist(start,rows,pictopic);
        JSONObject json = new JSONObject();
        json.put("total", total);
        json.put("rows", list);
        return json;
    }

    @Override
    public int todeletetotoPictopic1(int pictopicid) {
        return pictopicMapper.todeletetotoPictopic1(pictopicid);
    }

    @Override
    public int todeletetotoPictopic2(String s) {
        return pictopicMapper.todeletetotoPictopic2(s);
    }
}
