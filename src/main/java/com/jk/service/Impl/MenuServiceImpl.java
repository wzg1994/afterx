package com.jk.service.Impl;

import com.alibaba.fastjson.JSONObject;
import com.jk.pojo.Menu;
import com.jk.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuServiceImpl implements MenuService{

    @Autowired
    private MenuMapper menuMapper;
    @Override
    public JSONObject selmenu(int page, int rows) {
        long count=menuMapper.selmenucount();
        int start=(page-1)*rows;
        List<Menu> list=menuMapper.selmenulist(start,rows);
        JSONObject jsonObject=new JSONObject();
        jsonObject.put("total",count);
        jsonObject.put("rows",list);
        return jsonObject;
    }
}
