package com.jk.service;

import com.jk.pojo.User;

import java.util.Map;

public interface ScoreService {
    Map<String,Object> queryScore(int page, int rows, User user);

    void addScore(String userid, int uscount);
}
