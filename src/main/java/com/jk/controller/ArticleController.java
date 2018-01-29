package com.jk.controller;

import com.alibaba.fastjson.JSONObject;
import com.jk.pojo.Article;
import com.jk.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    @RequestMapping("/totoarticle")
    public String totoarticle() {
        return "/toarticle/totoarticle";
    }

    @RequestMapping("/querytoarticle")
    @ResponseBody
    public Object querytoarticle(Integer page, Integer rows,Article article) {
        JSONObject json = articleService.querytoarticle(page,rows,article);
        return json;
    }

    @RequestMapping("/todeletetoarticle1")
    @ResponseBody
    public Object todeletetoarticle1(int articleid) {
        int i = articleService.todeletetoarticle1(articleid);
        return i;
    }

    @RequestMapping("/todeletetoarticle2")
    @ResponseBody
    public Object todeletetoarticle2(String ids) {
        int a=0;
        String[] split = ids.split(",");
        for (int i = 0; i < split.length; i++) {
            a=articleService.todeletetoarticle2(split[i]);
        }
        return a;
    }
}
