package com.jk.dao;

import com.jk.pojo.Topic;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TopicMapper {
    int deleteByPrimaryKey(Integer topicid);

    int insert(Topic record);

    int insertSelective(Topic record);

    Topic selectByPrimaryKey(Integer topicid);

    int updateByPrimaryKeySelective(Topic record);

    int updateByPrimaryKey(Topic record);

    long querywzjtotopictotal(Topic topic);

    List<Topic> querywzjtotopic(@Param("st") Integer start, @Param("rows")Integer rows, @Param("topic")Topic topic);

    int todeletetotopic1(int topicid);

    int addtotopic(Topic topic);

    int todeletetotopic2(String s);

    Topic toupdatetotopic(Integer topicid);

    int updatetotopic(Topic topic);
}