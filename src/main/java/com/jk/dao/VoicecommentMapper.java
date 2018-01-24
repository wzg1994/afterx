package com.jk.dao;

import com.jk.pojo.Voicecomment;

public interface VoicecommentMapper {
    int deleteByPrimaryKey(Integer vcommentid);

    int insert(Voicecomment record);

    int insertSelective(Voicecomment record);

    Voicecomment selectByPrimaryKey(Integer vcommentid);

    int updateByPrimaryKeySelective(Voicecomment record);

    int updateByPrimaryKey(Voicecomment record);
}