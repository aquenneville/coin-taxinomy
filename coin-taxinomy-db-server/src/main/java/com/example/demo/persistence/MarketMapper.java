package com.example.demo.persistence;

import java.util.Collection;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.example.demo.model.Market;

@Mapper
public interface MarketMapper {

	@Select("SELECT id, exchange_id, asset_id, pair FROM market WHERE id = #{id}")	
	Market selectById(@Param("id") long id);

	@Insert("INSERT INTO market (exchange_id, asset_id, pair) VALUES(#{company.id}, #{asset.id}, #{pair})")
	@Options(useGeneratedKeys=true)
	long insert(Market article);

	@Update("UPDATE artist SET (exchange_id=#{company.id}, asset_id=#{asset.id}) WHERE id=#{id}")
	void update(Market company);
	
	@Delete("DELETE FROM market WHERE id = #{id}")	
	void deleteById(int id);

	@Select("SELECT * FROM market")	
	Collection<Market> selectAll();
}
