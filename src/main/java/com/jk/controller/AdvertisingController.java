package com.jk.controller;

import com.alibaba.fastjson.JSONObject;
import com.jk.pojo.Advertising;
import com.jk.service.AdvertisingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
@EnableAutoConfiguration
public class AdvertisingController {
//aaaa
    @Autowired
    private AdvertisingService advertisingService;

    @RequestMapping("/toAdvertising")
    public String toAdvertising() {
        return "/toarticle/toAdvertising";
    }

    @RequestMapping("/queryAdvertising")
    @ResponseBody
    public Object queryAdvertising(int page,int rows,Advertising advertising) {
        JSONObject json = advertisingService.queryAdvertising(page,rows,advertising);
        return json;
    }

    @RequestMapping("/todeleteAdvertising1")
    @ResponseBody
    public Object todeleteAdvertising1(int advertisingid) {
        int t = advertisingService.todeleteAdvertising1(advertisingid);
        return t;
    }

    @RequestMapping("/todeleteAdvertising2")
    @ResponseBody
    public Object todeleteAdvertising2(String ids) {
        int b=0;
        String[] split = ids.split(",");
        for (int i = 0; i <split.length ; i++) {
            b=advertisingService.todeleteAdvertising2(split[i]);
        }
        return b;
    }

    @RequestMapping("/toaddAdvertising")
    public String toaddAdvertising() {
        return "/toarticle/toaddAdvertising";
    }

    @RequestMapping("/uploadaddPhoto")
    @ResponseBody
    public String uploadPhotoFiles(MultipartFile artImg, HttpServletRequest req) throws Exception{
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

    @RequestMapping("/addAdvertising")
    @ResponseBody
    public Object addAdvertising(Advertising advertising) {
        int t = advertisingService.addAdvertising(advertising);
        return t;
    }

    @RequestMapping("/toupdateAdvertising")
    public String toupdateAdvertising(Advertising advertising,HttpServletRequest request) {
        advertising = advertisingService.toupdateAdvertising(advertising.getAdvertisingid());
        request.setAttribute("advertis",advertising);
        return "/toarticle/toupdateAdvertising";
    }

    @RequestMapping("/updateAdvertising")
    @ResponseBody
    public Object updateAdvertising(Advertising advertising) {
        int t = advertisingService.updateAdvertising(advertising);
        return t;
    }

    @RequestMapping("/updatetoxiajia")
    @ResponseBody
    public Object updatetoxiajia(int advertisingid) {
        int t = advertisingService.updatetoxiajia(advertisingid);
        return t;
    }
    @RequestMapping("/updatetofabu")
    @ResponseBody
    public Object updatetofabu(int advertisingid) {
        int t = advertisingService.updatetofabu(advertisingid);
        return t;
    }
}
