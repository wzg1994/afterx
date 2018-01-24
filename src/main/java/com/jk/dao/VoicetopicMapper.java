package com.jk.dao;

import com.jk.pojo.Voicetopic;

public interface VoicetopicMapper {
    int deleteByPrimaryKey(Integer voiceid);

    int insert(Voicetopic record);

    int insertSelective(Voicetopic record);

    Voicetopic selectByPrimaryKey(Integer voiceid);

    int updateByPrimaryKeySelective(Voicetopic record);

    int updateByPrimaryKey(Voicetopic record);
}