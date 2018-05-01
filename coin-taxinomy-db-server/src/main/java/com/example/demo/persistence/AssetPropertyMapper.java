package com.example.demo.persistence;

import java.util.Collection;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.example.demo.model.AssetProperty;

@Mapper
public interface AssetPropertyMapper {


	@Select("SELECT id, asset_id, is_caas, is_store_of_value, is_payment, has_protocol_improvement, is_utility_token, has_smart_contract, summary, notes, capitalization_type FROM asset_property WHERE id = #{id}")	
	AssetProperty selectById(@Param("id") long id);

	@Insert("INSERT INTO asset_property "
			+ "(asset_id, is_caas, is_store_of_value, is_ico, is_ico_platform, is_payment, has_protocol_improvement, is_utility_token, has_smart_contract, summary, notes, capitalization_type) "
			+ "VALUES(#{asset.id}, #{isCaas}, #{isStoreOfValue}, #{isIco}, #{isIcoPlatform}, #{isPayment}, #{hasProtocolImprovement}, #{isUtilityToken}, #{hasSmartContracts}, #{summary}, #{notes}, #{capitalizationType})")
	@Options(useGeneratedKeys=true)
	long insert(AssetProperty assetProperty);

	@Select("SELECT * FROM asset_property")
	Collection<AssetProperty> selectAll();

	@Delete("DELETE FROM asset_property WHERE id=#{id}")
	void deleteById(int id);

	@Update("UPDATE asset_property SET (asset_id=#{asset.id}, is_caas=#{isCaas}, is_store_of_value=#{isStoreOfValue}, is_ico=#{isIco}, is_ico_platform=#{isIcoPlatform}, is_payment=#{isPayment}, "
			+ "has_protocol_improvement=#{hasProtocolImprovement}, is_utility_token=#{isUtilityToken}, has_smart_contract=#{hasSmartContracts}, summary=#{summary}, notes=#{notes}, "
			+ "capitalization_type={capitalizationType}) WHERE id=#{id}")
	void update(AssetProperty asset);
}

