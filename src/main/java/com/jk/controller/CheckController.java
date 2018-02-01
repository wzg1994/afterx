package com.jk.controller;

import com.jk.pojo.Joketopic;
import com.jk.pojo.Pictopic;
import com.jk.pojo.Topic;
import com.jk.pojo.Voicetopic;
import com.jk.service.CheckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
@EnableAutoConfiguration
public class CheckController {
    @Autowired
    private CheckService checkService;


    @RequestMapping("queryTop")
    @ResponseBody
    public Object queryTop(int page,int rows,Topic topic,String jueseid){
        Map<String, Object> map = checkService.queryTop(page,rows,topic,jueseid);
        return map;
    }
    @RequestMapping("queryPic")
    @ResponseBody
    public Object queryPic(int page,int rows,Pictopic pictopic ,String jueseid){
        Map<String, Object> map = checkService.queryPic(page,rows,pictopic,jueseid);
        return map;
    }

    @RequestMapping("queryVoip")
    @ResponseBody
    public Object queryVoip(int page,int rows,Voicetopic voicetopic ,String jueseid){
        Map<String, Object> map = checkService.queryVoip(page,rows,voicetopic ,jueseid);
        return map;
}
    @RequestMapping("queryJokp")
    @ResponseBody
    public Object queryJokp(int page,int rows,Joketopic joketopic,String jueseid){
        Map<String, Object> map = checkService.queryJokp(page,rows,joketopic,jueseid);
        return map;
    }
    @RequestMapping("upartYn")
    @ResponseBody
    public String upartYn(Topic topic,String jueseid){
        checkService.upartYn(topic,jueseid);
        return "1";
    }
    @RequestMapping("upartYn2")
    @ResponseBody
    public String upartYn2(Topic topic){
        checkService.upartYn2(topic);
        return "1";
    }
    @RequestMapping("updatePitop")
    @ResponseBody
    public String updatePitop(String topicid){
        checkService.updatePitop(topicid);
        return "1";
    }
    @RequestMapping("uppicYn")
    @ResponseBody
    public String uppicYn(Pictopic pictopic,String jueseid){
        checkService.uppicYn(pictopic,jueseid);
        return "1";
    }
    @RequestMapping("uppicYn2")
    @ResponseBody
    public String uppicYn2(Pictopic pictopic){
        checkService.uppicYn2(pictopic);
        return "1";
    }
    @RequestMapping("updatePipic")
    @ResponseBody
    public String updatePipic(String pictopicid){
        checkService.updatePipic(pictopicid);
        return "1";
    }
    @RequestMapping("upvoipYn")
    @ResponseBody
    public String upvoipYn(Voicetopic voicetopic,String jueseid){
        checkService.upvoipYn(voicetopic,jueseid);
        return "1";
    }
    @RequestMapping("upvoipYn2")
    @ResponseBody
    public String upvoipYn2(Voicetopic voicetopic){
        checkService.upvoipYn2(voicetopic);
        return "1";
    }
    @RequestMapping("updatePivoip")
    @ResponseBody
    public String updatePivoip(String voiceid){
        checkService.updatePivoip(voiceid);
        return "1";
    }
    @RequestMapping("upjokYn")
    @ResponseBody
    public String upjokYn(Joketopic joketopic,String jueseid){
        checkService.upjokYn(joketopic,jueseid);
        return "1";
    }
    @RequestMapping("upjokYn2")
    @ResponseBody
    public String upjokYn2(Joketopic joketopic){
        checkService.upjokYn2(joketopic);
        return "1";
    }
    @RequestMapping("updatePijok")
    @ResponseBody
    public String updatePijok(String jokeid){
        checkService.updatePijok(jokeid);
        return "1";
    }
    @RequestMapping("tochecktop")
    public String tochecktop(){return "/check/checktopic"; }
    @RequestMapping("tocheckpictop")
    public String tocheckpictop(){return "/check/checkpictop"; }
    @RequestMapping("tocheckvoipic")
    public String tocheckvoipic(){return "/check/checkvoipic"; }
    @RequestMapping("tocheckjokepic")
    public String tocheckjokepic(){return "/check/checkjokepic"; }
}
