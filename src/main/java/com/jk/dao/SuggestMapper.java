package com.jk.dao;

import com.jk.pojo.Suggest;

public interface SuggestMapper {
    int deleteByPrimaryKey(Integer suggestid);

    int insert(Suggest record);

    int insertSelective(Suggest record);

    Suggest selectByPrimaryKey(Integer suggestid);

    int updateByPrimaryKeySelective(Suggest record);

    int updateByPrimaryKey(Suggest record);
}