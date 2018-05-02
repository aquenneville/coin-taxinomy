package com.example.demo.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.example.demo.service.AssetPartnershipService;

@Controller
public class AssetPartnershipController {

	@Autowired
	AssetPartnershipService assetPartnershipService;
	
}
