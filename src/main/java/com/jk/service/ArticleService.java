package com.jk.service;

import com.alibaba.fastjson.JSONObject;
import com.jk.pojo.Article;

public interface ArticleService {
    JSONObject querytoarticle(Integer page, Integer rows, Article article);

    int todeletetoarticle1(int articleid);

    int todeletetoarticle2(String s);
}
