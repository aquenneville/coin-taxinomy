package com.example.demo.rest;

import java.io.IOException;
import java.util.Collection;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Asset;
import com.example.demo.model.Company;
import com.example.demo.service.CompanyService;
import com.example.demo.service.KeywordAssetArticleService;



@RestController
@RequestMapping("/companys")
public class RestCompanyController {
	
	@Autowired
	private CompanyService companyService;
	
	@RequestMapping(method = RequestMethod.GET)
	public Collection<Company> getAllCompanys() {		
		
		return companyService.getAllCompanys();
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET) 
	public Company getAssetById(@PathVariable("id")int id) {		 
		return companyService.getCompanyById(id);
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE) 
	public void deleteCompanyById(@PathVariable("id") int id, HttpServletResponse response) {
		companyService.deleteCompanyById(id);		
		//return "redirect:/";
		try {
			response.sendRedirect("/");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
	public void Company(@RequestBody Company company) {
		companyService.updateCompany(company);
	}
	
	@RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public void insertCompany(@RequestBody Company company, HttpServletResponse response) {
		companyService.insertCompany(company);
		try {
			response.sendRedirect("/");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
