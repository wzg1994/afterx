package com.jk.service;

import com.alibaba.fastjson.JSONObject;
import com.jk.pojo.Topic;

public interface TopicService {
    JSONObject querywzjtotopic(Integer page, Integer rows, Topic topic);

    int todeletetotopic1(int topicid);

    int addtotopic(Topic topic);

    int todeletetotopic2(String s);

    Topic toupdatetotopic(Integer topicid);

    int updatetotopic(Topic topic);
}
