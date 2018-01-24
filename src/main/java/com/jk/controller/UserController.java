package com.jk.controller;


import com.alibaba.fastjson.JSONObject;
import com.jk.pojo.Employee;
import com.jk.pojo.User;
import com.jk.pojo.Zhubo;
import com.jk.service.UserssService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@Controller
@EnableAutoConfiguration
public class UserController {

    @Autowired
    private UserssService userssService;
//用户展示列表
    @RequestMapping(value = "/ToShow1")
    public String ToShow1(){

        return "/show/ToShow1";
    }
//主播展示页面
    @RequestMapping(value = "/ToShow2")
    public String ToShow2(){

        return "/show/ToShow2";
    }
//主播新增页面
    @RequestMapping(value = "/ToShow3")
    public String ToShow3(){

        return "/show/ToShow3";
    }


    //查询用户管理
    @RequestMapping(value="queryUser")
    @ResponseBody
    public Object queryUser(int page,int rows,User user){
        JSONObject json=userssService.queryUser(page,rows,user);
        return json;
    }
   /* */
   //查询主播
   @RequestMapping(value="queryZhuBo")
   @ResponseBody
   public Object queryZhuBo(int page,int rows,Zhubo zhubo){
       JSONObject json=userssService.queryZhuBo(page,rows,zhubo);
       return json;
   }

   @RequestMapping(value = "/toaddZhubo")
   public String toaddZhubo(){
       return "/show/ToShow4";
   }



    //新增主播
    @RequestMapping(value = "/addZhubo")
    @ResponseBody
    public Object addZhubo(Zhubo zhubo ){
        int a=userssService.addZhubo(zhubo);
        return a;
    }
//登录
    @RequestMapping("/loginUser")
    @ResponseBody
    public Object loginUser(Employee employee, HttpSession a){
        String list=userssService.loginUser(employee,a);
        return list;
    };
}
