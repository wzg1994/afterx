package com.jk.service.Impl;

import com.jk.dao.HuiFuMapper;
import com.jk.dao.SuggestMapper;
import com.jk.dao.VoiceMapper;
import com.jk.dao.VoicetopicMapper;
import com.jk.pojo.*;
import com.jk.service.TouSusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Service
public class TouSusServiceImpl  implements TouSusService {
    @Autowired
    private SuggestMapper suggestMapper;
    @Autowired
    private HuiFuMapper huiFuMapper;
    @Autowired
    private VoicetopicMapper voicetopicMapper;



   @Override
    public Map<String, Object> queryStuPage(Suggest c, int page, int rows,String xx) {
       Map<String, Object>map=new HashMap<>();
       if(xx.equals("1")){
           Long ci=suggestMapper.countid(c);
           int st=(page-1)*rows;
           int end=st+rows;
           List<Suggest>list=suggestMapper.queryStuPage(c,st,rows);
           map.put("total", ci);
           map.put("rows",list);
        }else{
           Long ci=suggestMapper.countid2(c);
           int st=(page-1)*rows;
           List<Suggest>list=suggestMapper.queryStuPage2(c,st,rows);
           map.put("total", ci);
           map.put("rows",list);
       }
           return map;
   }

    @Override
    public Map<String, Object> querySelects(Voicetopic c, int page, int rows) {
        Map<String, Object>map=new HashMap<>();
            Long ci=voicetopicMapper.counts(c);
            int st=(page-1)*rows;
            List<Voicetopic>list=voicetopicMapper.querySelects(c,st,rows);
            map.put("total", ci);
            map.put("rows",list);
            return map;
    }

    @Override
    public Voicetopic Xiangqings(Integer voiceid) {
        return voicetopicMapper.Xiangqings(voiceid);
    }

    @Override
    public List<Zhubo> ZhuboSelect() {
        return voicetopicMapper.ZhuboSelect();
    }

    @Override
    public List<Voice> VoiceSelect() {
        return voicetopicMapper.VoiceSelect();
    }

    @Override
    public int addHuatis(Voicetopic c) {
        return voicetopicMapper.addHuatis(c);
    }

    @Override
    public List<Employee> ZhiPais() {
        return huiFuMapper.ZhiPais();
    }

    @Override
    public int upzhipais(Employee c) {
        return huiFuMapper.upzhipais(c.getEmployeeid());
    }

    @Override
    public List<Employee> CheZhis() {
        return huiFuMapper.CheZhis();
    }

    @Override
    public int upCheZhis(Employee c) {
        return huiFuMapper.upCheZhis(c);
    }

    @Override
    public int deleteTouSu(String ss) {
        return suggestMapper.deleteTouSu(ss);
    }

    @Override
    public int insertAdds(HuiFu a) {
        return huiFuMapper.insertAdds(a);
    }

    @Override
    public void deleteHuiFu(String sss) {
         huiFuMapper.deleteHuiFu(sss);
    }
}
