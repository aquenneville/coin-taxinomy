package com.example.demo.web.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.model.Asset;
import com.example.demo.service.AssetService;

@Controller
public class AssetController {

	@Autowired
	private AssetService assetService;
	
	@RequestMapping(value={"/assets"}, method = RequestMethod.GET)
	public Collection<Asset> getAllAssets() {		
		
		return assetService.getAllAssets();
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET) 
	public Asset getAssetById(@PathVariable("id")int id) {		 
		return assetService.getAssetById(id);
	}
}
