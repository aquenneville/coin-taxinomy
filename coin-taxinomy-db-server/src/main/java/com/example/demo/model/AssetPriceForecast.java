package com.example.demo.model;

import java.time.LocalDate;

public class AssetPriceForecast {
	
	private Asset asset;
	private long year;
	private long priceForecast;
	private LocalDate forecastDate;
	private Article article;
	
	public Asset getAsset() {
		return asset;
	}
	public void setAsset(Asset asset) {
		this.asset = asset;
	}
	public long getYear() {
		return year;
	}
	public void setYear(long year) {
		this.year = year;
	}
	public long getPriceForecast() {
		return priceForecast;
	}
	public void setPriceForecast(long priceForecast) {
		this.priceForecast = priceForecast;
	}
	public LocalDate getForecastDate() {
		return forecastDate;
	}
	public void setForecastDate(LocalDate forecastDate) {
		this.forecastDate = forecastDate;
	}
	public Article getArticle() {
		return article;
	}
	public void setArticle(Article article) {
		this.article = article;
	}

	
	
}
