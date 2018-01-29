package com.jk.dao;

import com.jk.pojo.Advertising;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AdvertisingMapper {
    int deleteByPrimaryKey(Integer advertisingid);

    int insert(Advertising record);

    int insertSelective(Advertising record);

    Advertising selectByPrimaryKey(Integer advertisingid);

    int updateByPrimaryKeySelective(Advertising record);

    int updateByPrimaryKey(Advertising record);

    long queryAdvertisingtotal(Advertising advertising);

    List<Advertising> queryAdvertisinglist(@Param("st")int start, @Param("rows")int rows, @Param("advertising")Advertising advertising);

    int todeleteAdvertising1(int advertisingid);

    int todeleteAdvertising2(String s);

    int addAdvertising(Advertising advertising);

    Advertising toupdateAdvertising(int advertisingid);

    int updateAdvertising(Advertising advertising);

    int updatetoxiajia(int advertisingid);

    int updatetofabu(int advertisingid);
}