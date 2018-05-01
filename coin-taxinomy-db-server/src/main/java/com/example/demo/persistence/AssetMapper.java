package com.example.demo.persistence;

import java.util.Collection;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.example.demo.model.Asset;

@Mapper
public interface AssetMapper {


	@Select("SELECT id, name, max_supply, symbol, creation_date, fiat, concensus FROM asset WHERE id = #{id}")	
	Asset selectById(@Param("id") long id);

	@Insert("INSERT INTO asset (name, max_supply, symbol, creation_date, fiat, concensus) VALUES(#{name}, #{max_supply}, #{symbol}, #{creation_date}, #{fiat}, #{concensus})")
	@Options(useGeneratedKeys=true)
	long insert(Asset assetFork);

	@Update("UPDATE asset SET (title=#{title}, article_date=#{articleDate}, url=#{url}, path=#{path}, summary=#{summary}) WHERE id=#{id}")
	void update(Asset asset);

	@Delete("DELETE FROM asset WHERE id=#{id}")
	void deleteById(int id);

	@Select("SELECT * FROM asset")
	Collection<Asset> selectAll();
}
