package com.jk.dao;

import com.jk.pojo.Gift;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GiftMapper {


    long queryGiftCount(Gift gift);

    List<Gift> queryGiftPage(@Param("st") int start,@Param("ro") int rows,@Param("gift") Gift gift);

    Gift viewGift(Integer giftid);

    void updateGift(Gift gift);

    void addGift(Gift gift);

    void deleteGift(Integer giftid);
}