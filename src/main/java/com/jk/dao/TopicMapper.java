package com.jk.dao;

import com.jk.pojo.Topic;

public interface TopicMapper {
    int deleteByPrimaryKey(Integer topicid);

    int insert(Topic record);

    int insertSelective(Topic record);

    Topic selectByPrimaryKey(Integer topicid);

    int updateByPrimaryKeySelective(Topic record);

    int updateByPrimaryKey(Topic record);
}