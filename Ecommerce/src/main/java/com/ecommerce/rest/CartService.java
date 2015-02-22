package com.ecommerce.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

import com.ecommerce.dao.ProductDao;

@Path("/doAddtoCart")
public class CartService {
	
	   @Autowired
		private ApplicationContext appContext;
		 @Autowired
		private ProductDao productDao;  
		 
	@GET
	@Path("/{param}")
	public Response addToCart(@PathParam("param") String msg) {
 
		String output = "Jersey say : " + msg;
		
		
		 try{
	    	  ProductDao customerDao = appContext.getBean("productDao", ProductDao.class);
	    	 
	  		 
	  		  
	  		  
	  		
	      }catch(Exception ex){
	    	  ex.printStackTrace();
	      } 
 
		return Response.status(200).entity(output).build();
 
	}
}
