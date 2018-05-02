package com.example.demo.web.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

	@RequestMapping(value={"/", "/home"}, method=RequestMethod.GET)
    public String home(Model model, HttpServletRequest httpServletRequest) {
		//model.addAttribute("isAdmin", httpServletRequest.isUserInRole("ROLE_ADMIN"));
        return "home";
    }
}
