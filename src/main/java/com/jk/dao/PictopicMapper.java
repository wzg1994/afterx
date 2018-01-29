package com.jk.dao;

import com.jk.pojo.Pictopic;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PictopicMapper {
    int deleteByPrimaryKey(Integer pictopicid);

    int insert(Pictopic record);

    int insertSelective(Pictopic record);

    Pictopic selectByPrimaryKey(Integer pictopicid);

    int updateByPrimaryKeySelective(Pictopic record);

    int updateByPrimaryKey(Pictopic record);

    long querytotoPictopictotal(Pictopic pictopic);

    List<Pictopic> querytotoPictopiclist(@Param("st")Integer start, @Param("rows")int rows, @Param("pictopic")Pictopic pictopic);

    int todeletetotoPictopic1(int pictopicid);

    int todeletetotoPictopic2(String s);
}