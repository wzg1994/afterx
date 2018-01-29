package com.jk.service;

import com.alibaba.fastjson.JSONObject;
import com.jk.pojo.Pictopic;

public interface PictopicService {
    JSONObject querytotoPictopic(int page, int rows, Pictopic pictopic);

    int todeletetotoPictopic1(int pictopicid);

    int todeletetotoPictopic2(String s);
}
