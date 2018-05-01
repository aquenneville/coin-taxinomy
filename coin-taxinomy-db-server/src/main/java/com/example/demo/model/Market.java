package com.example.demo.model;

public class Market {

	private long id;
	private Company exchange;
	private Asset asset;
	private String pair;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Company getExchange() {
		return exchange;
	}
	public void setExchange(Company exchange) {
		this.exchange = exchange;
	}
	public Asset getAsset() {
		return asset;
	}
	public void setAsset(Asset asset) {
		this.asset = asset;
	}
	public String getPair() {
		return pair;
	}
	public void setPair(String pair) {
		this.pair = pair;
	}
	
}
