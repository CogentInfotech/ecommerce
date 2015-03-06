package com.ecommerce.web.controller;

import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.ecommerce.dao.CartOperationsDao;
import com.ecommerce.persistence.CartBean;

@Controller
public class CartController {

	@Autowired
	CartOperationsDao cartOperationsDao;
	
	@Autowired
	private ApplicationContext appContext;
	 
	
	/**
	 * This service retrieve the cart saved in the database
	 * 
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value = "/cart", method = RequestMethod.POST)
	public ModelAndView showSearchProduct(HttpServletRequest request,
			HttpServletResponse response) {

		HttpSession session = request.getSession();
		CartOperationsDao cartOperationsDao = appContext.getBean("cartOperationsDao", CartOperationsDao.class);
		
		ModelAndView mnv = new ModelAndView();
		mnv.setViewName("cart");
		mnv.addObject("success", "Successfully Registered!!");
		List listOfCartProducts = cartOperationsDao.retrieveCart(session.getId());
		mnv.addObject("cartProducts",listOfCartProducts);
		
		int cartTotal = 0;
		for (Iterator iterator = listOfCartProducts.iterator(); iterator
				.hasNext();) {
			CartBean object = (CartBean) iterator.next();
			cartTotal += object.getProductPrice();
		}
		mnv.addObject("cartTotal",cartTotal);
		return mnv;
	}
}
