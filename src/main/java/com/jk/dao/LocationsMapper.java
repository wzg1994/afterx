package com.jk.dao;

import com.jk.pojo.Locations;

public interface LocationsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Locations record);

    int insertSelective(Locations record);

    Locations selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Locations record);

    int updateByPrimaryKey(Locations record);
}