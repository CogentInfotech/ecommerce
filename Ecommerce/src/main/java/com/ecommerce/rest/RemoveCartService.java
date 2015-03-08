package com.ecommerce.rest;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

import com.ecommerce.common.JsonHelper;
import com.ecommerce.dao.CartOperationsDao;
import com.ecommerce.persistence.CartBean;
import com.ecommerce.web.bean.ShoppingCart;
import com.ecommerce.web.controller.ApplicationContextHolder;

@Path("/removeFormCart")
public class RemoveCartService {

	@Autowired
	private ApplicationContext appContext;

	@Autowired
	private CartOperationsDao cartOperationsDao;
	 
	@Autowired
	ShoppingCart shoppingCart;

	@Context
	private HttpServletRequest request;

	@GET
	@Path("/{param}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response removeCartItem(@PathParam("param") String removeFormCart) {
		
		String output = "Jersey say : " + removeFormCart;
		JsonHelper jsonHelper = new JsonHelper();
		CartBean cBean = new CartBean();
		CartOperationsDao cartOperationsDao =ApplicationContextHolder.getContext().getBean(
				CartOperationsDao.class);
		cartOperationsDao.removeFromCart(removeFormCart);
		
		return  Response.ok(jsonHelper.getSuccessJson().toString() ,MediaType.APPLICATION_JSON).build();
		 
	}
}
