package com.jk.dao;

import com.jk.pojo.Zhubo;

public interface ZhuboMapper {
    int deleteByPrimaryKey(Integer zhuboid);

    int insert(Zhubo record);

    int insertSelective(Zhubo record);

    Zhubo selectByPrimaryKey(Integer zhuboid);

    int updateByPrimaryKeySelective(Zhubo record);

    int updateByPrimaryKey(Zhubo record);
}