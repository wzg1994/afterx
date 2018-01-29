package com.jk.dao;
import com.jk.pojo.Voice;
import com.jk.pojo.Voicetopic;
import com.jk.pojo.Zhubo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface VoicetopicMapper {
    Long counts(Voicetopic c);

    List<Voicetopic> querySelects(@Param("c")Voicetopic c, @Param("st") int st, @Param("rows") int rows);

    Voicetopic Xiangqings(Integer voiceid);

    List<Zhubo> ZhuboSelect();

    List<Voice> VoiceSelect();

    int addHuatis(Voicetopic c);
}