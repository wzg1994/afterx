package com.jk.dao;

import com.jk.pojo.Joketopic;
import com.jk.pojo.Pictopic;
import com.jk.pojo.Topic;
import com.jk.pojo.Voicetopic;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CheckMapper {
    long queryTopCount(Topic topic);

    List<Topic> queryTopPage(@Param("st") int start, @Param("rows") int rows, @Param("top") Topic topic);

    void upartYn(Topic topic);

    void upartYn2(Topic topic);

    void updatePitop(@Param("tid") String topicid);

    long queryPicCount(Pictopic pictopic);

    List<Pictopic> queryPicPage(@Param("st") int start, @Param("rows") int rows, @Param("pic") Pictopic pictopic);

    void uppicYn(Pictopic pictopic);

    void uppicYn2(Pictopic pictopic);

    void updatePipic(@Param("pictid") String pictopicid);

    long queryVoipCount(Voicetopic voicetopic);

    List<Voicetopic> queryVoidPage(@Param("st") int start, @Param("rows") int rows, @Param("voip") Voicetopic voicetopic);

    void upvoipYn(Voicetopic voicetopic);

    void upvoipYn2(Voicetopic voicetopic);

    void updatePivoip(@Param("voicid") String voiceid);

    void upjokYn(Joketopic joketopic);

    void upjokYn2(Joketopic joketopic);

    void updatePijok(@Param("jid") String jokeid);

    long queryJokpCount(Joketopic joketopic);

    List<Joketopic> queryJokpPage(@Param("st") int start, @Param("rows") int rows, @Param("jokp") Joketopic joketopic);

    void upartYn22(Topic topic);

    long queryTopCount2(Topic topic);

    List<Topic> queryTopPage2(@Param("st") int start2, @Param("rows") int rows, @Param("top") Topic topic);

    void uppicYn22(Pictopic pictopic);

    long queryPicCount1(Pictopic pictopic);

    List<Pictopic> queryPicPage1(@Param("st")int start1,@Param("rows") int rows,@Param("pic") Pictopic pictopic);

    void upvoipYn22(Voicetopic voicetopic);

    long queryVoipCount3(Voicetopic voicetopic);

    List<Voicetopic> queryVoidPage3(@Param("st") int start3, @Param("rows") int rows, @Param("voip") Voicetopic voicetopic);

    void upjokYn22(Joketopic joketopic);

    long queryJokpCount2(Joketopic joketopic);

    List<Joketopic> queryJokpPage2(@Param("st") int start, @Param("rows") int rows, @Param("jokp") Joketopic joketopic);

}
