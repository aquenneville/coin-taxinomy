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
import com.example.demo.model.AssetFork;
import com.example.demo.service.AssetForkService;
import com.example.demo.service.KeywordAssetArticleService;



@RestController
@RequestMapping("/asset-forks")
public class RestAssetForkController {
	
	@Autowired
	private AssetForkService assetForkService;
	
	@RequestMapping(method = RequestMethod.GET)
	public Collection<AssetFork> getAllAssetForks() {		
		
		return assetForkService.getAllAssetForks();
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET) 
	public AssetFork getAssetForkById(@PathVariable("id")int id) {		 
		return assetForkService.getAssetForkById(id);
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE) 
	public void deleteAssetForkById(@PathVariable("id") int id, HttpServletResponse response) {
		assetForkService.deleteAssetForkById(id);		
		//return "redirect:/";
		try {
			response.sendRedirect("/");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
	public void updateAssetFork(@RequestBody AssetFork assetFork) {
		assetForkService.updateAssetFork(assetFork);
	}
	
	@RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public void insertAssetFork(@RequestBody AssetFork assetFork, HttpServletResponse response) {
		assetForkService.insertAssetFork(assetFork);
		try {
			response.sendRedirect("/");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
