package com.example.demo.persistence;

import java.util.Collection;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.example.demo.model.WebsiteIdentifier;

@Mapper
public interface WebsiteIdentifierMapper {

	@Select("SELECT id, name, value, asset_id FROM website_identifier WHERE id = #{id}")	
	WebsiteIdentifier selectById(@Param("id") long id);

	@Insert("INSERT INTO website_identifier (name, value, asset_id) VALUES(#{name}, #{value}, #{asset.id})")
	@Options(useGeneratedKeys=true)
	long insert(WebsiteIdentifier article);

	@Select("SELECT * FROM website_identifier")
	Collection<WebsiteIdentifier> selectAll();

	@Delete("DELETE FROM website_identifier WHERE id=#{id}")
	void deleteById(int id);

	@Update("UPDATE website_identifier SET (name=#{name}, value=#{value}, asset_id=#{asset.id}) WHERE id=#{id}")
	void update(WebsiteIdentifier article);
	
}
