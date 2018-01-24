package com.jk.service.Impl;


import com.jk.dao.ScoreMapper;
import com.jk.pojo.User;
import com.jk.service.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ScoreServiceImpl implements ScoreService {
    @Autowired
    private ScoreMapper scoreMapper;

    @Override
    public Map<String, Object> queryScore(int page, int rows, User user) {
        //		总条数
        long total = scoreMapper.queryScoreCount(user);
   //		当前页数据
        int start = (page-1)*rows;
        List<User> us = scoreMapper.queryScorePage(start,rows,user);
        Map<String , Object> map = new HashMap<>();
        map.put("total", total);
        map.put("rows", us);
        return map;
    }

    @Override
    public void addScore(String userid, int uscount) {
        scoreMapper.addScore(userid,uscount);
    }
}
