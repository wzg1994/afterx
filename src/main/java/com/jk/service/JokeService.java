package com.jk.service;

import com.alibaba.fastjson.JSONObject;
import com.jk.pojo.*;

import java.util.List;

public interface JokeService {

    JSONObject queryjoke(int page, int rows, Joketopic joke);

    List<Joketopic> toaddjoke();

    void addjoke(Joketopic joke);

    int deljoke(String ss);


    List<Joketopic> quejoke(Joketopic joke);

    JSONObject queryck(int page, int rows, Jokecomment mment);

    void addimg(Photo ph);

    JSONObject queimgs(int page, int rows, Picgroup pic);


    List<Photo> selectimgs(String ss);

    void upimg(Picgroup pic);

    JSONObject queht(int page, int rows, Pictopic pictopic);

    List<Menu> quem();

    List<Picgroup> quep();

    void addht(Pictopic p);

    JSONObject quecnt(int page, int rows, Pictopiccomment cnt);

    int delht(String ss);

    List<Photo> queh();

    void addtpz(Picgroup gr);

    int delimg(String ss);
}
