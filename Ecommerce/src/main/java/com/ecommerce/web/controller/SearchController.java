package com.ecommerce.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SearchController {
	
	@RequestMapping(value = "/searchKeyword", method = RequestMethod.GET)
	public ModelAndView  showSearchProduct(Model model) {
		
		return new ModelAndView("register", "userDetailsBean",null);
	}

}
