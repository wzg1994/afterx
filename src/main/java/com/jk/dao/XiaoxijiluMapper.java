package com.jk.dao;

import com.jk.pojo.Xiaoxijilu;

public interface XiaoxijiluMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Xiaoxijilu record);

    int insertSelective(Xiaoxijilu record);

    Xiaoxijilu selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Xiaoxijilu record);

    int updateByPrimaryKey(Xiaoxijilu record);
}