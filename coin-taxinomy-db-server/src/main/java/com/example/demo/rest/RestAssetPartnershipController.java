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

import com.example.demo.model.AssetPartnership;
import com.example.demo.service.AssetPartnershipService;



@RestController
@RequestMapping("/api/asset-partnerships")
public class RestAssetPartnershipController {
	
	@Autowired
	private AssetPartnershipService assetPartnershipService;
	
	@RequestMapping(method = RequestMethod.GET)
	public Collection<AssetPartnership> getAllAssetPartnerships() {		
		
		return assetPartnershipService.getAllAssetPartnerships();
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET) 
	public AssetPartnership getAssetPartnershipById(@PathVariable("id")int id) {		 
		return assetPartnershipService.getAssetPartnershipById(id);
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE) 
	public void deleteAssetPartnershipById(@PathVariable("id") int id, HttpServletResponse response) {
		assetPartnershipService.deleteAssetPartnershipById(id);		
		//return "redirect:/";
		try {
			response.sendRedirect("/");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
	public void updateAssetPartnership(@RequestBody AssetPartnership AssetPartnership) {
		assetPartnershipService.updateAssetPartnership(AssetPartnership);
	}
	
	@RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public void insertAssetPartnership(@RequestBody AssetPartnership AssetPartnership, HttpServletResponse response) {
		assetPartnershipService.insertAssetPartnership(AssetPartnership);
		try {
			response.sendRedirect("/");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
