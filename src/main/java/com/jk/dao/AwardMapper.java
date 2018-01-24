package com.jk.dao;

import com.jk.pojo.Award;

public interface AwardMapper {
    int deleteByPrimaryKey(Integer awardid);

    int insert(Award record);

    int insertSelective(Award record);

    Award selectByPrimaryKey(Integer awardid);

    int updateByPrimaryKeySelective(Award record);

    int updateByPrimaryKey(Award record);
}