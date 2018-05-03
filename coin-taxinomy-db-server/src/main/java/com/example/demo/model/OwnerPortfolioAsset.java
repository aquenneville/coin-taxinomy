package com.example.demo.model;

public class OwnerPortfolioAsset {
	
	private long id;
	private OwnerPortfolio portfolio;
	private Asset asset;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public OwnerPortfolio getPortfolio() {
		return portfolio;
	}
	public void setPortfolio(OwnerPortfolio portfolio) {
		this.portfolio = portfolio;
	}
	public Asset getAsset() {
		return asset;
	}
	public void setAsset(Asset asset) {
		this.asset = asset;
	}
	
}
