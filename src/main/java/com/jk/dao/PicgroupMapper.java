package com.jk.dao;

import com.jk.pojo.Picgroup;

public interface PicgroupMapper {
    int deleteByPrimaryKey(Integer picgroupid);

    int insert(Picgroup record);

    int insertSelective(Picgroup record);

    Picgroup selectByPrimaryKey(Integer picgroupid);

    int updateByPrimaryKeySelective(Picgroup record);

    int updateByPrimaryKey(Picgroup record);
}