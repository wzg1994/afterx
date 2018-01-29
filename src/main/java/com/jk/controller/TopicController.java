package com.jk.controller;

import com.alibaba.fastjson.JSONObject;
import com.jk.pojo.Topic;
import com.jk.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
@EnableAutoConfiguration
public class TopicController {

    @Autowired
    private TopicService topicService;

    @RequestMapping("/wzjtotopic1")
    public String wzjtotopic1() {
        return "/toarticle/wzjtotopic1";
    }
    @RequestMapping("/wzjtotopic")
    public String wzjtotopic() {
        return "/toarticle/wzjtotopic";
    }
    @RequestMapping("/wzjtotopic2")
    public String wzjtotopic2() {
        return "/toarticle/wzjtotopic2";
    }


    @RequestMapping("/querywzjtotopic")
    @ResponseBody
    public Object querywzjtotopic(Integer page,Integer rows,Topic topic) {
        JSONObject json = topicService.querywzjtotopic(page,rows,topic);
        return json;
    }

    @RequestMapping("/todeletetotopic1")
    @ResponseBody
    public Object todeletetotopic1(int topicid) {
        int i =topicService.todeletetotopic1(topicid);
        return i;
    }

    @RequestMapping("/toaddtotopic")
    public String toaddtotopic() {
        return "/toarticle/toaddtotopic";
    }

    @RequestMapping("/addtotopic")
    @ResponseBody
    public Object addtotopic(Topic topic) {
        topic.setTopicyn(2);
        int i = topicService.addtotopic(topic);
        return i;
    }

    @RequestMapping("/todeletetotopic2")
    @ResponseBody
    public Object todeletetotopic2(String ids) {
        int t=0;
        String[] split = ids.split(",");
        for (int i = 0; i < split.length; i++) {
            t = topicService.todeletetotopic2(split[i]);
        }
        return t;
    }

    @RequestMapping("/toupdatetotopic")
    public String toupdatetotopic(Topic topic, HttpServletRequest request) {
        topic=topicService.toupdatetotopic(topic.getTopicid());
        request.setAttribute("topi",topic);
        return "/toarticle/toupdatetotopic";
    }

    @RequestMapping("/updatetotopic")
    @ResponseBody
    public Object updatetotopic(Topic topic) {
        int i = topicService.updatetotopic(topic);
        return i;
    }
}
