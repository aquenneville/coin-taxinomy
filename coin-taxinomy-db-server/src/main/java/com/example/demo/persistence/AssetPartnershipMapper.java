package com.example.demo.persistence;

import java.util.Collection;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.example.demo.model.AssetPartnership;

@Mapper
public interface AssetPartnershipMapper {


	@Select("SELECT id, asset_id, company_id, article_id FROM asset_partnership WHERE id = #{id}")	
	AssetPartnership selectById(@Param("id") long id);

	@Insert("INSERT INTO asset_partnership (asset_id, company_id, article_id) VALUES(#{asset_id}, #{company_id}, #{article_id})")
	@Options(useGeneratedKeys=true)
	long insert(AssetPartnership assetPartnership);
	
	@Select("SELECT * FROM asset_partnership")
	Collection<AssetPartnership> selectAll();

	@Delete("DELETE FROM asset_partnership WHERE id=#{id}")
	void deleteById(int id);

	@Update("UPDATE asset_partnership SET (asset=#{asset.id}, company_id=#{company.id}, article_id=#{article.id}) WHERE id=#{id}")
	void update(AssetPartnership assetPartnership);
}
