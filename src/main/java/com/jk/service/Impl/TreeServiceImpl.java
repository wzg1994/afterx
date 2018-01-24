package com.jk.service.Impl;

import com.jk.dao.MenuMapper;
import com.jk.pojo.Menu;
import com.jk.service.TreeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TreeServiceImpl implements TreeService{
    @Autowired
    private MenuMapper menuMapper;
    @Override
    public List<Menu> menuTree(Integer pid) {
        List<Menu> menus=menuMapper.seltreebypid(pid);
        if(menus != null && menus.size()>0){
            for (int i = 0; i < menus.size(); i++) {
                List<Menu> menu2 = menuTree(menus.get(i).getId());
                menus.get(i).setNodes(menu2);
            }
        }
        return menus;
    }
}
