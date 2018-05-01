package com.example.demo.persistence;

import java.util.Collection;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.example.demo.model.Article;

@Mapper
public interface ArticleMapper {

	@Select("SELECT id, title, article_date, url, path, summary FROM article WHERE id = #{id}")	
	Article selectById(@Param("id") long id);

	@Insert("INSERT INTO article (title, article_date, url, summary) VALUES(#{title}, #{articleDate}, #{url}, #{summary})")
	@Options(useGeneratedKeys=true)
	long insert(Article article);

	@Select("SELECT * FROM article")
	Collection<Article> selectAll();

	@Delete("DELETE FROM article WHERE id=#{id}")
	void deleteById(int id);

	@Update("UPDATE artist SET (title=#{title}, article_date=#{articleDate}, url=#{url}, path=#{path}, summary=#{summary}) WHERE id=#{id}")
	void update(Article article);
	
}
