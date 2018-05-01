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
import com.example.demo.model.OwnerPortfolio;
import com.example.demo.service.KeywordAssetArticleService;
import com.example.demo.service.OwnerPortfolioService;



@RestController
@RequestMapping("/portfolios")
public class RestOwnerPortfolioController {
	
	@Autowired
	private OwnerPortfolioService ownerPortfolioService;
	
	@RequestMapping(method = RequestMethod.GET)
	public Collection<OwnerPortfolio> getAllOwnerPortfolios() {		
		
		return ownerPortfolioService.getAllOwnerPortfolios();
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET) 
	public OwnerPortfolio getOwnerPortfolioById(@PathVariable("id")int id) {		 
		return ownerPortfolioService.getOwnerPortfolioById(id);
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE) 
	public void deleteOwnerPortfolioById(@PathVariable("id") int id, HttpServletResponse response) {
		ownerPortfolioService.deleteOwnerPortfolioById(id);		
		//return "redirect:/";
		try {
			response.sendRedirect("/");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
	public void updateOwnerPortfolio(@RequestBody OwnerPortfolio ownerPortfolio) {
		ownerPortfolioService.updateOwnerPortfolio(ownerPortfolio);
	}
	
	@RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public void insertOwnerPortfolio(@RequestBody OwnerPortfolio ownerPortfolio, HttpServletResponse response) {
		ownerPortfolioService.insertOwnerPortfolio(ownerPortfolio);
		try {
			response.sendRedirect("/");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
