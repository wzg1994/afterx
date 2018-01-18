package com.jk.controller;

import com.jk.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration
public class MenuController {

    @Autowired
    private MenuService menuService;

    @RequestMapping(value = "/toselmenu")
    public String toselmenu(){
        return "/menu/toselmenu";
    }
}
