package com.example.demo.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.model.Company;
import com.example.demo.persistence.CompanyMapper;

@Component
public class CompanyService {
	
		
	@Autowired
	private CompanyMapper CompanyMapper;
	
	public Collection<Company> getAllCompanys() {
		return this.CompanyMapper.selectAll();
	}
	
	public Company getCompanyById(int id) {
		return this.CompanyMapper.selectById(id);
	}

	public void deleteCompanyById(int id) {
		this.CompanyMapper.deleteById(id);
	}
	
	public void updateCompany(Company Company) {				
		this.CompanyMapper.update(Company);
	}

	public void insertCompany(Company Company) {
		this.CompanyMapper.insert(Company);		
	}
	
}
