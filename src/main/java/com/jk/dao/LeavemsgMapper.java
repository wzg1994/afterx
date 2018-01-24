package com.jk.dao;

import com.jk.pojo.Leavemsg;

public interface LeavemsgMapper {
    int deleteByPrimaryKey(Integer leavemsgid);

    int insert(Leavemsg record);

    int insertSelective(Leavemsg record);

    Leavemsg selectByPrimaryKey(Integer leavemsgid);

    int updateByPrimaryKeySelective(Leavemsg record);

    int updateByPrimaryKey(Leavemsg record);
}