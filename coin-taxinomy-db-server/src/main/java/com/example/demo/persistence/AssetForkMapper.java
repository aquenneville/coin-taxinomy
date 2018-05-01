package com.example.demo.persistence;

import java.util.Collection;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.example.demo.model.AssetFork;

@Mapper
public interface AssetForkMapper {

	@Select("SELECT id, asset_id, parent_asset_id FROM asset_fork WHERE id = #{id}")	
	AssetFork selectById(@Param("id") long id);

	@Insert("INSERT INTO asset_fork (asset_id, parent_asset_id) VALUES(#{asset_id}, #{parent_asset_id})")
	@Options(useGeneratedKeys=true)
	long insert(AssetFork assetFork);

	@Select("SELECT * FROM asset_fork")
	Collection<AssetFork> selectAll();

	@Delete("DELETE FROM asset_fork WHERE id=#{id}")
	void deleteById(int id);

	@Update("UPDATE asset_fork SET (asset_id=#{asset.id}, parent_asset_id=#{parentAsset.id}}) WHERE id=#{id}")
	void update(AssetFork assetFork);
}
