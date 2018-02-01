package com.jk.service.Impl;

import com.jk.dao.GiftMapper;
import com.jk.pojo.Gift;
import com.jk.service.GiftService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class GiftServiceImpl implements GiftService {
    @Autowired
    private GiftMapper giftMapper;
    @Override
    public Map<String, Object> queryGift(int page, int rows, Gift gift) {
        //		总条数
        long total = giftMapper.queryGiftCount(gift);
//		当前页数据
        int start = (page-1)*rows;
        List<Gift> gifts = giftMapper.queryGiftPage(start,rows,gift);
        Map<String , Object> map = new HashMap<>();
        map.put("total", total);
        map.put("rows", gifts);
        return map;
    }

    @Override
    public Gift viewGift(Integer giftid) {
        return giftMapper.viewGift(giftid);
    }

    @Override
    public void updateGift(Gift gift) {
        giftMapper.updateGift(gift);
    }

    @Override
    public void addGift(Gift gift) {
        giftMapper.addGift(gift);
    }

    @Override
    public void deleteGift(Integer giftid) {
        giftMapper.deleteGift(giftid);
    }
}
