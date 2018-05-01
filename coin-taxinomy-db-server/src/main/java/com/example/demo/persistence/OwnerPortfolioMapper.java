package com.example.demo.persistence;

import java.util.Collection;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.example.demo.model.OwnerPortfolio;

@Mapper
public interface OwnerPortfolioMapper {

	@Select("SELECT id, company_id, name FROM owner_portfolio WHERE id = #{id}")	
	OwnerPortfolio selectById(@Param("id") long id);

	@Insert("INSERT INTO owner_portfolio (company_id, name) VALUES(#{company.id}, #{name})")
	@Options(useGeneratedKeys=true)
	long insert(OwnerPortfolio article);

	@Update("UPDATE owner_portfolio SET (company_id=#{company.id}, name=#{name}) WHERE id=#{id}")
	void update(OwnerPortfolio companyPortfolio);

	@Delete("DELETE FROM owner_portfolio WHERE id=#{id}")
	void deleteById(int id);

	@Select("SELECT * FROM owner_portfolio")	
	Collection<OwnerPortfolio> selectAll();
	
}
