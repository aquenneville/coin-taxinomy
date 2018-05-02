package com.example.demo.persistence;

import java.util.Collection;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.example.demo.model.KeywordAssetArticle;

@Mapper
public interface KeywordAssetArticleMapper {


	@Select("SELECT id, keyword, asset_id, article_id FROM keyword_asset_article WHERE id = #{id}")	
	KeywordAssetArticle selectById(@Param("id") long id);

	@Insert("INSERT INTO keyword_asset_article (keyword, asset_id, article_id) VALUES(#{keyword}, #{asset.id}, #{article.id})")
	@Options(useGeneratedKeys=true)
	long insert(KeywordAssetArticle keywordAssetArticle);

	@Update("UPDATE keyword_asset_article SET (keyword=#{keyword}, asset_id=#{asset.id}, article_id=#{article.id}) WHERE id=#{id}")
	void update(KeywordAssetArticle keywordAssetArticle);

	@Delete("DELETE FROM keyword_asset_article WHERE id=#{id}")
	void deleteById(int id);

	@Select("SELECT * FROM keyword_asset_article")
	Collection<KeywordAssetArticle> selectAll();
}
