package com.jk.controller;

import com.jk.pojo.Gift;
import com.jk.service.GiftService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

@Controller
@EnableAutoConfiguration
public class GiftController {
    @Autowired
    private GiftService giftService;

    @RequestMapping("queryGift")
    @ResponseBody
    public Object queryGift(int page,int rows,Gift gift){
        Map<String, Object> map = giftService.queryGift(page,rows,gift);
        return map;
    }
    @RequestMapping("toshowgift")
    public String toshowgift(){return "showgift";}
    @RequestMapping("toaddgift")
    public String toaddgift(){return "addgift";}

    @RequestMapping("toupgift")
    public String toupgift(HttpSession session, Integer giftid){
        Gift gift = giftService.viewGift(giftid);
        session.setAttribute("gift",gift);
        return "upgift";
    }

    @RequestMapping("updateGift")
    @ResponseBody
    public String updateGift(Gift gift){
        giftService.updateGift(gift);
        return "1";
    }
    @RequestMapping("addGift")
    @ResponseBody
    public String addGift(Gift gift){
        giftService.addGift(gift);
        return "1";
    }
    @RequestMapping("deleteGift")
    @ResponseBody
    public String deleteGift(Integer giftid){
        giftService.deleteGift(giftid);
        return "1";
    }
    @RequestMapping("uploadPhotoFile")
    @ResponseBody
    public String upImg(MultipartFile artImg, HttpServletRequest req) throws Exception{
        //获取原文件名称
        String fileName = artImg.getOriginalFilename();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
        String folderPath = req.getSession().getServletContext().getRealPath("/")+
                "upload/";
        File file = new File(folderPath);
//	        该目录是否已经存在
        if(!file.exists()){
            //   创建文件夹
            file.mkdir();
        }
        String onlyFileName = sdf.format(new Date())+fileName.substring(fileName.lastIndexOf('.'));
        FileOutputStream fos = new FileOutputStream(folderPath+onlyFileName);
        fos.write(artImg.getBytes());
        fos.flush();
        fos.close();
        return  "/upload/"+onlyFileName;
    }

}
