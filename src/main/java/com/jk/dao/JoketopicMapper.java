package com.jk.dao;

import com.jk.pojo.Joketopic;

public interface JoketopicMapper {
    int deleteByPrimaryKey(Integer jokeid);

    int insert(Joketopic record);

    int insertSelective(Joketopic record);

    Joketopic selectByPrimaryKey(Integer jokeid);

    int updateByPrimaryKeySelective(Joketopic record);

    int updateByPrimaryKey(Joketopic record);
}