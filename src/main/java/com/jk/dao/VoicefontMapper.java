package com.jk.dao;

import com.jk.pojo.Voicefont;

public interface VoicefontMapper {
    int deleteByPrimaryKey(Integer wenziid);

    int insert(Voicefont record);

    int insertSelective(Voicefont record);

    Voicefont selectByPrimaryKey(Integer wenziid);

    int updateByPrimaryKeySelective(Voicefont record);

    int updateByPrimaryKey(Voicefont record);
}