package com.jk.dao;

import com.jk.pojo.Moneyinfo;
import com.jk.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MoneyinfoMapper {

    long queryMoneyCount(Moneyinfo moneyinfo);

    List<Moneyinfo> queryMoneyPage(@Param("st") int start,@Param("rows") int rows,@Param("mon") Moneyinfo moneyinfo);

    void updateMonyn(Moneyinfo moneyinfo);

    void updateMonyn2(Moneyinfo moneyinfo);
}