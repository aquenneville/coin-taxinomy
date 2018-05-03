package com.example.demo.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.model.Market;
import com.example.demo.persistence.MarketMapper;

@Component
public class MarketService {
	
		
	@Autowired
	private MarketMapper marketMapper;
	
	public Collection<Market> getAllMarkets() {
		return this.marketMapper.selectAll();
	}
	
	public Market getMarketById(int id) {
		return this.marketMapper.selectById(id);
	}

	public void deleteMarketById(int id) {
		this.marketMapper.deleteById(id);
	}
	
	public void updateMarket(Market market) {				
		this.marketMapper.update(market);
	}

	public void insertMarket(Market market) {
		this.marketMapper.insert(market);		
	}
	
}
