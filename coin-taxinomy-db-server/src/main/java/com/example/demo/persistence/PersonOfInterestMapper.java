package com.example.demo.persistence;

import java.util.Collection;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.example.demo.model.PersonOfInterest;

@Mapper
public interface PersonOfInterestMapper {

	@Select("SELECT id, name, twitter_id, company_id, website FROM person_of_interest WHERE id = #{id}")	
	PersonOfInterest selectById(@Param("id") long id);

	@Insert("INSERT INTO person_of_interest (name, twitter_id, company_id, website) VALUES(#{name}, #{twitter_id}, #{company.id}, #{website})")
	@Options(useGeneratedKeys=true)
	long insert(PersonOfInterest article);

	@Select("SELECT * FROM owner_portfolio")
	Collection<PersonOfInterest> selectAll();

	@Delete("DELETE FROM person_of_interest WHERE id = #{id}")
	void deleteById(int id);

	@Update("UPDATE person_of_interest SET (name=#{name}, twitter_id=#{twitter_id}, company_id=#{company.id}, website=#{website}) WHERE id=#{id}")
	void update(PersonOfInterest personOfInterest);
}
