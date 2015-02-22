package com.ecommerce.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.ecommerce.web.bean.SearchBean;

@Controller
public class SearchController {
	
	@RequestMapping(value = "/searchKeyword", method = RequestMethod.GET)
	public ModelAndView  showSearchProduct(Model model) {
		
		return new ModelAndView("home", "searchBean", new SearchBean());
	}
	
	@RequestMapping(value = "/doSearch", method = RequestMethod.GET)
	public ModelAndView  doSearch(Model model) {
		
		return new ModelAndView("home", "searchBean", new SearchBean());
	}
	

}
