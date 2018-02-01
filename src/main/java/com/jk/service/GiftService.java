package com.jk.service;

import com.jk.pojo.Gift;

import java.util.Map;

public interface GiftService {
    Map<String,Object> queryGift(int page, int rows, Gift gift);

    Gift viewGift(Integer giftid);

    void updateGift(Gift gift);

    void addGift(Gift gift);

    void deleteGift(Integer giftid);
}
