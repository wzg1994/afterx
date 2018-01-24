package com.jk.service.Impl;

import com.jk.pojo.Joketopic;
import com.jk.pojo.Pictopic;
import com.jk.pojo.Topic;
import com.jk.pojo.Voicetopic;
import com.jk.service.CheckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class CheckServiceImpl implements CheckService {
    @Autowired
    private CheckMapper checkMapper;
    @Override
    public Map<String, Object> queryTop(int page, int rows, Topic topic) {

//		总条数
        long total = checkMapper.queryTopCount(topic);
//		当前页数据
        int start = (page-1)*rows;
        List<Topic> tops = checkMapper.queryTopPage(start,rows,topic);
        Map<String , Object> map = new HashMap<>();
        map.put("total", total);
        map.put("rows", tops);
        return map;

    }

    @Override
    public void upartYn(Topic topic) {
        checkMapper.upartYn(topic);
    }

    @Override
    public void upartYn2(Topic topic) {
        checkMapper.upartYn2(topic);
    }

    @Override
    public void updatePitop(String topicid) {
        checkMapper.updatePitop(topicid);
    }

    @Override
    public Map<String, Object> queryPic(int page, int rows, Pictopic pictopic) {
        //		总条数
        long total = checkMapper.queryPicCount(pictopic);
//		当前页数据
        int start = (page-1)*rows;
        List<Pictopic> pics = checkMapper.queryPicPage(start,rows,pictopic);
        Map<String , Object> map = new HashMap<>();
        map.put("total", total);
        map.put("rows", pics);
        return map;

    }

    @Override
    public void uppicYn(Pictopic pictopic) {
        checkMapper.uppicYn(pictopic);
    }

    @Override
    public void uppicYn2(Pictopic pictopic) {
        checkMapper.uppicYn2(pictopic);
    }

    @Override
    public void updatePipic(String pictopicid) {
        checkMapper.updatePipic(pictopicid);
    }

    @Override
    public Map<String, Object> queryVoip(int page, int rows, Voicetopic voicetopic) {
        //		总条数
        long total = checkMapper.queryVoipCount(voicetopic);
//		当前页数据
        int start = (page-1)*rows;
        List<Voicetopic> voids = checkMapper.queryVoidPage(start,rows,voicetopic);
        Map<String , Object> map = new HashMap<>();
        map.put("total", total);
        map.put("rows", voids);
        return map;
    }

    @Override
    public void upvoipYn(Voicetopic voicetopic) {
        checkMapper.upvoipYn(voicetopic);
    }

    @Override
    public void upvoipYn2(Voicetopic voicetopic) {
        checkMapper.upvoipYn2(voicetopic);
    }

    @Override
    public void updatePivoip(String voiceid) {
        checkMapper.updatePivoip(voiceid);
    }

    @Override
    public void upjokYn(Joketopic joketopic) {
        checkMapper.upjokYn(joketopic);
    }

    @Override
    public void upjokYn2(Joketopic joketopic) {
        checkMapper.upjokYn2(joketopic);
    }

    @Override
    public void updatePijok(String jokeid) {
        checkMapper.updatePijok(jokeid);
    }

    @Override
    public Map<String, Object> queryJokp(int page, int rows, Joketopic joketopic) {
        //		总条数
        long total = checkMapper.queryJokpCount(joketopic);
//		当前页数据
        int start = (page-1)*rows;
        List<Joketopic> joks = checkMapper.queryJokpPage(start,rows,joketopic);
        Map<String , Object> map = new HashMap<>();
        map.put("total", total);
        map.put("rows", joks);
        return map;
    }
}
