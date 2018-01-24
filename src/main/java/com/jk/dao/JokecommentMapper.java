package com.jk.dao;

import com.jk.pojo.Jokecomment;

public interface JokecommentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Jokecomment record);

    int insertSelective(Jokecomment record);

    Jokecomment selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Jokecomment record);

    int updateByPrimaryKey(Jokecomment record);
}