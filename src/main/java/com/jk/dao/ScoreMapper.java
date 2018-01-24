package com.jk.dao;

import com.jk.pojo.Score;
import com.jk.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ScoreMapper {

    long queryScoreCount(User user);

    List<User> queryScorePage(int start, int rows, User user);

    void addScore(@Param("userid") String userid, @Param("ucount") int uscount);
}