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
import com.example.demo.model.Market;
import com.example.demo.service.KeywordAssetArticleService;
import com.example.demo.service.MarketService;



@RestController
@RequestMapping("/api/markets")
public class RestMarketController {
	
	@Autowired
	private MarketService marketService;
	
	@RequestMapping(method = RequestMethod.GET)
	public Collection<Market> getAllMarkets() {		
		
		return marketService.getAllMarkets();
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET) 
	public Market getMarketById(@PathVariable("id")int id) {		 
		return marketService.getMarketById(id);
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE) 
	public void deleteMarketById(@PathVariable("id") int id, HttpServletResponse response) {
		marketService.deleteMarketById(id);		
		//return "redirect:/";
		try {
			response.sendRedirect("/");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
	public void updateMarket(@RequestBody Market market) {
		marketService.updateMarket(market);
	}
	
	@RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public void insertMarket(@RequestBody Market market, HttpServletResponse response) {
		marketService.insertMarket(market);
		try {
			response.sendRedirect("/");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
