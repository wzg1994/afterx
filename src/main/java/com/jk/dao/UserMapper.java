package com.jk.dao;

import com.jk.pojo.Employee;
import com.jk.pojo.User;
import com.jk.pojo.Zhubo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
  

    long queryUserCount(User user);

    List<User> queryUser(@Param("start")  int start, @Param("rows")int rows, @Param("user")User user);

    long queryZhuBoCount(Zhubo zhubo);

    List<User> queryZhuBo(@Param("start")int start,  @Param("rows")int rows,  @Param("zhubo")Zhubo zhubo);

    int addZhubo(Zhubo zhubo);

    List<Employee> loginUser(Employee employee);

}