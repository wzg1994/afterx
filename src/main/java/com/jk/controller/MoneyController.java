package com.jk.controller;



import com.jk.pojo.Moneyinfo;

import com.jk.service.MoneyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
@EnableAutoConfiguration
public class MoneyController {
    @Autowired
    private MoneyService moneyService;

    @RequestMapping("queryMoney")
    @ResponseBody
    public Object queryMoney(int page,int rows,Moneyinfo moneyinfo){
        Map<String, Object> map = moneyService.queryMoney(page,rows,moneyinfo);
        return map;
    }
    @RequestMapping("updateMonyn")
    @ResponseBody
    public  String updateMonyn(Moneyinfo moneyinfo){
        moneyService.updateMonyn(moneyinfo);
        return "1";
    }
    @RequestMapping("updateMonyn2")
    @ResponseBody
    public  String updateMonyn2(Moneyinfo moneyinfo){
        moneyService.updateMonyn2(moneyinfo);
        return "1";
    }
    @RequestMapping("toshowusmoney")
    public String toshowusmoney(){
        return "money/showusmoney";
    }

}
