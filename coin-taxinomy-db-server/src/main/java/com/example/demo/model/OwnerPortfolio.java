package com.example.demo.model;

public class OwnerPortfolio {

	private long id;
	private Company company;
	private PersonOfInterest person;
	private String portfolioName;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Company getCompany() {
		return company;
	}
	public void setCompany(Company company) {
		this.company = company;
	}
	public PersonOfInterest getPerson() {
		return person;
	}
	public void setPerson(PersonOfInterest person) {
		this.person = person;
	}
	public String getPortfolioName() {
		return portfolioName;
	}
	public void setPortfolioName(String portfolioName) {
		this.portfolioName = portfolioName;
	}
		
}
