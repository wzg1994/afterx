package com.jk.dao;

import com.jk.pojo.Voice;

public interface VoiceMapper {
    int deleteByPrimaryKey(Integer vid);

    int insert(Voice record);

    int insertSelective(Voice record);

    Voice selectByPrimaryKey(Integer vid);

    int updateByPrimaryKeySelective(Voice record);

    int updateByPrimaryKey(Voice record);
}