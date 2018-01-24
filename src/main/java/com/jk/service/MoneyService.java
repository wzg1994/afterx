package com.jk.service;

import com.jk.pojo.Moneyinfo;
import com.jk.pojo.User;

import java.util.Map;

public interface MoneyService {
    Map<String,Object> queryMoney(int page, int rows, Moneyinfo moneyinfo);

    void updateMonyn(Moneyinfo moneyinfo);

    void updateMonyn2(Moneyinfo moneyinfo);
}
