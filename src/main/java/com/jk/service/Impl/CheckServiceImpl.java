package com.jk.service.Impl;

import com.jk.dao.CheckMapper;
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
    public Map<String, Object> queryTop(int page, int rows, Topic topic, String jueseid) {
        Map<String , Object> map = new HashMap<>();
         if (jueseid.equals("1")){
             //		总条数
             long total2 = checkMapper.queryTopCount2(topic);
             //		当前页数据
             int start2 = (page-1)*rows;
             List<Topic> tops2 = checkMapper.queryTopPage2(start2,rows,topic);
             map.put("total", total2);
             map.put("rows", tops2);

         }else if (jueseid.equals("2")){
             //		总条数
             long total = checkMapper.queryTopCount(topic);
             //		当前页数据
             int start = (page-1)*rows;
             List<Topic> tops = checkMapper.queryTopPage(start,rows,topic);
             map.put("total", total);
             map.put("rows", tops);
         }
          return map;
    }

    @Override
    public void upartYn(Topic topic, String jueseid) {
        if (jueseid.equals("1")){
            checkMapper.upartYn22(topic);
        }else if (jueseid.equals("2")){
            checkMapper.upartYn(topic);
        }

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
    public Map<String, Object> queryPic(int page, int rows, Pictopic pictopic, String jueseid) {

        Map<String , Object> map = new HashMap<>();
        if (jueseid.equals("1")){
            //		总条数
            long total1 = checkMapper.queryPicCount1(pictopic);
//		当前页数据
            int start1 = (page-1)*rows;
            List<Pictopic> pics1 = checkMapper.queryPicPage1(start1,rows,pictopic);
            map.put("total", total1);
            map.put("rows", pics1);

        }else if (jueseid.equals("2")){
            //		总条数
            long total = checkMapper.queryPicCount(pictopic);
           //		当前页数据
            int start = (page-1)*rows;
            List<Pictopic> pics = checkMapper.queryPicPage(start,rows,pictopic);
            map.put("total", total);
            map.put("rows", pics);
        }
        return map;

    }
    @Override
    public void uppicYn(Pictopic pictopic, String jueseid) {
        if (jueseid.equals("1")){
            checkMapper.uppicYn22(pictopic);
        }else if (jueseid.equals("2")){
            checkMapper.uppicYn(pictopic);
        }
    }

    @Override
    public Map<String, Object> queryVoip(int page, int rows, Voicetopic voicetopic, String jueseid) {
        Map<String , Object> map = new HashMap<>();
        if (jueseid.equals("1")){
            //		总条数
            long total3 = checkMapper.queryVoipCount3(voicetopic);
//		当前页数据
            int start3 = (page-1)*rows;
            List<Voicetopic> voids3 = checkMapper.queryVoidPage3(start3,rows,voicetopic);
            map.put("total", total3);
            map.put("rows", voids3);

        }else if (jueseid.equals("2")){
            //		总条数
            long total = checkMapper.queryVoipCount(voicetopic);
//		当前页数据
            int start = (page-1)*rows;
            List<Voicetopic> voids = checkMapper.queryVoidPage(start,rows,voicetopic);
            map.put("total", total);
            map.put("rows", voids);
        }
        return map;
    }

    @Override
    public void upjokYn(Joketopic joketopic, String jueseid) {
        if (jueseid.equals("1")){
            checkMapper.upjokYn22(joketopic);
        }else if (jueseid.equals("2")){
            checkMapper.upjokYn(joketopic);
        }
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
    public void upvoipYn(Voicetopic voicetopic, String jueseid) {
        if (jueseid.equals("1")){
            checkMapper.upvoipYn22(voicetopic);
        }else if (jueseid.equals("2")){
            checkMapper.upvoipYn(voicetopic);
        }
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
    public void upjokYn2(Joketopic joketopic) {
        checkMapper.upjokYn2(joketopic);
    }

    @Override
    public void updatePijok(String jokeid) {
        checkMapper.updatePijok(jokeid);
    }

    @Override
    public Map<String, Object> queryJokp(int page, int rows, Joketopic joketopic, String jueseid) {
        Map<String , Object> map = new HashMap<>();
        if (jueseid.equals("1")){
            //		总条数
            long total = checkMapper.queryJokpCount2(joketopic);
           //		当前页数据
            int start = (page-1)*rows;
            List<Joketopic> joks = checkMapper.queryJokpPage2(start,rows,joketopic);
            map.put("total", total);
            map.put("rows", joks);
        }else if (jueseid.equals("2")){
            //		总条数
            long total = checkMapper.queryJokpCount(joketopic);
           //		当前页数据
            int start = (page-1)*rows;
            List<Joketopic> joks = checkMapper.queryJokpPage(start,rows,joketopic);
            map.put("total", total);
            map.put("rows", joks);
        }
        return map;
    }
}
