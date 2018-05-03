package com.example.demo.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.model.AssetFork;
import com.example.demo.persistence.AssetForkMapper;

@Component
public class AssetForkService {
		
	@Autowired
	private AssetForkMapper assetForkMapper;
	
	public Collection<AssetFork> getAllAssetForks() {
		return this.assetForkMapper.selectAll();
	}
	
	public AssetFork getAssetForkById(int id) {
		return this.assetForkMapper.selectById(id);
	}

	public void deleteAssetForkById(int id) {
		this.assetForkMapper.deleteById(id);
	}
	
	public void updateAssetFork(AssetFork AssetFork) {				
		this.assetForkMapper.update(AssetFork);
	}

	public void insertAssetFork(AssetFork AssetFork) {
		this.assetForkMapper.insert(AssetFork);		
	}
}
