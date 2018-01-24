package com.jk.controller;



import com.jk.pojo.User;
import com.jk.service.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import java.util.Map;

@Controller
@EnableAutoConfiguration
public class ScoreController {

    @Autowired
    private ScoreService scoreService;

    @RequestMapping("queryScore")
    @ResponseBody
    public Object queryScore(int page,int rows,User user){
        Map<String, Object> map = scoreService.queryScore(page,rows,user);
        return map;
    }

    @RequestMapping("addScore")
    @ResponseBody
    public String addScore(String userid,int uscount ){
        scoreService.addScore(userid,uscount);
        return "1";
    }

    @RequestMapping("toshowscore")
    public String toshowscore(){return "score/showscore"; }
    @RequestMapping("toadduserscore")
    public String toadduserscore(){return "score/adduserscore"; }
}
