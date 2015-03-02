package com.ecommerce.web.controller;

import java.util.List;

import org.apache.log4j.Logger;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.core.Response;

import org.json.JSONWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.ecommerce.common.JsonHelper;
import com.ecommerce.dao.RegistrationDao;
import com.ecommerce.dao.security.UserOperationsDao;
import com.ecommerce.log.EcommerceLogger;
import com.ecommerce.persistence.RegistrationBean;
 
 

@Controller
public class LoginController {

	private static final Logger logger = Logger.getLogger(LoginController.class);
	
	@Autowired
	private ApplicationContext appContext;
	@Autowired
	private RegistrationDao registrationDao;
	@Autowired
	private UserOperationsDao userOperationsDao;

	/**
	 * This Method is the starting point of webapp
	 * 
	 * @return
	 */
	@RequestMapping(value = { "/", "/welcome**" }, method = RequestMethod.GET)
	public ModelAndView welcomePage() {

		 
		
		if(logger.isDebugEnabled()){
			logger.debug("getWelcome is executed!");
			logger.info( "*********************************Welcome**********************************************");
		}
		logger.info( "*********************************Welcome**********************************************");
		 
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

		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("title", "Spring Security Custom Login Form");
		modelAndView.addObject("message", "This is protected page!");
		modelAndView.setViewName("admin");

		RegistrationDao customerDao = appContext.getBean("registrationDao",
				RegistrationDao.class);

		List listOfRegistrationBean = customerDao.findAllCustomer();

		modelAndView.addObject("usersList", listOfRegistrationBean);

		return modelAndView;

	}
	
	@RequestMapping(value = "/enableUser", method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody String enableUser( @RequestParam("userIds") String userId) {
	    // your logic here
		 
		JsonHelper helper  = new JsonHelper();
		UserOperationsDao operationsDao = appContext.getBean("userOperationsDao", UserOperationsDao.class);
		if(operationsDao.enableUser(userId)){
			return  helper.getSuccessJson().toString()  ;  
		}else{
			return  helper.getFailureJson().toString();     
			 
		}
   	 
		 
	}
	
	@RequestMapping(value = "/disableUser", method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody String disableUser( @RequestParam("userIds") String userId) {
	    // your logic here
		 
		JsonHelper helper  = new JsonHelper();
		UserOperationsDao operationsDao = appContext.getBean("userOperationsDao", UserOperationsDao.class);
		if(operationsDao.disableUser(userId)){
			return helper.getSuccessJson().toString() ;  
			 
		}else{
			   
			return helper.getFailureJson().toString()  ;   
		}
   	 
		 
	}
	
	/*@RequestMapping(value = "/enableUser", method = RequestMethod.GET)
	public ModelAndView enableUser(String userName ){
		   ModelAndView view = new ModelAndView();
		  
		   return view;
		 } */ 
	@RequestMapping(value = "/logout**", method = RequestMethod.GET)
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response){
		   ModelAndView view = new ModelAndView();
		   request.getSession().invalidate();
		   view.setViewName("hello");
		   return view;
		 }   

	/**
	 * This Method is responsible for handling the register page navigation
	 * 
	 * @return
	 */
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public ModelAndView  reggisterPage(Model model) {

		 
		//model.addObject("title", "Ecommerce Register form");
		
		  
		 return new ModelAndView("register", "userDetailsBean", new RegistrationFormBean());
		 

		 

	}

	/**
	 * This method saves the new signup data into backend
	 * 
	 * @return
	 */
	@RequestMapping(value = "/register_new", method = RequestMethod.GET)
	public ModelAndView saveRegister(@ModelAttribute ("userDetailsBean") RegistrationFormBean userDetailsBean, BindingResult result) {

		 
 
		
		ModelAndView mnv=new ModelAndView();
		mnv.setViewName("login");
		mnv.addObject("success", "Successfully Registered!!");
		  
	      try{
	    	  RegistrationDao customerDao = appContext.getBean("registrationDao", RegistrationDao.class);
	    	  RegistrationBean bean = new RegistrationBean();
	    	  bean.setCustomerName(userDetailsBean.getCustomerName() );
	    	  bean.setCustomerAge(userDetailsBean.getCustomerAge());
	    	  bean.setCustomerInterests(userDetailsBean.getCustomerInterests());
	    	  bean.setCustomerPassword(userDetailsBean.getCustomerPassword());
	    	  bean.setCustomerDescription(userDetailsBean.getCustomerDescription());
	  		customerDao.addCustomer(bean);
	      }catch(Exception ex){
	    	  ex.printStackTrace();
	      }
		
		
	      return mnv;

	}

	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public ModelAndView home(
			@RequestParam(value = "error", required = false) String error,
			@RequestParam(value = "logout", required = false) String logout) {

		ModelAndView model = new ModelAndView();
		model.setViewName("home");
		 

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