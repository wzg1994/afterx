package com.jk.dao;

import com.jk.pojo.Bohui;

public interface BohuiMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Bohui record);

    int insertSelective(Bohui record);

    Bohui selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Bohui record);

    int updateByPrimaryKey(Bohui record);
}