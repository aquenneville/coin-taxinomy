package com.example.demo.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.model.AssetPriceForecast;
import com.example.demo.persistence.AssetPriceForecastMapper;

@Component
public class AssetPriceForecastService {
		
	@Autowired
	private AssetPriceForecastMapper assetPriceForecastMapper;
	
	public Collection<AssetPriceForecast> getAllAssetPriceForecasts() {
		return this.assetPriceForecastMapper.selectAll();
	}
	
	public AssetPriceForecast getAssetPriceForecastById(int id) {
		return this.assetPriceForecastMapper.selectById(id);
	}

	public void deleteAssetPriceForecastById(int id) {
		this.assetPriceForecastMapper.deleteById(id);
	}
	
	public void updateAssetPriceForecast(AssetPriceForecast assetPriceForecast) {				
		this.assetPriceForecastMapper.update(assetPriceForecast);
	}

	public void insertAssetPriceForecast(AssetPriceForecast assetPriceForecast) {
		this.assetPriceForecastMapper.insert(assetPriceForecast);		
	}
}
