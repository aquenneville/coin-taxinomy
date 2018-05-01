package com.example.demo.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.model.PersonOfInterest;
import com.example.demo.persistence.PersonOfInterestMapper;

public class PersonOfInterestService {
	
		
	@Autowired
	private PersonOfInterestMapper PersonOfInterestMapper;
	
	public Collection<PersonOfInterest> getAllPersonOfInterests() {
		return this.PersonOfInterestMapper.selectAll();
	}
	
	public PersonOfInterest getPersonOfInterestById(int id) {
		return this.PersonOfInterestMapper.selectById(id);
	}

	public void deletePersonOfInterestById(int id) {
		this.PersonOfInterestMapper.deleteById(id);
	}
	
	public void updatePersonOfInterest(PersonOfInterest PersonOfInterest) {				
		this.PersonOfInterestMapper.update(PersonOfInterest);
	}

	public void insertPersonOfInterest(PersonOfInterest PersonOfInterest) {
		this.PersonOfInterestMapper.insert(PersonOfInterest);		
	}
	
}
