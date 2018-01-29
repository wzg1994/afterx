package com.jk.service.Impl;

import com.alibaba.fastjson.JSONObject;
import com.jk.dao.JoketopicMapper;
import com.jk.pojo.*;
import com.jk.service.JokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JokeServiceImpl implements JokeService {
   @Autowired
    private JoketopicMapper joketopicMapper;


    @Override
    public JSONObject queryjoke(int page, int rows, Joketopic joke) {
        long count=joketopicMapper.quejokecount(joke);
        int start=(page-1)*rows;
        List<Joketopic> list=joketopicMapper.queryjoke(start,rows,joke);
        JSONObject json=new JSONObject();
        json.put("total", count);
        json.put("rows", list);
        return json;
    }

    @Override
    public List<Joketopic> toaddjoke() {

        return joketopicMapper.toaddjoke();
    }

    @Override
    public void addjoke(Joketopic joke) {
        joketopicMapper.addjoke(joke);
    }

    @Override
    public int deljoke(String ss) {
        joketopicMapper.deljoke(ss);
        return 0;
    }

    @Override
    public List<Joketopic> quejoke(Joketopic joke) {
        return joketopicMapper.quejoke(joke);
    }

    @Override
    public JSONObject queryck(int page, int rows, Jokecomment mment) {
        long count=joketopicMapper.quecommcount(mment);
        int start=(page-1)*rows;
        List<Jokecomment> list=joketopicMapper.queryck(start,rows,mment);
        JSONObject json=new JSONObject();
        json.put("total", count);
        json.put("rows", list);
        return json;
    }

    @Override
    public void addimg(Photo ph) {
        joketopicMapper.addimg(ph);
    }

    @Override
    public JSONObject queimgs(int page, int rows, Picgroup pic) {
        long count=joketopicMapper.queimgscount(pic);
        int start=(page-1)*rows;
        List<Picgroup> list=joketopicMapper.queimgs(start,rows,pic);
        JSONObject json=new JSONObject();
        json.put("total", count);
        json.put("rows", list);
        return json;
    }

    @Override
    public List<Photo> selectimgs(String ss) {

        return joketopicMapper.selectimgs(ss);
    }

    @Override
    public void upimg(Picgroup pic) {
        joketopicMapper.upimg(pic);
    }

    @Override
    public JSONObject queht(int page, int rows, Pictopic pictopic) {
        long count=joketopicMapper.quehtscount(pictopic);
        int start=(page-1)*rows;
        List<Pictopic> list=joketopicMapper.queht(start,rows,pictopic);
        JSONObject json=new JSONObject();
        json.put("total", count);
        json.put("rows", list);
        return json;
    }

    @Override
    public List<Menu> quem() {

        return joketopicMapper.quem();
    }

    @Override
    public List<Picgroup> quep() {

        return joketopicMapper.quep();
    }

    @Override
    public void addht(Pictopic p) {
        joketopicMapper.addht(p);
    }

    @Override
    public JSONObject quecnt(int page, int rows, Pictopiccomment cnt) {
        long count=joketopicMapper.quecntcount(cnt);
        int start=(page-1)*rows;
        List<Pictopic> list=joketopicMapper.quecnt(start,rows,cnt);
        JSONObject json=new JSONObject();
        json.put("total", count);
        json.put("rows", list);
        return json;
    }

    @Override
    public int delht(String ss) {
        joketopicMapper.delht(ss);
        return 0;
    }

    @Override
    public List<Photo> queh() {

        return joketopicMapper.queh();
    }

    @Override
    public void addtpz(Picgroup gr) {
        joketopicMapper.addtpz(gr);
    }

    @Override
    public int delimg(String ss) {
        joketopicMapper.delimg(ss);
        return 0;
    }


}



