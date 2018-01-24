package com.jk.dao;

import com.jk.pojo.Pictopiccomment;

public interface PictopiccommentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Pictopiccomment record);

    int insertSelective(Pictopiccomment record);

    Pictopiccomment selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Pictopiccomment record);

    int updateByPrimaryKey(Pictopiccomment record);
}