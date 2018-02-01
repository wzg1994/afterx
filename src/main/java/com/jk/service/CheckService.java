package com.jk.service;

import com.jk.pojo.Joketopic;
import com.jk.pojo.Pictopic;
import com.jk.pojo.Topic;
import com.jk.pojo.Voicetopic;

import java.util.Map;

public interface CheckService {
    Map<String,Object> queryTop(int page, int rows, Topic topic, String jueseid);

    void upartYn(Topic topic, String jueseid);

    void upartYn2(Topic topic);

    void updatePitop(String topicid);

    Map<String,Object> queryPic(int page, int rows, Pictopic pictopic, String jueseid);

    void uppicYn2(Pictopic pictopic);

    void updatePipic(String pictopicid);
    
    void upvoipYn(Voicetopic voicetopic, String jueseid);

    void upvoipYn2(Voicetopic voicetopic);

    void updatePivoip(String voiceid);
    
    void upjokYn2(Joketopic joketopic);

    void updatePijok(String jokeid);

    Map<String,Object> queryJokp(int page, int rows, Joketopic joketopic, String jueseid);

    void uppicYn(Pictopic pictopic, String jueseid);

    Map<String,Object> queryVoip(int page, int rows, Voicetopic voicetopic, String jueseid);

    void upjokYn(Joketopic joketopic, String jueseid);
}
