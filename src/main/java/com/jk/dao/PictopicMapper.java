package com.jk.dao;

import com.jk.pojo.Pictopic;

public interface PictopicMapper {
    int deleteByPrimaryKey(Integer pictopicid);

    int insert(Pictopic record);

    int insertSelective(Pictopic record);

    Pictopic selectByPrimaryKey(Integer pictopicid);

    int updateByPrimaryKeySelective(Pictopic record);

    int updateByPrimaryKey(Pictopic record);
}