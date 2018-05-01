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

import com.example.demo.model.PersonOfInterest;
import com.example.demo.service.PersonOfInterestService;



@RestController
@RequestMapping("/persons")
public class RestPersonOfInterestController {
	
	@Autowired
	private PersonOfInterestService personOfInterestService;
	
	@RequestMapping(method = RequestMethod.GET)
	public Collection<PersonOfInterest> getAllPersonOfInterests() {		
		
		return personOfInterestService.getAllPersonOfInterests();
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET) 
	public PersonOfInterest getPersonOfInterestById(@PathVariable("id")int id) {		 
		return personOfInterestService.getPersonOfInterestById(id);
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE) 
	public void deletePersonOfInterestById(@PathVariable("id") int id, HttpServletResponse response) {
		personOfInterestService.deletePersonOfInterestById(id);		
		//return "redirect:/";
		try {
			response.sendRedirect("/");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
	public void updatePersonOfInterest(@RequestBody PersonOfInterest personOfInterest) {
		personOfInterestService.updatePersonOfInterest(personOfInterest);
	}
	
	@RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public void insertPersonOfInterest(@RequestBody PersonOfInterest personOfInterest, HttpServletResponse response) {
		personOfInterestService.insertPersonOfInterest(personOfInterest);
		try {
			response.sendRedirect("/");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
