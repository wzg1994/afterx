package com.jk.controller;
import com.jk.pojo.*;
import com.jk.service.TouSusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.sun.org.apache.xerces.internal.impl.xpath.regex.ParseException;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;
@Controller
@EnableAutoConfiguration
public class TouSusController {
    @Autowired
    private TouSusService touSusService;

    @RequestMapping("TouSus")
    public String TouSus(){
        return "TouSus";
    }

    @RequestMapping("ZhiPais")
    public String ZhiPais(HttpServletRequest a){
        List<Employee>list=touSusService.ZhiPais();
        a.setAttribute("ss",list);
        return "ZhiPais";
    }

    @RequestMapping("CheZhis")
    public String CheZhis(HttpServletRequest a){
        List<Employee>list=touSusService.CheZhis();
        a.setAttribute("ss2",list);
        return "CheZhis";
    }

    @RequestMapping("HuiFu")
    public String HuiFu(){
        return "HuiFu";
    }

    @RequestMapping("YinPings")
    public String YinPings(){
        return "YinPings";
    }

    @RequestMapping("queryStuPage")
    @ResponseBody
    public Object queryStuPage(Suggest c, int page , int rows,String xx){
        Map<String, Object> map=touSusService.queryStuPage(c,page,rows,xx);
        return map;
    };

        @RequestMapping("deleteTouSu")
        @ResponseBody
        public int deleteTouSu(@RequestParam(value = "qid[]") String [] titles ,@RequestParam( "qqid[]") String [] aaaa) throws ParseException {
            int aa = 0;
            int sum = 0;
            for (String sss : aaaa) {
               touSusService.deleteHuiFu(sss);
            }
            for (String ss : titles) {
                aa=touSusService.deleteTouSu(ss);
                sum = sum + aa;
            }
            return sum;
        }

        @RequestMapping("PingLuns")
        public String PingLuns(){
            return "PingLuns";
        }


        @RequestMapping("insertAdds")
        @ResponseBody
        public int insertAdds(@RequestParam(value = "qid[]") String [] titles,HuiFu a) throws ParseException {
            int aa = 0;
            int sum = 0;
            for (String ss : titles) {
                a.setHuserid(Integer.parseInt(ss));
                aa=touSusService.insertAdds(a);
                sum = sum + aa;
            }
            return sum;
        }


        @RequestMapping("querySelects")
        @ResponseBody
        public Object querySelects(Voicetopic c, int page , int rows){
            Map<String, Object> map=touSusService.querySelects(c,page,rows);
            return map;
        };


        @RequestMapping("Xiangqings")
        public String Xiangqings(Voicetopic c, HttpServletRequest a){
            Voicetopic map=touSusService.Xiangqings(c.getVoiceid());
            a.setAttribute("a",map);
            return "Xiangqings";
    };

        @RequestMapping("AddHuaTis")
        public String AddHuaTis( HttpServletRequest a){
        List<Zhubo> list=touSusService.ZhuboSelect();
        List<Voice> list2=touSusService.VoiceSelect();
            a.setAttribute("Zhubo",list);
            a.setAttribute("Voice",list2);
            return "AddHuaTis";
        }

    @RequestMapping("/uploadPhotoFilees")
    @ResponseBody
    public String uploadPhotoFiles(MultipartFile artImg, HttpServletRequest req) throws Exception{
        //获取原文件名称
        String fileName = artImg.getOriginalFilename();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
        String folderPath = req.getSession().getServletContext().getRealPath("/")+ "upload/";
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


    @RequestMapping("addHuatis")
    @ResponseBody
    public Object addHuatis(Voicetopic c){
       int a=touSusService.addHuatis(c);
        return a;
    };

    @RequestMapping("upzhipais")
    @ResponseBody
    public Object upzhipais(Employee c){
        int a=touSusService.upzhipais(c);
        return a;
    };

    @RequestMapping("upCheZhis")
    @ResponseBody
    public Object upCheZhis(Employee c){
        int a=touSusService.upCheZhis(c);
        return a;
    };
}
