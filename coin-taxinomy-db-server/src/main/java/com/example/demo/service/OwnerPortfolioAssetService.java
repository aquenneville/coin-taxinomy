package com.example.demo.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.model.OwnerPortfolioAsset;
import com.example.demo.persistence.OwnerPortfolioAssetMapper;

public class OwnerPortfolioAssetService {
	
		
	@Autowired
	private OwnerPortfolioAssetMapper ownerPortfolioAssetMapper;
	
	public Collection<OwnerPortfolioAsset> getAllOwnerPortfolioAssets() {
		return this.ownerPortfolioAssetMapper.selectAll();
	}
	
	public OwnerPortfolioAsset getOwnerPortfolioAssetById(int id) {
		return this.ownerPortfolioAssetMapper.selectById(id);
	}

	public void deleteOwnerPortfolioAssetById(int id) {
		this.ownerPortfolioAssetMapper.deleteById(id);
	}
	
	public void updateOwnerPortfolioAsset(OwnerPortfolioAsset Company) {				
		this.ownerPortfolioAssetMapper.update(Company);
	}

	public void insertOwnerPortfolioAsset(OwnerPortfolioAsset Company) {
		this.ownerPortfolioAssetMapper.insert(Company);		
	}
	
}
