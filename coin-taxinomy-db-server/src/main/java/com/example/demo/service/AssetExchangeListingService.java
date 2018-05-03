package com.example.demo.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.model.AssetExchangeListing;
import com.example.demo.persistence.AssetExchangeListingMapper;

@Component
public class AssetExchangeListingService {
	
	@Autowired
	private AssetExchangeListingMapper assetExchangeListingMapper;
	
	public Collection<AssetExchangeListing> getAllAssetExchangeListings() {
		return this.assetExchangeListingMapper.selectAll();
	}
	
	public AssetExchangeListing getAssetExchangeListingById(int id) {
		return this.assetExchangeListingMapper.selectById(id);
	}

	public void deleteAssetExchangeListingById(int id) {
		this.assetExchangeListingMapper.deleteById(id);
	}
	
	public void updateAssetExchangeListing(AssetExchangeListing assetExchangeListing) {				
		this.assetExchangeListingMapper.update(assetExchangeListing);
	}

	public void insertAssetExchangeListing(AssetExchangeListing assetExchangeListing) {
		this.assetExchangeListingMapper.insert(assetExchangeListing);		
	}
}
