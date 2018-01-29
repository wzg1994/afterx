package com.jk.controller;

import com.jk.pojo.Menu;
import com.jk.service.TreeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@EnableAutoConfiguration
public class TreeController {
    @Autowired
    private TreeService treeService;

    @RequestMapping("menuTree")
    public Object menuTree(){
        List<Menu> list=treeService.menuTree(0);
        return list;
    }

  
}
