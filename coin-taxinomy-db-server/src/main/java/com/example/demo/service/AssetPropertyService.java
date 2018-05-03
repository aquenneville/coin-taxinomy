package com.example.demo.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.model.AssetProperty;
import com.example.demo.persistence.AssetPropertyMapper;

@Component
public class AssetPropertyService {
	
		
	@Autowired
	private AssetPropertyMapper assetPropertyMapper;
	
	public Collection<AssetProperty> getAllAssetPropertys() {
		return this.assetPropertyMapper.selectAll();
	}
	
	public AssetProperty getAssetPropertyById(int id) {
		return this.assetPropertyMapper.selectById(id);
	}

	public void deleteAssetPropertyById(int id) {
		this.assetPropertyMapper.deleteById(id);
	}
	
	public void updateAssetProperty(AssetProperty assetProperty) {				
		this.assetPropertyMapper.update(assetProperty);
	}

	public void insertAssetProperty(AssetProperty assetProperty) {
		this.assetPropertyMapper.insert(assetProperty);		
	}
}
