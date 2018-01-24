package com.jk.service.Impl;

import com.jk.dao.MoneyinfoMapper;
import com.jk.pojo.Moneyinfo;
import com.jk.pojo.User;
import com.jk.service.MoneyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class MoneyServiceImpl implements MoneyService {
    @Autowired
    private MoneyinfoMapper moneyinfoMapper;
    @Override
    public Map<String, Object> queryMoney(int page, int rows, Moneyinfo moneyinfo) {
        //		总条数
        long total = moneyinfoMapper.queryMoneyCount(moneyinfo);
//		当前页数据
        int start = (page-1)*rows;
        List<Moneyinfo> moneys = moneyinfoMapper.queryMoneyPage(start,rows,moneyinfo);
        Map<String , Object> map = new HashMap<>();
        map.put("total", total);
        map.put("rows", moneys);
        return map;
    }

    @Override
    public void updateMonyn(Moneyinfo moneyinfo) {
        moneyinfoMapper.updateMonyn(moneyinfo);
    }

    @Override
    public void updateMonyn2(Moneyinfo moneyinfo) {
        moneyinfoMapper.updateMonyn2(moneyinfo);
    }
}
