package com.example.demo.persistence;

import java.util.Collection;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.example.demo.model.AssetPriceForecast;

@Mapper
public interface AssetPriceForecastMapper {


	@Select("SELECT id, asset_id, year, price_forecast, forecast_date, article_id FROM asset_price_forecast WHERE id = #{id}")	
	AssetPriceForecast selectById(@Param("id") long id);

	@Insert("INSERT INTO asset_price_forecast (asset_id, year, price_forecast, from_date, article_id) VALUES(#{asset.id}, #{year}, #{priceForecast}, #{fromDate}, #{article.id})")
	@Options(useGeneratedKeys=true)
	long insert(AssetPriceForecast assetPriceForecast);

	@Update("UPDATE asset_price_forecast SET (asset_id=#{asset.id}, year=#{year}, price_forecast=#{price_forecast}, from_date=#{from_date}, article_id=#{article_id}) WHERE id=#{id}")
	void update(AssetPriceForecast assetPriceForecast);

	@Delete("DELETE FROM asset_price_forecast WHERE id=#{id}")
	void deleteById(int id);

	@Select("SELECT * FROM asset_price_forecast")
	Collection<AssetPriceForecast> selectAll();
}
