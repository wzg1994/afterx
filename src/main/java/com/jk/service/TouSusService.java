package com.jk.service;

import com.jk.pojo.*;

import java.util.List;
import java.util.Map;

public interface TouSusService {

   int deleteTouSu(String ss);

    int insertAdds(HuiFu a);

    void deleteHuiFu(String sss);

    Map<String,Object> queryStuPage(Suggest c, int page, int rows, String xx);

    Map<String,Object> querySelects(Voicetopic c, int page, int rows);

    Voicetopic Xiangqings(Integer voiceid);

 List<Zhubo> ZhuboSelect();

 List<Voice> VoiceSelect();

 int addHuatis(Voicetopic c);

    List<Employee> ZhiPais();

    int upzhipais(Employee c);

    List<Employee> CheZhis();

    int upCheZhis(Employee c);
}
