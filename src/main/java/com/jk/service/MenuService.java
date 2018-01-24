package com.jk.service;

import com.alibaba.fastjson.JSONObject;

public interface MenuService {
    JSONObject selmenu(int page, int rows);
}
