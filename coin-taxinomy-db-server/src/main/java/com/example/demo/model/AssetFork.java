package com.example.demo.model;

public class AssetFork {

	private long id;
	private Asset asset;
	private Asset parentAsset;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Asset getAsset() {
		return asset;
	}
	public void setAsset(Asset asset) {
		this.asset = asset;
	}
	public Asset getParentAsset() {
		return parentAsset;
	}
	public void setParentAsset(Asset parentAsset) {
		this.parentAsset = parentAsset;
	}
		
}
