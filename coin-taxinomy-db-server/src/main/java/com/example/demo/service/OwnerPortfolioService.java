package com.example.demo.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.model.OwnerPortfolio;
import com.example.demo.persistence.OwnerPortfolioMapper;

public class OwnerPortfolioService {
	
		
	@Autowired
	private OwnerPortfolioMapper ownerPortfolioMapper;
	
	public Collection<OwnerPortfolio> getAllOwnerPortfolios() {
		return this.ownerPortfolioMapper.selectAll();
	}
	
	public OwnerPortfolio getOwnerPortfolioById(int id) {
		return this.ownerPortfolioMapper.selectById(id);
	}

	public void deleteOwnerPortfolioById(int id) {
		this.ownerPortfolioMapper.deleteById(id);
	}
	
	public void updateOwnerPortfolio(OwnerPortfolio ownerPortfolio) {				
		this.ownerPortfolioMapper.update(ownerPortfolio);
	}

	public void insertOwnerPortfolio(OwnerPortfolio ownerPortfolio) {
		this.ownerPortfolioMapper.insert(ownerPortfolio);		
	}
	
}
