package com.ecommerce.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.support.WebApplicationContextUtils;
import org.springframework.web.servlet.ModelAndView;

import com.ecommerce.dao.RegistrationDao;
import com.ecommerce.persistence.RegistrationBean;
 
 

@Controller
public class LoginController {

	@Autowired
	private ApplicationContext appContext;
	 @Autowired
	private RegistrationDao registrationDao; 

	/**
	 * This Method is the starting point of webapp
	 * 
	 * @return
	 */
	@RequestMapping(value = { "/", "/welcome**" }, method = RequestMethod.GET)
	public ModelAndView welcomePage() {

		ModelAndView model = new ModelAndView();

		model.addObject("message", "Welcome to Ecommerce POC ");
		model.setViewName("hello");
		return model;

	}

	/**
	 * This method handles the /admin requests.
	 * 
	 * @return
	 */
	@RequestMapping(value = "/admin**", method = RequestMethod.GET)
	public ModelAndView adminPage() {

		ModelAndView model = new ModelAndView();
		model.addObject("title", "Spring Security Custom Login Form");
		model.addObject("message", "This is protected page!");
		model.setViewName("admin");

		return model;

	}

	/**
	 * This Method is responsible for handling the register page navigation
	 * 
	 * @return
	 */
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String  reggisterPage(Model model) {

		 
		//model.addObject("title", "Ecommerce Register form");
		 model.addAttribute("registrationBean", new RegistrationBean()); 
		 return "register";

		 

	}

	/**
	 * This method saves the new signup data into backend
	 * 
	 * @return
	 */
	@RequestMapping(value = "/register_new", method = RequestMethod.GET)
	public ModelAndView saveRegister(@ModelAttribute RegistrationBean registrationBean) {

		ModelAndView model = new ModelAndView();
		model.addObject("title", "Ecommerce Register form");

		model.setViewName("register");
		/*EcommerceUserDetails details = new EcommerceUserDetails();
		userDetailsDao.persist(details);*/
		//ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
	      try{
	    	  RegistrationDao customerDao = appContext.getBean("registrationDao", RegistrationDao.class);
	  		customerDao.addCustomer(registrationBean);
	      }catch(Exception ex){
	    	  ex.printStackTrace();
	      }
		
		
		return model;

	}

	/**
	 * This method is responsible for login related validations
	 * 
	 * @param error
	 * @param logout
	 * @return
	 */
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView login(
			@RequestParam(value = "error", required = false) String error,
			@RequestParam(value = "logout", required = false) String logout) {

		ModelAndView model = new ModelAndView();
		if (error != null) {
			model.addObject("error", "Invalid username and password!");
		}

		if (logout != null) {
			model.addObject("msg", "You've been logged out successfully.");
		}
		model.setViewName("login");

		return model;

	}

}