package com.jk.service.Impl;

import com.alibaba.fastjson.JSONObject;
import com.jk.dao.TopicMapper;
import com.jk.pojo.Topic;
import com.jk.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TopicServiceImpl implements TopicService {
    @Autowired
    private TopicMapper topicMapper;


    @Override
    public JSONObject querywzjtotopic(Integer page, Integer rows, Topic topic) {
        long total = topicMapper.querywzjtotopictotal(topic);
        Integer start = (page-1)*rows;
        List<Topic> list = topicMapper.querywzjtotopic(start,rows,topic);
        JSONObject json = new JSONObject();
        json.put("total", total);
        json.put("rows", list);
        return json;
    }

    @Override
    public int todeletetotopic1(int topicid) {
        return topicMapper.todeletetotopic1(topicid);
    }

    @Override
    public int addtotopic(Topic topic) {
        return topicMapper.addtotopic(topic);
    }

    @Override
    public int todeletetotopic2(String s) {
        return topicMapper.todeletetotopic2(s);
    }

    @Override
    public Topic toupdatetotopic(Integer topicid) {
        return topicMapper.toupdatetotopic(topicid);
    }

    @Override
    public int updatetotopic(Topic topic) {
        return topicMapper.updatetotopic(topic);
    }
}
