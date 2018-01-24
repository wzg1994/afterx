package com.jk.dao;

import com.jk.pojo.Jobinfo;

public interface JobinfoMapper {
    int deleteByPrimaryKey(Integer jobid);

    int insert(Jobinfo record);

    int insertSelective(Jobinfo record);

    Jobinfo selectByPrimaryKey(Integer jobid);

    int updateByPrimaryKeySelective(Jobinfo record);

    int updateByPrimaryKey(Jobinfo record);
}