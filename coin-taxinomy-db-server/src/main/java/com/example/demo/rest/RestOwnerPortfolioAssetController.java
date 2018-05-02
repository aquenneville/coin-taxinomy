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

import com.example.demo.model.OwnerPortfolioAsset;
import com.example.demo.service.OwnerPortfolioAssetService;



@RestController
@RequestMapping("/api/portfolio-assets")
public class RestOwnerPortfolioAssetController {
	
	@Autowired
	private OwnerPortfolioAssetService ownerPortfolioOwnerPortfolioAssetService;
	
	@RequestMapping(method = RequestMethod.GET)
	public Collection<OwnerPortfolioAsset> getAllOwnerPortfolioAssets() {		
		
		return ownerPortfolioOwnerPortfolioAssetService.getAllOwnerPortfolioAssets();
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET) 
	public OwnerPortfolioAsset getOwnerPortfolioAssetById(@PathVariable("id")int id) {		 
		return ownerPortfolioOwnerPortfolioAssetService.getOwnerPortfolioAssetById(id);
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE) 
	public void deleteOwnerPortfolioAssetById(@PathVariable("id") int id, HttpServletResponse response) {
		ownerPortfolioOwnerPortfolioAssetService.deleteOwnerPortfolioAssetById(id);		
		//return "redirect:/";
		try {
			response.sendRedirect("/");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
	public void updateOwnerPortfolioAsset(@RequestBody OwnerPortfolioAsset ownerPortfolioAsset) {
		ownerPortfolioOwnerPortfolioAssetService.updateOwnerPortfolioAsset(ownerPortfolioAsset);
	}
	
	@RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public void insertOwnerPortfolioAsset(@RequestBody OwnerPortfolioAsset ownerPortfolioAsset, HttpServletResponse response) {
		ownerPortfolioOwnerPortfolioAssetService.insertOwnerPortfolioAsset(ownerPortfolioAsset);
		try {
			response.sendRedirect("/");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
