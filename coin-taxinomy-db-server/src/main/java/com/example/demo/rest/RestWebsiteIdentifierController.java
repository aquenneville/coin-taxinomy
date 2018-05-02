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

import com.example.demo.model.WebsiteIdentifier;
import com.example.demo.service.WebsiteIdentifierService;



@RestController
@RequestMapping("/api/websiteIdentifiers")
public class RestWebsiteIdentifierController {
	
	@Autowired
	private WebsiteIdentifierService websiteIdentifierService;
	
	@RequestMapping(method = RequestMethod.GET)
	public Collection<WebsiteIdentifier> getAllWebsiteIdentifiers() {		
		
		return websiteIdentifierService.getAllWebsiteIdentifiers();
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET) 
	public WebsiteIdentifier getWebsiteIdentifierById(@PathVariable("id")int id) {		 
		return websiteIdentifierService.getWebsiteIdentifierById(id);
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE) 
	public void deleteWebsiteIdentifierById(@PathVariable("id") int id, HttpServletResponse response) {
		websiteIdentifierService.deleteWebsiteIdentifierById(id);		
		//return "redirect:/";
		try {
			response.sendRedirect("/");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
	public void updateWebsiteIdentifier(@RequestBody WebsiteIdentifier websiteIdentifier) {
		websiteIdentifierService.updateWebsiteIdentifier(websiteIdentifier);
	}
	
	@RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public void insertWebsiteIdentifier(@RequestBody WebsiteIdentifier websiteIdentifier, HttpServletResponse response) {
		websiteIdentifierService.insertWebsiteIdentifier(websiteIdentifier);
		try {
			response.sendRedirect("/");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
