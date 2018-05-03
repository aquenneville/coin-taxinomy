package com.example.demo.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.model.Asset;
import com.example.demo.persistence.AssetMapper;

@Component
public class AssetService {
	
		
	@Autowired
	private AssetMapper assetMapper;
	
	public Collection<Asset> getAllAssets() {
		return this.assetMapper.selectAll();
	}
	
	public Asset getAssetById(int id) {
		return this.assetMapper.selectById(id);
	}

	public void deleteAssetById(int id) {
		this.assetMapper.deleteById(id);
	}
	
	public void updateAsset(Asset Asset) {				
		this.assetMapper.update(Asset);
	}

	public void insertAsset(Asset Asset) {
		this.assetMapper.insert(Asset);		
	}
	
}
