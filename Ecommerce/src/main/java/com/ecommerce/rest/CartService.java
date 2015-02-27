package com.ecommerce.rest;

import java.util.List;

import javassist.bytecode.Descriptor.Iterator;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

import com.ecommerce.common.JsonHelper;
import com.ecommerce.dao.ProductDao;
import com.ecommerce.persistence.ProductBean;
import com.ecommerce.web.bean.ShoppingCart;
import com.ecommerce.web.controller.ApplicationContextHolder;

@Path("/doAddtoCart")
public class CartService {

	@Autowired
	private ApplicationContext appContext;

	@Autowired
	private ProductDao productDao;

	/*
	 * one to one mapping session id-> cart, cart is stored in session.
	 */
	@Autowired
	ShoppingCart shoppingCart;

	@Context
	private HttpServletRequest request;

	@GET
	@Path("/{param}")
	public Response addToCart(@PathParam("param") String msg) {

		String output = "Jersey say : " + msg;
		JsonHelper jsonHelper = new JsonHelper();
		try {
			if (null == request.getSession().getAttribute(
					request.getSession().getId() + "Cart")) {
				shoppingCart = ApplicationContextHolder.getContext().getBean(
						"shoppingCart", ShoppingCart.class);
			} else {

				shoppingCart = (ShoppingCart) request.getSession()
						.getAttribute(request.getSession().getId() + "Cart");
			}

			List<ProductBean> listOfProducts = (List) request.getSession()
					.getAttribute(request.getSession().getId());

			for (ProductBean bean : listOfProducts) {
				if (msg.equalsIgnoreCase(bean.getProductId())) {
					shoppingCart.getListOfProductBeans().add(bean);
					request.getSession()
							.setAttribute(
									request.getSession().getId() + "Cart",
									shoppingCart);
					return Response.ok(
							jsonHelper.getAddtoCartOperationsArray(true,shoppingCart.getListOfProductBeans().size())
									.toString(), MediaType.APPLICATION_JSON)
							.build();
				}

			}

		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return Response.ok(
				jsonHelper.getAddtoCartOperationsArray(false,0).toString(),
				MediaType.APPLICATION_JSON).build();

	}
}
