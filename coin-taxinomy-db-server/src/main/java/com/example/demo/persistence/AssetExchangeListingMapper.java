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
import com.example.demo.model.AssetExchangeListing;

@Mapper
public interface AssetExchangeListingMapper {

	@Select("SELECT id, listing_nb, asset_id FROM asset_exchange_listing WHERE id = #{id}")	
	AssetExchangeListing selectById(@Param("id") long id);

	@Insert("INSERT INTO asset_exchange_listing (listing_nb, asset_id) VALUES(#{listing_nb}, #{asset_id})")
	@Options(useGeneratedKeys=true)
	long insert(AssetExchangeListing assetExchangeListing);

	@Select("SELECT * FROM asset_exchange_listing")
	Collection<AssetExchangeListing> selectAll();

	@Delete("DELETE FROM asset_exchange_listing WHERE id=#{id}")
	void deleteById(int id);

	@Update("UPDATE asset_exchange_listing SET (listing_nb=#{listing_nb}, asset_id=#{asset_id}) WHERE id=#{id}")
	void update(AssetExchangeListing assetExchangeListing);
	
}
