package com.example.demo.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.model.AssetPartnership;
import com.example.demo.persistence.AssetPartnershipMapper;

@Component
public class AssetPartnershipService {
		
	@Autowired
	private AssetPartnershipMapper assetPartnershipMapper;
	
	public Collection<AssetPartnership> getAllAssetPartnerships() {
		return this.assetPartnershipMapper.selectAll();
	}
	
	public AssetPartnership getAssetPartnershipById(int id) {
		return this.assetPartnershipMapper.selectById(id);
	}

	public void deleteAssetPartnershipById(int id) {
		this.assetPartnershipMapper.deleteById(id);
	}
	
	public void updateAssetPartnership(AssetPartnership assetPartnership) {				
		this.assetPartnershipMapper.update(assetPartnership);
	}

	public void insertAssetPartnership(AssetPartnership assetPartnership) {
		this.assetPartnershipMapper.insert(assetPartnership);		
	}
}
