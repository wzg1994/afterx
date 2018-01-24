package com.jk.service;

import com.jk.pojo.Joketopic;
import com.jk.pojo.Pictopic;
import com.jk.pojo.Topic;
import com.jk.pojo.Voicetopic;

import java.util.Map;

public interface CheckService {
    Map<String,Object> queryTop(int page, int rows, Topic topic);

    void upartYn(Topic topic);

    void upartYn2(Topic topic);

    void updatePitop(String topicid);

    Map<String,Object> queryPic(int page, int rows, Pictopic pictopic);

    void uppicYn(Pictopic pictopic);

    void uppicYn2(Pictopic pictopic);

    void updatePipic(String pictopicid);

    Map<String,Object> queryVoip(int page, int rows, Voicetopic voicetopic);

    void upvoipYn(Voicetopic voicetopic);

    void upvoipYn2(Voicetopic voicetopic);

    void updatePivoip(String voiceid);

    void upjokYn(Joketopic joketopic);

    void upjokYn2(Joketopic joketopic);

    void updatePijok(String jokeid);

    Map<String,Object> queryJokp(int page, int rows, Joketopic joketopic);
}
