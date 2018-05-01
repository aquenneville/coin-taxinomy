package com.example.demo.model;

public class Company {

	private long id;
	private String name;
	private String website;
	private String crunchbaseId;
	private String industry;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	public String getCrunchbaseId() {
		return crunchbaseId;
	}
	public void setCrunchbaseId(String crunchbaseId) {
		this.crunchbaseId = crunchbaseId;
	}
	public String getIndustry() {
		return industry;
	}
	public void setIndustry(String industry) {
		this.industry = industry;
	}
	
}
