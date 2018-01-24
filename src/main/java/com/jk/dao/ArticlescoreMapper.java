package com.jk.dao;

import com.jk.pojo.Articlescore;

public interface ArticlescoreMapper {
    int deleteByPrimaryKey(Integer articlescoreid);

    int insert(Articlescore record);

    int insertSelective(Articlescore record);

    Articlescore selectByPrimaryKey(Integer articlescoreid);

    int updateByPrimaryKeySelective(Articlescore record);

    int updateByPrimaryKey(Articlescore record);
}