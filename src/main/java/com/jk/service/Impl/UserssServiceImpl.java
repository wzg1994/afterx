package com.jk.service.Impl;


import com.alibaba.fastjson.JSONObject;
import com.jk.dao.UserMapper;
import com.jk.pojo.Employee;
import com.jk.pojo.User;
import com.jk.pojo.Zhubo;
import com.jk.service.UserssService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;
import java.util.List;


@Service
public class UserssServiceImpl implements UserssService {


    @Autowired
    private UserMapper userMapper;

    @Override
    public JSONObject queryUser(int page, int rows, User user) {

        long total=userMapper.queryUserCount(user);

        int start = (page-1)*rows;

        List<User> shlist = userMapper.queryUser(start,rows,user);

        JSONObject json = new JSONObject();

        json.put("total", total);

        json.put("rows", shlist);

        return json;
    }

    @Override
    public JSONObject queryZhuBo(int page, int rows, Zhubo zhubo) {

        long total=userMapper.queryZhuBoCount(zhubo);

        int start = (page-1)*rows;


        List<User> shlist = userMapper.queryZhuBo(start,rows,zhubo);

        JSONObject json = new JSONObject();

        json.put("total", total);

        json.put("rows", shlist);

        return json;

    }

    @Override
    public int addZhubo(Zhubo zhubo) {
        return userMapper.addZhubo(zhubo);
    }

    @Override
    public String loginUser(Employee employee, HttpSession a) {
        List<Employee> list=userMapper.loginUser(employee);
        if (list!=null&&list.size()>0) {
            if (list.get(0).getEmployeepass().equals(employee.getEmployeepass())){
                a.setAttribute("User", list.get(0));
                return "Yes";
            }else{
                return "MiNo";
            }
        }
        return "NO";
    }


}
