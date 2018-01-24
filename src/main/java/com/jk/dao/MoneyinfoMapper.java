package com.jk.dao;

import com.jk.pojo.Moneyinfo;

public interface MoneyinfoMapper {
    int deleteByPrimaryKey(Integer moneyid);

    int insert(Moneyinfo record);

    int insertSelective(Moneyinfo record);

    Moneyinfo selectByPrimaryKey(Integer moneyid);

    int updateByPrimaryKeySelective(Moneyinfo record);

    int updateByPrimaryKey(Moneyinfo record);
}