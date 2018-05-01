package com.example.demo.persistence;

import java.util.Collection;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.example.demo.model.Company;

@Mapper
public interface CompanyMapper {


	@Select("SELECT id, name, website, crunchbase_id, industry FROM company WHERE id = #{id}")	
	Company selectById(@Param("id") long id);

	@Insert("INSERT INTO company (asset_id, name, website, crunchbase_id, industry) VALUES(#{asset_id}, #{name}, #{home_url}, #{crunchbase_url}, #{industry})")
	@Options(useGeneratedKeys=true)
	long insert(Company assetFork);

	@Delete("DELETE FROM company WHERE id=#{id}")
	void deleteById(int id);

	@Update("UPDATE company SET (asset_id=#{asset.id}, name=#{name}, website=#{website}, crunchbase_id=#{crunchbase_id}, industry=#{industry}) WHERE id=#{id}")
	void update(Company company);

	@Select("SELECT * FROM company")	
	Collection<Company> selectAll();
}
