package com.ecommerce.web.controller;

import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.ecommerce.dao.CartOperationsDao;
import com.ecommerce.dao.RegistrationDao;
import com.ecommerce.persistence.CartBean;
import com.ecommerce.persistence.RegistrationBean;

@Controller
public class CheckoutController {

	
	
	@Autowired
	RegistrationDao registrationDao;
	
	@Autowired
	CartOperationsDao cartOperationsDao;
	
	@Autowired
	private ApplicationContext appContext;
	 
	
	 
	@RequestMapping(value = "/checkout", method = RequestMethod.POST)
	public ModelAndView showCheckout(HttpServletRequest request,
			HttpServletResponse response) {

		HttpSession session = request.getSession();
		CartOperationsDao cartOperationsDao = appContext.getBean("cartOperationsDao", CartOperationsDao.class);
		RegistrationDao registrationDao = appContext.getBean("registrationDao", RegistrationDao.class);
		
		ModelAndView mnv = new ModelAndView();
		mnv.setViewName("checkout");
		mnv.addObject("success", "Successfully Registered!!");
		List listOfCartProducts = cartOperationsDao.retrieveCart(session.getId());
		mnv.addObject("cartProducts",listOfCartProducts);
		String cartID = null;
		int cartTotal = 0;
		for (Iterator iterator = listOfCartProducts.iterator(); iterator
				.hasNext();) {
			CartBean object = (CartBean) iterator.next();
			cartID = object.getCartId();
			cartTotal += object.getProductPrice();
		}
		mnv.addObject("cartTotal",cartTotal);
		mnv.addObject("cartId",cartID);
		
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    String name = auth.getName(); //get logged in username
	    
	    RegistrationBean bean = registrationDao.findSpecificCustomerData(name).get( 0 );
	    mnv.addObject("cartProducts",listOfCartProducts);
	    mnv.addObject("customerName",bean.getCustomerName());
	    mnv.addObject("customerEmail",bean.getCustomerEmail());
	 
	    
		return mnv;
	}
}
