package com.jk.service.Impl;

import com.alibaba.fastjson.JSONObject;
import com.jk.dao.ArticleMapper;
import com.jk.pojo.Article;
import com.jk.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    private ArticleMapper articleMapper;

    @Override
    public JSONObject querytoarticle(Integer page, Integer rows, Article article) {
        long total = articleMapper.querytoarticletotal(article);
        Integer start = (page-1)*rows;
        List<Article> list = articleMapper.querytoarticlelist(start,rows,article);
        JSONObject json = new JSONObject();
        json.put("total", total);
        json.put("rows", list);
        return json;
    }

    @Override
    public int todeletetoarticle1(int articleid) {
        return articleMapper.todeletetoarticle1(articleid);
    }

    @Override
    public int todeletetoarticle2(String s) {
        return articleMapper.todeletetoarticle2(s);
    }


}
