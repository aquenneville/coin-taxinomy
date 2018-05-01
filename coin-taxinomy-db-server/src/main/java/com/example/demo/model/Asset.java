package com.example.demo.model;

import java.time.LocalDate;

public class Asset {
	
	private long id;
	private String name;
	private long maxSupply;
	private String symbol;
	private LocalDate creationDate;
	private boolean isFiat;
	private String consensus;
	
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
	public long getMaxSupply() {
		return maxSupply;
	}
	public void setMaxSupply(long maxSupply) {
		this.maxSupply = maxSupply;
	}
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	public LocalDate getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(LocalDate creationDate) {
		this.creationDate = creationDate;
	}
	public boolean isFiat() {
		return isFiat;
	}
	public void setFiat(boolean isFiat) {
		this.isFiat = isFiat;
	}
	public String getConsensus() {
		return consensus;
	}
	public void setConsensus(String consensus) {
		this.consensus = consensus;
	}	
	
}
