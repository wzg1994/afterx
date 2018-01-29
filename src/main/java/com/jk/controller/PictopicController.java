package com.jk.controller;

import com.alibaba.fastjson.JSONObject;
import com.jk.pojo.Pictopic;
import com.jk.service.PictopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration
public class PictopicController {

    @Autowired
    private PictopicService pictopicService;

    @RequestMapping("/totoPictopic")
    public String totoPictopic() {
        return "/toarticle/totoPictopic";
    }

    @RequestMapping("/querytotoPictopic")
    @ResponseBody
    public Object querytotoPictopic(int page,int rows,Pictopic pictopic) {
        JSONObject json = pictopicService.querytotoPictopic(page,rows,pictopic);
        return json;
    }

    @RequestMapping("/todeletetotoPictopic1")
    @ResponseBody
    public Object todeletetotoPictopic1(int pictopicid) {
        int n = pictopicService.todeletetotoPictopic1(pictopicid);
        return n;
    }

    @RequestMapping("/todeletetotoPictopic2")
    @ResponseBody
    public Object todeletetotoPictopic2(String ids) {
        int a=0;
        String[] split = ids.split(",");
        for (int i = 0; i < split.length; i++) {
            a=pictopicService.todeletetotoPictopic2(split[i]);
        }
        return a;
    }
}
