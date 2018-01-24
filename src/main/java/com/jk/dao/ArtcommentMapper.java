package com.jk.dao;

import com.jk.pojo.Artcomment;

public interface ArtcommentMapper {
    int deleteByPrimaryKey(Integer artcommentid);

    int insert(Artcomment record);

    int insertSelective(Artcomment record);

    Artcomment selectByPrimaryKey(Integer artcommentid);

    int updateByPrimaryKeySelective(Artcomment record);

    int updateByPrimaryKey(Artcomment record);
}