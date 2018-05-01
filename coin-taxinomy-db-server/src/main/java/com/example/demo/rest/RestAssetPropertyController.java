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
import com.example.demo.model.AssetProperty;
import com.example.demo.service.AssetPropertyService;
import com.example.demo.service.KeywordAssetArticleService;



@RestController
@RequestMapping("/asset-propertys")
public class RestAssetPropertyController {
	
	@Autowired
	private AssetPropertyService assetPropertyService;
	
	@RequestMapping(method = RequestMethod.GET)
	public Collection<AssetProperty> getAllAssetPropertys() {		
		
		return assetPropertyService.getAllAssetPropertys();
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET) 
	public AssetProperty getAssetPropertyById(@PathVariable("id")int id) {		 
		return assetPropertyService.getAssetPropertyById(id);
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE) 
	public void deleteAssetPropertyById(@PathVariable("id") int id, HttpServletResponse response) {
		assetPropertyService.deleteAssetPropertyById(id);		
		//return "redirect:/";
		try {
			response.sendRedirect("/");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
	public void updateAssetProperty(@RequestBody AssetProperty AssetProperty) {
		assetPropertyService.updateAssetProperty(AssetProperty);
	}
	
	@RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public void insertAssetProperty(@RequestBody AssetProperty AssetProperty, HttpServletResponse response) {
		assetPropertyService.insertAsset(AssetProperty);
		try {
			response.sendRedirect("/");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
