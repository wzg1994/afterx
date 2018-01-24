package com.jk.dao;

import com.jk.pojo.Score;

public interface ScoreMapper {
    int deleteByPrimaryKey(Integer scoreid);

    int insert(Score record);

    int insertSelective(Score record);

    Score selectByPrimaryKey(Integer scoreid);

    int updateByPrimaryKeySelective(Score record);

    int updateByPrimaryKey(Score record);
}