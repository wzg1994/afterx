package com.jk.dao;

import com.jk.pojo.Menu;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MenuMapper {

    List<Menu> seltreebypid(@Param("pid") Integer pid);
}