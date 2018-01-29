package com.jk.dao;

import com.jk.pojo.Article;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ArticleMapper {
    int deleteByPrimaryKey(Integer articleid);

    int insert(Article record);

    int insertSelective(Article record);

    Article selectByPrimaryKey(Integer articleid);

    int updateByPrimaryKeySelective(Article record);

    int updateByPrimaryKey(Article record);

    long querytoarticletotal(Article article);

    List<Article> querytoarticlelist(@Param("st") Integer start, @Param("rows")Integer rows, @Param("article")Article article);

    int todeletetoarticle1(int articleid);

    int todeletetoarticle2(@Param("s") String s);
}