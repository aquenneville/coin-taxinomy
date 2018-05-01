package com.example.demo.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.model.Company;
import com.example.demo.model.WebsiteIdentifier;
import com.example.demo.persistence.CompanyMapper;
import com.example.demo.persistence.WebsiteIdentifierMapper;

public class WebsiteIdentifierService {
	
		
	@Autowired
	private WebsiteIdentifierMapper websiteIdentifierMapper;
	
	public Collection<WebsiteIdentifier> getAllWebsiteIdentifiers() {
		return this.websiteIdentifierMapper.selectAll();
	}
	
	public WebsiteIdentifier getWebsiteIdentifierById(int id) {
		return this.websiteIdentifierMapper.selectById(id);
	}

	public void deleteWebsiteIdentifierById(int id) {
		this.websiteIdentifierMapper.deleteById(id);
	}
	
	public void updateWebsiteIdentifier(WebsiteIdentifier websiteIdentifier) {				
		this.websiteIdentifierMapper.update(websiteIdentifier);
	}

	public void insertWebsiteIdentifier(WebsiteIdentifier websiteIdentifier) {
		this.websiteIdentifierMapper.insert(websiteIdentifier);		
	}
	
}
