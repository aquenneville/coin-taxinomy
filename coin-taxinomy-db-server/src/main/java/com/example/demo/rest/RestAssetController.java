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
import com.example.demo.service.AssetService;
import com.example.demo.service.KeywordAssetArticleService;



@RestController
@RequestMapping("/assets")
public class RestAssetController {
	
	@Autowired
	private AssetService assetService;
	
	@RequestMapping(method = RequestMethod.GET)
	public Collection<Asset> getAllAssets() {		
		
		return assetService.getAllAssets();
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET) 
	public Asset getAssetById(@PathVariable("id")int id) {		 
		return assetService.getAssetById(id);
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE) 
	public void deleteAssetById(@PathVariable("id") int id, HttpServletResponse response) {
		assetService.deleteAssetById(id);		
		//return "redirect:/";
		try {
			response.sendRedirect("/");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
	public void updateAsset(@RequestBody Asset asset) {
		assetService.updateAsset(asset);
	}
	
	@RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public void insertAsset(@RequestBody Asset asset, HttpServletResponse response) {
		assetService.insertAsset(asset);
		try {
			response.sendRedirect("/");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
