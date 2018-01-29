package com.jk.controller;

import com.alibaba.fastjson.JSONObject;
import com.jk.pojo.*;
import com.jk.service.JokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.FileOutputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * ----------Dragon be here!----------/
 * 　　　┏┓　　　┏┓
 * 　　┏┛┻━━━┛┻┓
 * 　　┃　　　　　　　┃
 * 　　┃　　　━　　　┃
 * 　　┃　┳┛　┗┳　┃
 * 　　┃　　　　　　　┃
 * 　　┃　　　┻　　　┃
 * 　　┃　　　　　　　┃
 * 　　┗━┓　　　┏━┛
 * 　　　　┃　　　┃神兽保佑
 * 　　　　┃　　　┃代码无BUG！
 * 　　　　┃　　　┗━━━┓
 * 　　　　┃　　　　　　　┣━━┓
 * 　　　　┃　　　　　　　┏━━┛
 * 　　　　┗┓┓┏━┳┓┏┛
 * 　　　　　┃┫┫　┃┫┫
 * 　　　　　┗┻┛　┗┻┛
 * ━━━━━━神兽出没━━━━━━by:coder-pig
 */
@Controller
@EnableAutoConfiguration
public class JokeController {
    @Autowired
    private JokeService jokeService;


    /**
     * 跳转到页面
     */
    @RequestMapping(value = "/tojoke")
    public String tojoke() {
        return "/Joke/tojoke";
    }

    /**
     * 查询笑话
     */
    @RequestMapping(value = "queryjoke")
    @ResponseBody
    public Object queryjoke(int page, int rows, Joketopic joke) {
        JSONObject json = jokeService.queryjoke(page, rows, joke);
        return json;
    }

    /**
     * 跳转到新增
     */
    @RequestMapping(value = "toaddjoke")
    public String toaddjoke(HttpServletRequest request) {
        /*List<Joketopic> jokelist=jokeService.toaddjoke();
        request.setAttribute("jokelist",jokelist);*/
        return "/Joke/toaddjoke";
    }

    @RequestMapping(value = "addjoke")
    @ResponseBody
    public String addjoke(Joketopic joke) {
        jokeService.addjoke(joke);
        return "0";
    }

    /**
     * 批量删
     */
    @RequestMapping("deljoke")
    @ResponseBody
    public int deleteTouSu(@RequestParam(value = "jokeid[]") String[] titles) throws ParseException {
        int aa = 0;
        int sum = 0;
        for (String ss : titles) {
            aa = jokeService.deljoke(ss);
            sum = sum + aa;
        }
        return sum;
    }

    /**
     * 跳转到详细
     *
     * @return
     */
    @RequestMapping(value = "quejoke")
    public String quejoke(Joketopic joke, HttpServletRequest request) {
        List<Joketopic> ss = jokeService.quejoke(joke);
        request.setAttribute("ss", ss);
        return "/Joke/quejoke";
    }

    /**
     * 查询
     *
     * @return
     */
    @RequestMapping(value = "queryck")
    @ResponseBody
    public Object queryck(int page, int rows, Jokecomment mment) {
        JSONObject json = jokeService.queryck(page, rows, mment);
        return json;
    }
    /**
     * -----------------------------图片==============================
     */
    /**
     * 跳转图片页面
     */
    @RequestMapping(value = "toimg")
    public String toimg() {

        return "/Joke/toimgs";
    }

    @RequestMapping(value = "toupldf")
    public String toupldf() {

        return "/Joke/toimg";
    }

    /**
     * 上传图片
     */
    @RequestMapping("uploadaddPhoto2")
    @ResponseBody
    public String upImg(MultipartFile artImg, HttpServletRequest req) throws Exception {
        //获取原文件名称
        String fileName = artImg.getOriginalFilename();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
        String folderPath = req.getSession().getServletContext().getRealPath("/") +
                "upload/";
        File file = new File(folderPath);
//	        该目录是否已经存在
        if (!file.exists()) {
            //   创建文件夹
            file.mkdir();
        }
        String onlyFileName = sdf.format(new Date()) + fileName.substring(fileName.lastIndexOf('.'));
        FileOutputStream fos = new FileOutputStream(folderPath + onlyFileName);
        fos.write(artImg.getBytes());
        fos.flush();
        fos.close();
        return "/upload/" + onlyFileName;
    }

    /**
     * 新增图片信息
     */
    @RequestMapping(value = "addimg")
    @ResponseBody
    public void addimg(Photo ph) {
        SimpleDateFormat uuu = new SimpleDateFormat("yyyy-MM-dd");
        String ff = uuu.format(new Date());
        ph.setTidate(ff);
        jokeService.addimg(ph);
    }

    /**
     * 查询图片信息
     */
    @RequestMapping(value = "queimgs")
    @ResponseBody
    public Object queimgs(int page, int rows, Picgroup pic) {
        JSONObject json = jokeService.queimgs(page, rows, pic);
        return json;
    }

    /**
     * 图片集合
     */
    @RequestMapping(value = "selectimgs")
    public String selectimgs(Photo ph, HttpServletRequest request, String ss,String aa) {
        List<Photo> phlist = jokeService.selectimgs(ss);
        request.setAttribute("phlist", phlist);
        request.setAttribute("aa",aa);
        return "/Joke/selectimgs";
    }

    /**
     * 修改封面 @
     */
    @RequestMapping(value = "upimg")
    @ResponseBody
    public void upimg(Picgroup pic) {
        jokeService.upimg(pic);
    }

    /**
     * 跳转到查询文章
     *
     * @return
     */
    @RequestMapping(value = "toht")
    public String toht() {
        return "/Joke/toht";
    }

    /**
     *查询文章
     */
    @RequestMapping(value = "queht")
    @ResponseBody
    public Object queht(int page, int rows, Pictopic pictopic) {
        JSONObject json = jokeService.queht(page, rows, pictopic);
        return json;
    }

    /**
     * 跳转到新增文章
     * @param request
     * @return
     */
    @RequestMapping(value = "toaddht")
    public String toaddht(HttpServletRequest request) {
        List<Menu> mlist = jokeService.quem();
        List<Picgroup> plist = jokeService.quep();
        request.setAttribute("mlist", mlist);
        request.setAttribute("plist", plist);
        return "/Joke/toaddht";
    }

    /**
     *
     * 执行新增文章
     * @param p
     * @return
     */
    @RequestMapping(value = "addht")
    @ResponseBody
    public Object addht(Pictopic p) {
        jokeService.addht(p);
        return "";
    }

    /**
     * 跳转到评论
     * @param request
     * @param kk
     * @return
     */
    @RequestMapping("quecoment")
    public  String quecoment(HttpServletRequest request,String kk){
        request.setAttribute("kk",kk);
        return "/Joke/quecoment";
    }

    /**
     * 查询评论
     * @param page
     * @param rows
     * @param cnt
     * @return
     */
    @RequestMapping(value = "quecnt")
    @ResponseBody
    public  Object quecnt(int page, int rows,Pictopiccomment cnt){
      JSONObject json=jokeService.quecnt(page,rows,cnt);
        return json;
    }

    /**
     * 删除文章
     * @param titles
     * @return
     * @throws ParseException
     */
    @RequestMapping(value = "delht")
    @ResponseBody
    public int delht(@RequestParam(value = "pictopicid[]") String[] titles) throws ParseException {
        int aa = 0;
        int sum = 0;
        for (String ss : titles) {
            aa = jokeService.delht(ss);
            sum = sum + aa;
        }
        return sum;
    }

    /**
     * 跳转到添加图片组
     */
    @RequestMapping(value = "toaddtpz")
    public String toaddtpz(HttpServletRequest request){
        List<Menu> mlist = jokeService.quem();
        request.setAttribute("mlist", mlist);
        List<Photo> hlist=jokeService.queh();
        request.setAttribute("hlist", hlist);
        return "/Joke/toaddtpz";
    }
    /**
     * 添加图片组
     */

    @RequestMapping(value = "addtpz")
    @ResponseBody
    public Object addtpz(Picgroup gr) {
        jokeService.addtpz(gr);
        return "";
    }

    /**
     * 删除照片组
     */

    @RequestMapping(value = "delimg")
    @ResponseBody
    public int delimg(@RequestParam(value = "picgroupid[]") String[] titles) throws ParseException {
        int aa = 0;
        int sum = 0;
        for (String ss : titles) {
            aa = jokeService.delimg(ss);
            sum = sum + aa;
        }
        return sum;
    }
}
