package com.example.demo.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.example.demo.service.OwnerPortfolioService;

@Controller
public class OwnerPortfolioController {

	@Autowired
	OwnerPortfolioService ownerPortfolioService;
	
}
