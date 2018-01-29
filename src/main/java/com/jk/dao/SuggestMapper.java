package com.jk.dao;

import com.jk.pojo.Suggest;
import com.jk.pojo.Voice;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SuggestMapper {
    
    Long countid(Suggest c);

    List<Suggest> queryStuPage(@Param("c")Suggest c, @Param("st") int st, @Param("rows") int rows);

    int deleteTouSu(String ss);

    Long countid2(Suggest c);

    List<Suggest> queryStuPage2(@Param("c")Suggest c, @Param("st") int st, @Param("rows") int rows);

}