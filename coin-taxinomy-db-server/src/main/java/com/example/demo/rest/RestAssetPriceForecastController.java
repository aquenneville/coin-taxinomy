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

import com.example.demo.model.AssetPriceForecast;
import com.example.demo.service.AssetPriceForecastService;



@RestController
@RequestMapping("/api/assets")
public class RestAssetPriceForecastController {
	
	@Autowired
	private AssetPriceForecastService assetPriceForecastService;
	
	@RequestMapping(method = RequestMethod.GET)
	public Collection<AssetPriceForecast> getAllAssetPriceForecasts() {		
		
		return assetPriceForecastService.getAllAssetPriceForecasts();
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET) 
	public AssetPriceForecast getAssetPriceForecastById(@PathVariable("id")int id) {		 
		return assetPriceForecastService.getAssetPriceForecastById(id);
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE) 
	public void deleteAssetPriceForecastById(@PathVariable("id") int id, HttpServletResponse response) {
		assetPriceForecastService.deleteAssetPriceForecastById(id);		
		//return "redirect:/";
		try {
			response.sendRedirect("/");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
	public void updateAssetPriceForecast(@RequestBody AssetPriceForecast assetPriceForecast) {
		assetPriceForecastService.updateAssetPriceForecast(assetPriceForecast);
	}
	
	@RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public void insertAssetPriceForecast(@RequestBody AssetPriceForecast assetPriceForecast, HttpServletResponse response) {
		assetPriceForecastService.insertAssetPriceForecast(assetPriceForecast);
		try {
			response.sendRedirect("/");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
