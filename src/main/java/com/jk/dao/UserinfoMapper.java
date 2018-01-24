package com.jk.dao;

import com.jk.pojo.Userinfo;

public interface UserinfoMapper {
    int deleteByPrimaryKey(Integer userinfoid);

    int insert(Userinfo record);

    int insertSelective(Userinfo record);

    Userinfo selectByPrimaryKey(Integer userinfoid);

    int updateByPrimaryKeySelective(Userinfo record);

    int updateByPrimaryKey(Userinfo record);
}