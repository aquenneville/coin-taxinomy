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

import com.example.demo.model.AssetExchangeListing;
import com.example.demo.service.AssetExchangeListingService;



@RestController
@RequestMapping("/api/assets")
public class RestAssetExchangeListingController {
	
	@Autowired
	private AssetExchangeListingService assetExchangeListingService;
	
	@RequestMapping(method = RequestMethod.GET)
	public Collection<AssetExchangeListing> getAllAssets() {		
		
		return assetExchangeListingService.getAllAssetExchangeListings();
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET) 
	public AssetExchangeListing getAssetById(@PathVariable("id")int id) {		 
		return assetExchangeListingService.getAssetExchangeListingById(id);
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE) 
	public void deleteAssetExchangeListingById(@PathVariable("id") int id, HttpServletResponse response) {
		assetExchangeListingService.deleteAssetExchangeListingById(id);		
		//return "redirect:/";
		try {
			response.sendRedirect("/");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
	public void updateAssetExchangeListing(@RequestBody AssetExchangeListing assetExchangeListing) {
		assetExchangeListingService.updateAssetExchangeListing(assetExchangeListing);
	}
	
	@RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public void insertAssetExchangeListing(@RequestBody AssetExchangeListing assetExchangeListing, HttpServletResponse response) {
		assetExchangeListingService.insertAssetExchangeListing(assetExchangeListing);
		try {
			response.sendRedirect("/");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
