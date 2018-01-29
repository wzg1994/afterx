package com.jk.dao;

import com.jk.pojo.*;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface JoketopicMapper {
    int deleteByPrimaryKey(Integer jokeid);

    int insert(Joketopic record);

    int insertSelective(Joketopic record);

    Joketopic selectByPrimaryKey(Integer jokeid);

    int updateByPrimaryKeySelective(Joketopic record);

    int updateByPrimaryKey(Joketopic record);

    long quejokecount(Joketopic joke);

    List<Joketopic> queryjoke(@Param("start") int start, @Param("rows") int rows, @Param("joke") Joketopic joke);

    List<Joketopic> toaddjoke();

    void addjoke(Joketopic joke);

    void deljoke(String ss);

    List<Joketopic> quejoke(Joketopic joke);

    long quecommcount(Jokecomment mment);

    List<Jokecomment> queryck(@Param("start") int start, @Param("rows") int rows, @Param("mment") Jokecomment mment);

    void addimg(Photo ph);

    long queimgscount(Picgroup pic);

    List<Picgroup> queimgs(@Param("start") int start, @Param("rows") int rows, @Param("pic") Picgroup pic);

    List<Photo> selectimgs(@Param("ss") String ss);

    void upimg(Picgroup pic);

    long quehtscount(Pictopic pictopic);

    List<Pictopic> queht(@Param("start") int start, @Param("rows") int rows, @Param("pictopic") Pictopic pictopic);

    List<Menu> quem();

    List<Picgroup> quep();

    void addht(Pictopic p);

    long quecntcount(Pictopiccomment cnt);

    List<Pictopic> quecnt(@Param("start") int start, @Param("rows") int rows, @Param("cnt") Pictopiccomment cnt);

    void delht(String ss);

    List<Photo> queh();

    void addtpz(Picgroup gr);

    void delimg(String ss);
}