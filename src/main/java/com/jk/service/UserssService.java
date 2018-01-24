package com.jk.service;

import com.alibaba.fastjson.JSONObject;
import com.jk.pojo.Employee;
import com.jk.pojo.User;
import com.jk.pojo.Zhubo;

import javax.servlet.http.HttpSession;

public interface UserssService {


    JSONObject queryUser(int page, int rows, User user);

    JSONObject queryZhuBo(int page, int rows, Zhubo zhubo);

    int addZhubo(Zhubo zhubo);

    String loginUser(Employee employee, HttpSession a);

  /*  String loginUser(Employee employee, HttpSession a);*/


}


