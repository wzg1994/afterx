package com.jk.dao;

import com.jk.pojo.Jokelike;

public interface JokelikeMapper {
    int deleteByPrimaryKey(Integer jokelikeid);

    int insert(Jokelike record);

    int insertSelective(Jokelike record);

    Jokelike selectByPrimaryKey(Integer jokelikeid);

    int updateByPrimaryKeySelective(Jokelike record);

    int updateByPrimaryKey(Jokelike record);
}