package com.jk.dao;

import com.jk.pojo.Photo;

public interface PhotoMapper {
    int deleteByPrimaryKey(Integer photoid);

    int insert(Photo record);

    int insertSelective(Photo record);

    Photo selectByPrimaryKey(Integer photoid);

    int updateByPrimaryKeySelective(Photo record);

    int updateByPrimaryKey(Photo record);
}